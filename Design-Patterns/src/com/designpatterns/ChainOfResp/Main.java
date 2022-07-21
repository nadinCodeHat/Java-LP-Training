package com.designpatterns.ChainOfResp;

public class Main {
    public static void main(String[] args) {
        FirstYearRate firstYearRate = new FirstYearRate();
        SecondYearRate secondYearRate = new SecondYearRate();
        ThirdYearRate thirdYearRate = new ThirdYearRate();
        FourthYearRate fourthYearRate = new FourthYearRate();

        firstYearRate.setNextInterest(secondYearRate);
        secondYearRate.setNextInterest(thirdYearRate);
        thirdYearRate.setNextInterest(fourthYearRate);

        InterestRate interestRate = new InterestRate(10000.00);
        System.out.println(firstYearRate.applyInterest(interestRate));

        InterestRate interestRate1 = new InterestRate(20000.00);
        System.out.println(firstYearRate.applyInterest(interestRate1));

        InterestRate interestRate2 = new InterestRate(30000.00);
        System.out.println(firstYearRate.applyInterest(interestRate2));

        InterestRate interestRate3 = new InterestRate(40000.00);
        System.out.println(firstYearRate.applyInterest(interestRate3));
    }
}
