package com.boot2test.demo.strategypattern;

public interface Payment {
    public PayResult pay(String uid, int amount);
}
