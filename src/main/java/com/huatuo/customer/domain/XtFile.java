package com.huatuo.customer.domain;

import java.io.Serializable;

public class XtFile implements Serializable{
	private static final long serialVersionUID = -2479442021984755204L;

	private Long id;

    private Long uploaderId;

    private String uploadTime;

    private String description;

    private String fileUrl;

    private String fileName;

    private String fileExt;

    private Integer uploadType;

    private String md5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(Long uploaderId) {
        this.uploaderId = uploaderId;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt == null ? null : fileExt.trim();
    }

    public Integer getUploadType() {
        return uploadType;
    }

    public void setUploadType(Integer uploadType) {
        this.uploadType = uploadType;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uploaderId=").append(uploaderId);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", description=").append(description);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileExt=").append(fileExt);
        sb.append(", uploadType=").append(uploadType);
        sb.append(", md5=").append(md5);
        sb.append("]");
        return sb.toString();
    }
}