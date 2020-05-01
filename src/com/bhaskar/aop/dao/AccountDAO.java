package com.bhaskar.aop.dao;

import org.springframework.stereotype.Component;

import com.bhaskar.aop.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " doing my db work adding account");
	}
	
	public boolean doWork()
	{
		System.out.println(getClass() + " doing work()");
		return false;
	}
}
