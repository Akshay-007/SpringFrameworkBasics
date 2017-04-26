package com.user.welcome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
        WelcomeMessage messageBean=(WelcomeMessage)context.getBean("welcomeMessageBean");
        System.out.println( messageBean.getMessage());
      // ApplicationContext context1=new FileSystemXmlApplicationContext("beans.xml");
        Car car=(Car)context.getBean("carObj");
        System.out.println(car.getColor());
        System.out.println(car.run());  
    }
}
