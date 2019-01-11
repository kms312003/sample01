package chap05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx
		= new AnnotationConfigApplicationContext(JavaConfig2.class);
		
		MemberRegisterService regSvc
		= ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter
		= ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		
		RegisterRequest reqReq = new RegisterRequest();
		reqReq.setEmail("madvirus@madvirus.net");
		reqReq.setName("ÃÖ¹ü±Õ");
		reqReq.setPassword("1234");
		reqReq.setConfirmPassword("1234");
		regSvc.regist(reqReq);
		
		infoPrinter.printMemberInfo("madvirus@madvirus.net");
	}
}
