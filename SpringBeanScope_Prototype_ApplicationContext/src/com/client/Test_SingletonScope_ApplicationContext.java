package com.client;

import org.springframework.beans.factory.BeanFactory;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.model.Student_PrototyeScope_ApplicationContext;

public class Test_SingletonScope_ApplicationContext
{
	public static void main(String[] args)
	{

		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
Student_PrototyeScope_ApplicationContext a=(Student_PrototyeScope_ApplicationContext)ac.getBean("s");
System.out.println("\n"+a);

Student_PrototyeScope_ApplicationContext a1=(Student_PrototyeScope_ApplicationContext)ac.getBean("s");
System.out.println("\n"+a1);


Student_PrototyeScope_ApplicationContext a2=(Student_PrototyeScope_ApplicationContext)ac.getBean("s");
System.out.println("\n"+a2);
		
		
	}
}
