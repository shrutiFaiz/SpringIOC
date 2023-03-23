package com.client;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.model.Student1_AppContext;

public class Test_App_Cotext {
	public static void main(String[] args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");	
		Student1_AppContext s2=(Student1_AppContext) ac.getBean("s1");
		s2.dispaly();
		
		
		
	}
}
