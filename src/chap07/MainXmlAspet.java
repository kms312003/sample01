package chap07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXmlAspet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:chap07/aopAspect.xml");
		
		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		long fiveFact1 = impeCal.factorial(5);
		System.out.println("impeCal.factorial(5) = " + fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);
	}
}
