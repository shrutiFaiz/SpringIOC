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
		
		//When we call getBean method then only constructor will call. Comment getBean method.  
		//It will not create object. Object will bw created only when we call getBean method
		//This is called Lazy loading 
		bf.getBean("s");
		
	}
}
