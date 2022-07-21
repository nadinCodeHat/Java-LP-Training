package com.designpatterns.ChainOfResp;

public class FourthYearRate extends InterestHandler{
    @Override
    public double applyInterest(InterestRate interestRate) {
        interestRate.setInterestRate(interestRate.getInterestRate()+ interestRate.getDeposit()*3.4);
        System.out.println("Amount 4th year");
        return interestRate.getInterestRate();
    }
}
