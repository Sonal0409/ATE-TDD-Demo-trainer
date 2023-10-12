package com.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasepassword {
	
	@Test
	public void Testpassword()
	{
		PasswordValidator pv = new PasswordValidator();
		
		Assert.assertEquals(pv.isvalid("Xxxx@7773"),true ,"password is not valid");
	}

	@Test
	public void Testpassword2()
	{
		PasswordValidator pv = new PasswordValidator();
		
		Assert.assertEquals(pv.isvalid("xxxx5@123"), true,"password is not valid");
	}
	
	@Test
	public void Testpassword3()
	{
		PasswordValidator pv = new PasswordValidator();
		
		Assert.assertEquals(pv.isvalid("xxxx5@$5123"),true ,"password is not valid");
	}

}
