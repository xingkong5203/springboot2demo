package com.boot2test.demo.strategypattern;

public class strategypatternTest {

    public static void main(String[] args) {

        Order order = new Order("11", "55", 90);
        order.pay(PayType.ALIPAY);

        Order order1 = new Order("22", "66", 80);
        order1.pay(PayType.JDPAY);
    }
}
