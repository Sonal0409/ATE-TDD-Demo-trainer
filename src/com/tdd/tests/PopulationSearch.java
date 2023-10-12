package com.tdd.tests;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {
	

	private Map<String, Integer> getpopulationStatistic()
	{
		Map<String, Integer> populationMap = new HashMap<>();
		populationMap.put("Bangalore", 200000);
		populationMap.put("Mumbai", 500000);
		populationMap.put("Pune", 400000);
		populationMap.put("Delhi", 1000000);
		
		return populationMap;
		
	}

	public int getPopulation(String city) {
		
		// condition 1 : if user is not giving any city an exception should be thrown
		// Condition 2: if the city is not in DB, an exception should be thrown
		Map<String, Integer> populationMap = null;
		int populationCount =0;
		if(city.isEmpty())
		{
			throw new NullPointerException("City name shouldnot be empty");
		}
		populationMap = getpopulationStatistic();
		
		if(!populationMap.containsKey(city))
			
		{
			throw new NullPointerException("City name is invalid");
		}
		else
		{
			populationCount = populationMap.get(city);
		}
		return populationCount;	
		
		
	}

}
