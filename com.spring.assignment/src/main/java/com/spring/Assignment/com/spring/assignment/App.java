package com.spring.Assignment.com.spring.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
    	//AbstractApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee e1=(Employee)con.getBean("e1");
    	Employee e2=(Employee)con.getBean("e2");
    	Employee e3=(Employee)con.getBean("e3");
    	
    	System.out.println(e1);
    	System.out.println(e2);
    	System.out.println(e3);
        
    	con.close();
    }
}
