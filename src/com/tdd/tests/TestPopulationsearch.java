package com.tdd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPopulationsearch {
	
	@Test
	public void findpopulation()
	{
		String city = "Mumbai";
		int expectedPopulationcount = 500000;
		
		PopulationSearch ps = new PopulationSearch();
		
		// user will pass City name, method should return count of population
			int count	=ps.getPopulation(city);
			Assert.assertEquals(count,expectedPopulationcount);
	}
	
	@Test
	public void findpopulationwithEmptyInput()
	{
		try {
		String city = "";
		int expectedPopulationcount = 0;
		
		PopulationSearch ps = new PopulationSearch();
		
		// user will pass City name, method should return count of population
			int count	=ps.getPopulation(city);
			
		}
		catch(NullPointerException e1)
		{
			System.out.println("City name should not be empty");
		}
	}
	
	@Test
	public void findpopulationwithInvalidInput()
	{
		try {
		String city = "gurgaon";
		int expectedPopulationcount = 70000;
		
		PopulationSearch ps = new PopulationSearch();
		
		// user will pass City name, method should return count of population
			int count	=ps.getPopulation(city);
			
		}
		catch(NullPointerException e1)
		{
			System.out.println("City name doesnot exist");
		}
	}

}
