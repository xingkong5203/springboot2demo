package com.boot2test.demo.strategy.model;

import lombok.Data;

/**
 * 订单实体
 *
 * @author xingkong
 * @date 2020
 */

public class Order {

    private String id;
    /**
     * 交易金额（单位分）
     */
    private String amount;
    /**
     * 商户编号ID
     */
    private String merchantCodeId;
    /**
     * 手续费（单位分）
     */
    private String charge;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMerchantCodeId() {
        return merchantCodeId;
    }

    public void setMerchantCodeId(String merchantCodeId) {
        this.merchantCodeId = merchantCodeId;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
