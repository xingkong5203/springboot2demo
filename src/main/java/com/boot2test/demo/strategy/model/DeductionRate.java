package com.boot2test.demo.strategy.model;

import lombok.Data;

/**
 * 扣率实体
 *
 * @author xingkong
 * @time 2020
 */

public class DeductionRate {

    private String id;
    /**
     * 资金范围开始值
     */
    private String rangeBottom;
    /**
     * 资金范围结束值
     */
    private String rangeTop;
    /**
     * 扣率，(0,1)之间表示百分比，大于等于1表示每交易扣款金额(单位为分)
     */
    private String ratio;
    /**
     * 最大值
     */
    private String maximum;
    /**
     * 最小值
     */
    private String minimum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRangeBottom() {
        return rangeBottom;
    }

    public void setRangeBottom(String rangeBottom) {
        this.rangeBottom = rangeBottom;
    }

    public String getRangeTop() {
        return rangeTop;
    }

    public void setRangeTop(String rangeTop) {
        this.rangeTop = rangeTop;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }
}
