package com.boot2test.demo.order;

import org.springframework.stereotype.Component;

@Component
public class AlreadySignedOrderState implements OrderState {

    @Override
    public Object orderService() {

        System.out.println(">> 切换已经签收状态");
        return "切换已经签收状态";
    }
}
