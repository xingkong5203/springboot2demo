package com.boot2test.demo.strategypattern;

public enum PayType {

    ALIPAY(new Alipay()),
    JDPAY(new Jdpay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
