package com.client;

import org.springframework.beans.factory.BeanFactory;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.model.Student_SingletonScope_BeanFactory;

public class Test_SingletonScope_BeanFactory
{
	public static void main(String[] args)
	{

		Resource r=new ClassPathResource("beans.xml");
		BeanFactory bf= new XmlBeanFactory(r);
		
		Student_SingletonScope_BeanFactory s1=(Student_SingletonScope_BeanFactory)bf.getBean("s");
		System.out.println("\n"+s1);
		
		Student_SingletonScope_BeanFactory s2=(Student_SingletonScope_BeanFactory)bf.getBean("s");
		System.out.println("\n"+s2);
		
		
		
		
	}
}
