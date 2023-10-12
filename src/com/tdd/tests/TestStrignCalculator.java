package com.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStrignCalculator {
	
	@Test
	public void passemptyString()
	{
		Stringcalculator  s1 = new Stringcalculator();
		
	      Assert.assertEquals(s1.add(""),0);
	      
	      Assert.assertEquals(s1.stringlegth("TDD"), 3);
	}


}
