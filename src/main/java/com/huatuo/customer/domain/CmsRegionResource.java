package com.huatuo.customer.domain;

public class CmsRegionResource {
    private String id;

    private Integer regionId;

    private Integer promote;

    private Integer needPay;

    private Integer validatePatient;

    private String webMenu;

    private Integer recipeEncryption;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getPromote() {
        return promote;
    }

    public void setPromote(Integer promote) {
        this.promote = promote;
    }

    public Integer getNeedPay() {
        return needPay;
    }

    public void setNeedPay(Integer needPay) {
        this.needPay = needPay;
    }

    public Integer getValidatePatient() {
        return validatePatient;
    }

    public void setValidatePatient(Integer validatePatient) {
        this.validatePatient = validatePatient;
    }

    public String getWebMenu() {
        return webMenu;
    }

    public void setWebMenu(String webMenu) {
        this.webMenu = webMenu == null ? null : webMenu.trim();
    }

    public Integer getRecipeEncryption() {
        return recipeEncryption;
    }

    public void setRecipeEncryption(Integer recipeEncryption) {
        this.recipeEncryption = recipeEncryption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", regionId=").append(regionId);
        sb.append(", promote=").append(promote);
        sb.append(", needPay=").append(needPay);
        sb.append(", validatePatient=").append(validatePatient);
        sb.append(", webMenu=").append(webMenu);
        sb.append(", recipeEncryption=").append(recipeEncryption);
        sb.append("]");
        return sb.toString();
    }
}