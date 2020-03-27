package com.boot2test.demo.strategy;

import com.boot2test.demo.strategy.model.MerchantCode;
import com.boot2test.demo.strategy.model.Order;
import com.boot2test.demo.strategy.service.Impl.OrderServiceImpl;
import com.boot2test.demo.strategy.service.OrderService;
import com.boot2test.demo.strategy.service.StrategyCharge;

public class MainTest {
    public static void main(String[] args) {
        String merchantCodeId = "159";
        Order order = new Order();
        order.setAmount("100");
        order.setId("123");
        order.setMerchantCodeId(merchantCodeId);

        try {
            OrderService orderService = new OrderServiceImpl(
                    getContextCharge(merchantCodeId));
            Order temp = orderService.insert(order);
            System.out.println(temp.getCharge());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("rawtypes")
    static StrategyCharge getContextCharge(String merchantCodeId)
            throws InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        MerchantCode code = getMerchantCode(merchantCodeId);
        String className = code.getChargeCalClass();
        Class clazz = Class.forName(className);
        StrategyCharge charge = (StrategyCharge) clazz.newInstance();

        return charge;
    }

    static MerchantCode getMerchantCode(String merchantCodeId) {
        MerchantCode code = new MerchantCode();
        code.setId(merchantCodeId);
        code.setMerchantName("wusj");
        code.setRateType("1");
        // 测试每笔固定金额
//		code.setChargeCalClass("src.designpattern.strategy.ex2.StrategyWithCount");
        // 测试每笔固定比例，且最多可收取的手续费限额
        code.setChargeCalClass("com.boot2test.demo.strategy.service.Impl.StrategyWithRatio");
        code.setOthers("others");

        return code;
    }
}
