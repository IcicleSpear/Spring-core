package com.spring.BookMangement.com.spring.Bookmagement; 

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book{
	String code;
	String name;
	double price;
	List <String> cityList;
	
	Book()
	{
		
	}
 
	public String getCode() {
		return code;
	}
 
	public void setCode(String code) {
		this.code = code;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public double getPrice() {
		return price;
	}
 
	public void setPrice(double price) {
		this.price = price;
	}
 
	public List<String> getCityList() {
		return cityList;
	}
 
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}
 
	public Book(String code, String name, double price, List<String> cityList) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.cityList = cityList;
	}
 
	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", price=" + price + ", cityList=" + cityList + "]";
	}
    
    @PostConstruct
    void start()
    {
    	System.out.println("starting ...");
    }
    	
    @PreDestroy
    void stop()
    {
    	System.out.println("ending  ...");
    }
  
}