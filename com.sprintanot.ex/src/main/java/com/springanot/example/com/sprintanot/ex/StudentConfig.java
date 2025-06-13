package com.springanot.example.com.sprintanot.ex;

import org.springframework.context.annotation.Bean;

public class StudentConfig {
	
	@Bean(name="s1")
	public Student getStudent()
	{
		Student s=new Student();
		s.setRoll(101);
		s.setName("asha");
		s.setFee(2000.00);
		return s;
	}
	
	@Bean(name="c1")
	public College getCollage()
	{
		College c = new College();
		c.setC_id(20);
		c.setC_nm("KRM");
		
		return c;
	}
	

}
