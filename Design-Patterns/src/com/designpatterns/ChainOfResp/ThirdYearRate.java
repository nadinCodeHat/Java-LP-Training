package com.designpatterns.ChainOfResp;

public class ThirdYearRate extends InterestHandler {
    @Override
    public double applyInterest(InterestRate interestRate) {
        interestRate.setInterestRate(interestRate.getInterestRate()+ interestRate.getDeposit()*3.2);
        System.out.println("Amount 3rd Year");
        if(interestRate.getDeposit() > 25000.00 && interestRate.getDeposit()<=30000.00){
            return interestRate.getInterestRate();
        }else{
            return interestHandler.applyInterest(interestRate);
        }
    }
}
