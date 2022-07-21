package com.designpatterns.ChainOfResp;

public class FirstYearRate extends InterestHandler {
    @Override
    public double applyInterest(InterestRate interestRate) {
        interestRate.setInterestRate(interestRate.getDeposit()* 2.8);
        System.out.println("Amount 1st Year");
        if(interestRate.getDeposit()<=20000.00){
            return interestRate.getInterestRate();
        }else{
            return interestHandler.applyInterest(interestRate);
        }
    }
}