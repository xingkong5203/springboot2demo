package com.boot2test.demo.strategy.service.Impl;

import com.boot2test.demo.strategy.model.DeductionRate;
import com.boot2test.demo.strategy.model.Order;
import com.boot2test.demo.strategy.service.StrategyCharge;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算每笔收取“交易金额*固定百分比”的手续费算法
 *
 * @author xk
 * @date 2020
 */
@Service
public class StrategyWithRatio implements StrategyCharge {
    @Override
    public String calcullateCharge(Object object) {
        // 计算订单的手续费，如果不是订单，抛出异常
        if (object instanceof Order) {

            Order order = (Order) object;
            String merchantCodeId = order.getMerchantCodeId();
            // 根据merchantCodeId查询DeRateRelateMerCode，再查询DeductionRate
            List<DeductionRate> rateList = query(merchantCodeId);
            DeductionRate rate = rateList.get(0);
            String ratio = rate.getRatio();
            String maximum = rate.getMaximum();
            String minimum = rate.getMinimum();

            Float ratioF = Float.parseFloat(ratio);
            Float maximumF = (maximum == null || "".equals(maximum)) ? -1f
                    : Float.parseFloat(maximum);
            Float minimumF = (minimum == null || "".equals(minimum)) ? 0f
                    : Float.parseFloat(minimum);

            Float amountF = Float.parseFloat(order.getAmount());
            Float chargeF = amountF * ratioF;

            chargeF = chargeF < minimumF ? minimumF : chargeF;
            chargeF = (maximumF != -1f && chargeF > maximumF) ? maximumF
                    : chargeF;

            return String.valueOf(Math.round(chargeF));
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
        // 模拟每笔手续交易金额*0.005，封顶手续费10元(1000分)
        rate.setRatio("0.005");
        rate.setMaximum("1000");
        List<DeductionRate> list = new ArrayList<DeductionRate>(1);
        list.add(rate);
        return list;
    }
}
