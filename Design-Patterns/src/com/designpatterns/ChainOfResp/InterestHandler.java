package com.designpatterns.ChainOfResp;

public abstract class InterestHandler {
    protected InterestHandler interestHandler;

    public void setNextInterest(InterestHandler interestHandler) {
        this.interestHandler = interestHandler;
    }

    public abstract double applyInterest(InterestRate interestRate);
}
