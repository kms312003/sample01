package chap04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:chap04/appCtx2.xml");
		
		MemberRegisterService regSvc
		= ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter
		= ctx.getBean("infoPrinter", MemberInfoPrinter.class);
		
		RegisterRequest reqReq = new RegisterRequest();
		reqReq.setEmail("madvirus@madvirus.net");
		reqReq.setName("�ֹ���");
		reqReq.setPassword("1234");
		reqReq.setConfirmPassword("1234");
		regSvc.regist(reqReq);
		infoPrinter.printMemberInfo("madvirus@madvirus.net");
	}

}
