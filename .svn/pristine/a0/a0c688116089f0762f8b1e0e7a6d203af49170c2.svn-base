package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtMessageCenter implements Cloneable ,Serializable {
	
	private static final long serialVersionUID = 455165L;
	
    private String messageCenterId;

    private String title;

    private Integer type;

    private Integer state;

    private String content;

    private String sponsorUserId;

    private String sponsorUserName;

    private String receiveUserId;

    private String receiveUserName;

    private String createTime;

    private String updateTime;
    public XtMessageCenter clone()   
    {   
        Object o=null;   
        try   
        {   
            o=super.clone();   
        }   
        catch(CloneNotSupportedException e)   
        {   
            System.out.println(e.toString());   
        }   
        return (XtMessageCenter)o;   
    }   
    public String getMessageCenterId() {
        return messageCenterId;
    }

    public void setMessageCenterId(String messageCenterId) {
        this.messageCenterId = messageCenterId == null ? null : messageCenterId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }


    public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }


    public String getSponsorUserName() {
        return sponsorUserName;
    }

    public void setSponsorUserName(String sponsorUserName) {
        this.sponsorUserName = sponsorUserName == null ? null : sponsorUserName.trim();
    }


    public String getSponsorUserId() {
		return sponsorUserId;
	}

	public void setSponsorUserId(String sponsorUserId) {
		this.sponsorUserId = sponsorUserId;
	}

	public String getReceiveUserId() {
		return receiveUserId;
	}

	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

	public String getReceiveUserName() {
        return receiveUserName;
    }

    public void setReceiveUserName(String receiveUserName) {
        this.receiveUserName = receiveUserName == null ? null : receiveUserName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageCenterId=").append(messageCenterId);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", state=").append(state);
        sb.append(", content=").append(content);
        sb.append(", sponsorUserId=").append(sponsorUserId);
        sb.append(", sponsorUserName=").append(sponsorUserName);
        sb.append(", receiveUserId=").append(receiveUserId);
        sb.append(", receiveUserName=").append(receiveUserName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
	public String toJson() {
		return "{\"content\": "+content+",\"createTime\":\""+createTime+"\",\"messageCenterId\": \""+messageCenterId+"\",\"receiveUserId\": \""+receiveUserId+"\","
				+ "\"receiveUserName\": \""+receiveUserName+"\", \"sponsorUserId\": \""+sponsorUserId+"\", \"sponsorUserName\": \""+sponsorUserName+"\", \"state\": \""+state+"\", \"title\": \""+title+"\","
						+ "\"type\": \""+type+"\",\"updateTime\": \""+updateTime+"\"}";
	}
}