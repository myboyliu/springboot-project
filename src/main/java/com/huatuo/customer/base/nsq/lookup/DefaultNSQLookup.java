package com.huatuo.customer.base.nsq.lookup;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.collect.Sets;
import com.huatuo.customer.base.nsq.ServerAddress;
public class DefaultNSQLookup implements NSQLookup {
    Set<String> addresses = Sets.newHashSet();
	private static final Logger logger = LoggerFactory.getLogger(DefaultNSQLookup.class);
    @Override
    public void addLookupAddress(String addr, int port) {
        if (!addr.startsWith("http")) {
            addr = "http://" + addr;
        }
        addr = addr + ":" + port;
        this.addresses.add(addr);
    }

    @Override
    public Set<ServerAddress> lookup(String topic) {
        Set<ServerAddress> addresses = Sets.newHashSet();

        for (String addr : getLookupAddresses()) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                String topicEncoded = URLEncoder.encode(topic, Charsets.UTF_8.name());
                JsonNode jsonNode = mapper.readTree(new URL(addr + "/lookup?topic=" + topicEncoded));
                logger.debug("Server connection information: " + jsonNode.toString());
                JsonNode producers = jsonNode.get("data").get("producers");
                for (JsonNode node : producers) {
                    String host = node.get("broadcast_address").asText();
                    ServerAddress address = new ServerAddress(host, node.get("tcp_port").asInt());
                    addresses.add(address);
                }
            } catch (IOException e) {
            	logger.warn("Unable to connect to address {}", addr);
            	logger.debug(e.getMessage());
            }
        }
        if (addresses.isEmpty()) {
        	logger.warn("Unable to connect to any NSQ Lookup servers, servers tried: " + this.addresses.toString());
        }
        return addresses;
    }

    public Set<String> getLookupAddresses() {
        return addresses;
    }
}
