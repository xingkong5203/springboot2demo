package com.boot2test.demo.order;

import org.springframework.stereotype.Component;

@Component
public class ShippedAlreadyOrderState implements OrderState {
    @Override
    public Object orderService() {
        System.out.println(">>>切换为已经发货状态..");
        return "已经发货..";
    }
}
