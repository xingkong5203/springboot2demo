package com.boot2test.demo.strategy.service;

import com.boot2test.demo.strategy.model.Order;

/**
 * 订单接口
 *
 * @author xk
 * @date 2020
 */
public interface OrderService {

    Order insert(Order order);

    void update(Order order);

    void delete(String orderId);

    void query(String orderId);
}
