package com.designpatterns.ChainOfResp;

public class InterestRate {
    private double deposit;
    private double interestRate;

    protected void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public InterestRate(double deposit) {
        this.deposit = deposit;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
