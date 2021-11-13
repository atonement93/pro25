package com.spring.account;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class AcoountController extends MultiActionController{
	private AccountService accService;
	public void setAccService(AccountService accService) {
		this.accService = accService;
	}

}
