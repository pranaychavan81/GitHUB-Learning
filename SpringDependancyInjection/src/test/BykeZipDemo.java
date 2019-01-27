package test;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bike;

public class BykeZipDemo {
	
	public static void main(String[] args) {
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Zip-Bike.xml");
      Bike b=(Bike)ap.getBean("b");
      b.printData();
	}

}
