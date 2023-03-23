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

		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
Student_SingletonScope_ApplicationContext a=(Student_SingletonScope_ApplicationContext)ac.getBean("s");
System.out.println("\n"+a);

Student_SingletonScope_ApplicationContext a1=(Student_SingletonScope_ApplicationContext)ac.getBean("s");
System.out.println("\n"+a1);


Student_SingletonScope_ApplicationContext a2=(Student_SingletonScope_ApplicationContext)ac.getBean("s");
System.out.println("\n"+a2);
		
		
	}
}
