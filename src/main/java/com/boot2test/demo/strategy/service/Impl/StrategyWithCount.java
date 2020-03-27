package com.boot2test.demo.strategy.service.Impl;

import com.boot2test.demo.strategy.model.DeductionRate;
import com.boot2test.demo.strategy.model.Order;
import com.boot2test.demo.strategy.service.StrategyCharge;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算每笔收取固定金额手续费的算法
 *
 * @author xk
 * @date 2020
 */
@Service
public class StrategyWithCount implements StrategyCharge {

    @Override
    public String calcullateCharge(Object object) {
        // 计算订单的手续费，如果不是订单，抛出异常
        if (object instanceof Order) {

            Order order = (Order) object;
            String merchantCodeId = order.getMerchantCodeId();
            // 根据merchantCodeId查询DeRateRelateMerCode，再查询DeductionRate
            List<DeductionRate> rateList = query(merchantCodeId);
            DeductionRate rate = rateList.get(0);

            return rate.getRatio();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * 模拟查询
     *
     * @param merchantCodeId
     * @return
     */
    private List<DeductionRate> query(String merchantCodeId) {
        // 需要实现
        DeductionRate rate = new DeductionRate();
        rate.setId("123");
        // 模拟每笔收取0.5元(即50fen)的手续费
        rate.setRatio("50");
        List<DeductionRate> list = new ArrayList<DeductionRate>(1);
        list.add(rate);
        return list;
    }
}
