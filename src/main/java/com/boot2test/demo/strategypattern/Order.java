package com.boot2test.demo.strategypattern;

public class Order {
    private String uid;
    private String oid;
    private int amount;

    public Order(){

    }

    public Order(String uid, String oid, int amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }

    public PayResult pay(PayType payType) {
        return payType.getPayment().pay(uid, amount);
    }
}
