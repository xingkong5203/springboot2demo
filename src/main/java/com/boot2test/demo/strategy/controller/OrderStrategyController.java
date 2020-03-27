package com.boot2test.demo.strategy.controller;

import com.boot2test.demo.strategy.model.Order;
import com.boot2test.demo.strategy.service.Impl.OrderServiceImpl;
import com.boot2test.demo.strategy.service.OrderService;
import com.boot2test.demo.strategy.service.StrategyCharge;
import com.boot2test.demo.strategy.util.StrategySpringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderStrategyController {

    @RequestMapping("/orderOfStrategy")
    public String order(String merchantCodeId) {

        //1.使用Spring上下文获取bean中对象
        StrategyCharge strategyCharge = StrategySpringUtils.getBean(merchantCodeId, StrategyCharge.class);
        // 2.使用上下文切换到不同的状态
//        StateContext stateContext = new StateContext(orderState);
//        stateContext.switchStateOrder();

        Order order = new Order();
        order.setAmount("100");
        order.setId("123");
        order.setMerchantCodeId(merchantCodeId);

//        ContextCharge contextCharge = new ContextCharge(strategyCharge);
//        String am = contextCharge.calculateCharge(order);
//        System.out.println(am);

        try {
            OrderService orderService = new OrderServiceImpl(strategyCharge);
            Order temp = orderService.insert(order);
            System.out.println(temp.getCharge());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 如果写多重if判断的话 整个代码流程 耗时比较长   直接Spring中精准定位到策略或者是状态的话 Map get方法的时候底层是数组
        return "success";
    }
}
