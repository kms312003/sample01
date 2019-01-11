package chap06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx
		= new AnnotationConfigApplicationContext(JavaConfig.class);

		System.out.println("start====================");
		
		Client2 client = ctx.getBean("client2", Client2.class);
		client.send();
		System.out.println("end======================");
		ctx.close();
	}
}
