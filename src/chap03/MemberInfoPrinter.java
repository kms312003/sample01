package chap03;

public class MemberInfoPrinter {

	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			System.out.println("������ ����\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}
}
