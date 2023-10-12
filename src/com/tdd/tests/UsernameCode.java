package com.tdd.tests;

public class UsernameCode {

	public boolean isValidUserName(String name) {
		// TODO Auto-generated method stub
		
		if(name.contains("/") || name.contains("#") || name.contains("_") || name.contains(" ") || name.contains("@"))
		{
		return false;
	}

		else if(name.contains("123"))
	{
		return true;
	}
		else
			return true;
		
	}

}
