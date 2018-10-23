package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.missu.cab.car.Car;

import beans.Car1;
import beans.Car2;
import beans.Test;

public class Client {

	public static void main(String[] args) {
		// Resource r = new ClassPathResource("Resources/spring.xml");
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("Resources/spring2.xml");
		
		Car2 c1 = (Car2)factory.getBean("c");
		c1.hello();
		

	}
}
