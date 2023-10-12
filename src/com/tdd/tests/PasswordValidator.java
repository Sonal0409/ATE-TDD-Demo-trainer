package com.tdd.tests;

public class PasswordValidator {
	
	public boolean isvalid(String password)
	{
		if(password.length()>=4 && password.length()<=10 
				&& password.contains("@"))
		{
			return true;
		}
		
		else if (password.contains(" ") && password.contains("$"))
		{
			return false;
		}
		return false;
	}

}
