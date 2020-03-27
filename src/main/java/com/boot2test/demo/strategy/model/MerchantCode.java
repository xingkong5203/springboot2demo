package com.boot2test.demo.strategy.model;

import lombok.Data;

/**
 * 商户号实体
 *
 * @author xingkong
 * @time 2020
 */

public class MerchantCode {
    private String id;
    private String merchantName;
    /**
     * 扣率类型：
     * 	1每笔收取固定手续费；
     * 	2每笔按不同金额区间收取不同手续费；
     * 	3每笔按固定百分比收取手续费；
     * 	4每笔按不同金额区间根据不同百分比收取手续。
     */
    private String rateType;
    /**
     * 手续费计算类
     */
    private String chargeCalClass;
    private String others;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getChargeCalClass() {
        return chargeCalClass;
    }

    public void setChargeCalClass(String chargeCalClass) {
        this.chargeCalClass = chargeCalClass;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
