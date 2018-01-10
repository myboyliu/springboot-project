package com.huatuo.customer.domain;

import java.io.Serializable;

import com.huatuo.customer.base.util.ConfigProperites;

public class TwConsultAnswer implements Serializable {
	private static final long serialVersionUID = 2459533026280138246L;
    
    private String fileUrl;//文件url
    private String fileName;//文件名
    private String fileExt;//文件后缀名
    
	private Long id;

    private Long consultId;

    private Long formId;

    private Integer formType;

    private String countext;

    private String createTime;

    private Integer countextType;

    private Integer isRead;
    
    private String file;
    
    private Integer receptionFlag;//判断是否接诊
    
    private String msg;//推送消息数据
    
    
    

    public Integer getReceptionFlag() {
		return receptionFlag;
	}

	public void setReceptionFlag(Integer receptionFlag) {
		this.receptionFlag = receptionFlag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConsultId() {
        return consultId;
    }

    public void setConsultId(Long consultId) {
        this.consultId = consultId;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Integer getFormType() {
        return formType;
    }

    public void setFormType(Integer formType) {
        this.formType = formType;
    }

    public String getCountext() {
        return countext;
    }

    public void setCountext(String countext) {
        this.countext = countext == null ? null : countext.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getCountextType() {
        return countextType;
    }

    public void setCountextType(Integer countextType) {
        this.countextType = countextType;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public String getFileUrl() {
		return ConfigProperites.getImageUrl()+fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", consultId=").append(consultId);
        sb.append(", formId=").append(formId);
        sb.append(", formType=").append(formType);
        sb.append(", countext=").append(countext);
        sb.append(", createTime=").append(createTime);
        sb.append(", countextType=").append(countextType);
        sb.append(", isRead=").append(isRead);
        sb.append(", receptionFlag=").append(receptionFlag);
        sb.append(", msg=").append(msg);
        sb.append("]");
        return sb.toString();
    }
}