package com.boot2test.demo.strategypattern;

import lombok.Data;

@Data
public class PayResult {
    private String code;
    private boolean success;
    private String msg;

    public PayResult(String code, boolean success, String msg) {
        this.code = code;
        this.success = success;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PayResult [code=" + code + ", success=" + success + ", mag=" + msg + "]";
    }
}
