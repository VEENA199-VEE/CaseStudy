package com.tns.framework;

public abstract class BankFactory {

		 public abstract SavingAcc getNewSavingAccount(int accNO, String accNm, float accBal, boolean isSalary);
		 public abstract CurrentAcc getNewCurrentAccount(int accNO, String accNm, float accBal, float creditLimit);
		 }


