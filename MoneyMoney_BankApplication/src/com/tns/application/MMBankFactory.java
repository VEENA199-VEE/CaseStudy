package com.tns.application;


import com.tns.framework.BankFactory;

import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int AccNO, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return new MMSavingAcc(AccNO, accNm, accBal, isSalaried);
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNO, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return new MMCurrentAcc(AccNO, accNm, accBal, creditLimit);
	}
    @Override
    public String toString() {
    	return "MMBankFactory [toString()=" + super.toString()+"]";
   
    }
}


