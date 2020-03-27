package com.boot2test.demo.strategy.model;

import lombok.Data;

/**
 * 扣率和商户编码关联关系
 *
 * @author xingkong
 * @date 2020
 */
@Data
public class DeRateRelateMerCode {
    private String id;
    /**
     * 扣率ID
     */
    private String decutionRateId;
    /**
     * 商户编号ID
     */
    private String merchantCodeId;
}
