package com.boot2test.demo.order;

import org.springframework.stereotype.Component;

@Component
public class InTransitOrderState implements OrderState {
    @Override
    public String orderService() {
        System.out.println(">>>切换为正在运送状态...");
        return "success";
    }
}
