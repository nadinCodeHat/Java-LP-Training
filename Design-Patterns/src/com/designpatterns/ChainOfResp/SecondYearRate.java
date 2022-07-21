package com.designpatterns.ChainOfResp;

public class SecondYearRate extends InterestHandler {

    @Override
    public double applyInterest(InterestRate interestRate) {
        interestRate.setInterestRate(interestRate.getInterestRate()+ interestRate.getDeposit()*3.0);
        System.out.println("Amount 2nd Year");
        if(interestRate.getDeposit() > 15000.00 && interestRate.getDeposit()<=20000.00){
            return interestRate.getInterestRate();
        }else{
            return interestHandler.applyInterest(interestRate);
        }
    }
}
