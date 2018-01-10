package com.huatuo.customer.domain;

public class PayOrderWithBLOBs extends PayOrder {
    private String customerRemark;

    private String goodsRemark;

    public String getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark == null ? null : customerRemark.trim();
    }

    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark == null ? null : goodsRemark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerRemark=").append(customerRemark);
        sb.append(", goodsRemark=").append(goodsRemark);
        sb.append("]");
        return sb.toString();
    }
}