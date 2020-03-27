package com.boot2test.demo.strategypattern;

public class Jdpay implements Payment{
    private int i;

    @Override
    public PayResult pay(String uid, int amount) {

        System.out.println(uid + amount);
        return null;
    }
}
