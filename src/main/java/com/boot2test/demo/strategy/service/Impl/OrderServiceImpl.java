package com.boot2test.demo.strategy.service.Impl;

import com.boot2test.demo.strategy.ContextCharge;
import com.boot2test.demo.strategy.model.Order;
import com.boot2test.demo.strategy.service.OrderService;
import com.boot2test.demo.strategy.service.StrategyCharge;
import org.springframework.stereotype.Service;

/**
 * 订单接口实现类
 *
 * @author xk
 * @date 2020
 */
public class OrderServiceImpl extends ContextCharge implements OrderService {

    public OrderServiceImpl(StrategyCharge strategyCharge) {
        this.strategyCharge = strategyCharge;
    }

    @Override
    public Order insert(Order order) {
        String charge = this.calculateCharge(order);
        order.setCharge(charge);
        System.out.println("insert data");
        return order;
    }

    @Override
    public void update(Order order) {
        System.out.println("update data.");
    }

    @Override
    public void delete(String orderId) {
        System.out.println("delete data.");

    }

    @Override
    public void query(String orderId) {
        System.out.println("query data.");

    }
}
