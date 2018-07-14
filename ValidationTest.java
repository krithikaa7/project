package com.capg.wallet.service;

import com.capg.wallet.bean.Account;
import com.capg.wallet.bean.Customer;

import junit.framework.TestCase;

public class ValidationTest extends TestCase {
Validation valid = new Validation();
Customer customer = new Customer();
Account account = new Account();
	public void testValidateName() {
		assertEquals(true, valid.validateName(customer.getName()));
		assertNotNull(customer.getName());
	}

	public void testValidateGender() {
		assertEquals(true, valid.validateGender(customer.getGender()));
		assertNotNull(customer.getGender());
	}

	public void testValidateAadhar() {
		assertEquals(true, valid.validateAadhar(customer.getAadharNo()));
		assertNotNull(customer.getAadharNo());
		
	}

	public void testValidatePhone() {
		assertEquals(true,valid.validatePhone(customer.getPhoneNo()));
		assertNotNull(customer.getPhoneNo());
	}

	public void testValidateUsername() {
		assertEquals(true,valid.validateUsername(customer.getUsername()));
		assertNotNull(customer.getUsername());
	}

	public void testValidateAccountType() {
		assertEquals(true,valid.validateAccountType(account.getAccountType()));
		assertNotNull(account.getAccountType());
	}

}
