package com.client;

import org.springframework.beans.factory.BeanFactory;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.model.Student_PrototypeScope_ApplicationContext;

public class Test_PrototypeScope_ApplicationContext
{
	public static void main(String[] args)
	{
		//ApplicationContext work as Lazy loading if scope = prototype
		//It will create object only if getBean() method will be called.
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		ac.getBean("s");
		
		
	
	}
}
