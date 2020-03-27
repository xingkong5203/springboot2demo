package com.boot2test.demo.strategy.service.Impl;

import com.boot2test.demo.strategy.model.Order;
import com.boot2test.demo.strategy.service.StrategyCharge;
import org.springframework.stereotype.Service;

/**
 * 每笔按不同金额区间根据不同百分比收取手续
 *
 * @author xk
 * @date 2020
 */
@Service
public class StrategyWithRatioByStage implements StrategyCharge {
    @Override
    public String calcullateCharge(Object object) {
        // 计算订单的手续费，如果不是订单，抛出异常
        if (object instanceof Order) {
            // 算法
            return "";
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
