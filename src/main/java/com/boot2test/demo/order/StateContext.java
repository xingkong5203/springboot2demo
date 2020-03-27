package com.boot2test.demo.order;

public class StateContext {
    private OrderState orderState;

    public StateContext(OrderState orderState) {
        this.orderState = orderState;
    }

    public void switchStateOrder() {
        orderState.orderService();
    }
}
