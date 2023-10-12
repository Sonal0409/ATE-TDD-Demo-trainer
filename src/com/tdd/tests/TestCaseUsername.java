package com.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseUsername {
	
	UsernameCode obj = new UsernameCode();
	
	@Test
	public void usernameTest()
	{
		String username = "adminUser";
		String username1 = "admin/user";
		String username2 = "adminuser#";
		String username3 = "admin_user";
		String username4 = "admin user";
		String username5 = "admin@";
		Assert.assertTrue(obj.isValidUserName(username));
		Assert.assertFalse(obj.isValidUserName(username1),"It is not a valid User");
		Assert.assertFalse(obj.isValidUserName(username2),"It is not a valid User");
		Assert.assertFalse(obj.isValidUserName(username3),"It is not a valid User");
		 Assert.assertFalse(obj.isValidUserName(username4),"It is not a valid User");
		Assert.assertFalse(obj.isValidUserName(username5),"It is not a valid User");
		 
	}


}
