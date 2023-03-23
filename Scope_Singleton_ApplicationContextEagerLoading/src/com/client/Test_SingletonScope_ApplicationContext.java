package com.client;

import org.springframework.beans.factory.BeanFactory;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.model.Student_SingletonScope_ApplicationContext;

public class Test_SingletonScope_ApplicationContext
{
	public static void main(String[] args)
	{
		//ApplicationContext work as Eager loading if scope = singleton
		//no need to call getBean(). It will create object once beans.xml loaded.
		//This is called Eager loading
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		
	
	}
}
