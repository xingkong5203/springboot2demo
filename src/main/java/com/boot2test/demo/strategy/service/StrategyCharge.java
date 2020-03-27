package com.boot2test.demo.strategy.service;

/**
 * 策略接口定义
 *
 * @author xk
 * @date 2020
 */
public interface StrategyCharge {
    /**
     * 计算手续费
     *
     * @param object
     * @return 返回手续费的字符串形式，单位为分
     */
    String calcullateCharge(Object object);
}
