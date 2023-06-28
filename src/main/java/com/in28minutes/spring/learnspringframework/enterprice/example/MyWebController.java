package com.in28minutes.spring.learnspringframework.enterprice.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
	
	@Autowired
	private BusinessService businessservice;
	
	public long returnValueFromBusinessService()
	{
		return businessservice.calculateSum();
	}

}

@Component
class BusinessService
{
	
	@Autowired
	private DataService dataservice;
	public long calculateSum()
	{
	    List<Integer>data=dataservice.getData();
	    long sum=data.stream().reduce(Integer::sum).get();
	    
	    return sum;
	    
	}
}

@Component
class DataService
{
	public List<Integer> getData()
	{
		return Arrays.asList(10,20,30,40);
	}
}