package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		Traveller traveller=(Traveller)context.getBean("traveller");
		System.out.println("Travel Cost is "+ traveller.getTravelCost());
		System.out.println(traveller.getVehicle().getRegNo());
	}
}
