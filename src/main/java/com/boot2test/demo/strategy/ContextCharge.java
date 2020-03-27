package com.boot2test.demo.strategy;

import com.boot2test.demo.strategy.service.StrategyCharge;

/**
 *
 *
 * @author xk
 * @date 2020
 */
public class ContextCharge {

    protected StrategyCharge strategyCharge;

    public ContextCharge() {

    }

    public ContextCharge(StrategyCharge strategyCharge) {
        this.strategyCharge = strategyCharge;
    }

    public String calculateCharge(Object object) {
        return strategyCharge.calcullateCharge(object);
    }
}
