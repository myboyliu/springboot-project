package com.huatuo.customer.base.nsq.lookup;

import java.util.Set;

import com.huatuo.customer.base.nsq.ServerAddress;

public interface NSQLookup {
    Set<ServerAddress> lookup(String topic);

    void addLookupAddress(String addr, int port);
}
