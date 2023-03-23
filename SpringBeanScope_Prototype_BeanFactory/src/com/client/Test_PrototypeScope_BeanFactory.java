package com.client;

import org.springframework.beans.factory.BeanFactory;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.model.Student_PrototypeScope_BeanFactory;

public class Test_PrototypeScope_BeanFactory
{
	public static void main(String[] args)
	{

		Resource r=new ClassPathResource("beans.xml");
		BeanFactory bf= new XmlBeanFactory(r);
		
		Student_PrototypeScope_BeanFactory s1=(Student_PrototypeScope_BeanFactory)bf.getBean("s");
		System.out.println("\n"+s1+"\n");
		
		Student_PrototypeScope_BeanFactory s2=(Student_PrototypeScope_BeanFactory)bf.getBean("s");
		System.out.println("\n"+s2+"\n");
		
		
		
		
	}
}
