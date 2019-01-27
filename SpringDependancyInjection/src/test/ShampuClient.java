package test;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Shampu;

public class ShampuClient {

	public static void main(String[] args) {
		/*MethodInvokingFactoryBean m=new MethodInvokingFactoryBean();
		m.setArguments(arguments);
		m.setStaticMethod(staticMethod);*/
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/shampu.xml");
          Shampu s1=(Shampu)ap.getBean("s");
          s1.printShampu();
	}

}
