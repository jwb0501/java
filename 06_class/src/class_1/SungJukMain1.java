package class_1;

public class SungJukMain1 {
	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		aa.setName("ȫ�浿");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		aa.calc();// ����, ��հ��, ����
		System.out.println(aa.getName()+"\t"+aa.getKor()+"\t"+aa.getEng()+"\t"+aa.getMath()+"\t"+aa.getTot()+"\t"+String.format("%.2f", aa.getAvg())+"\t"+aa.getGrade());
	
		SungJuk bb = new SungJuk();
		bb.setName("��ġ");
		bb.setKor(80);
		bb.setEng(81);
		bb.setMath(85);
		bb.calc();// ����, ��հ��, ����
		System.out.println(bb.getName()+"\t"+bb.getKor()+"\t"+bb.getEng()+"\t"+bb.getMath()+"\t"+bb.getTot()+"\t"+String.format("%.2f", bb.getAvg())+"\t"+bb.getGrade());
	
		SungJuk cc = new SungJuk();
		cc.setName("�ڳ�");
		cc.setKor(95);
		cc.setEng(70);
		cc.setMath(80);
		cc.calc();// ����, ��հ��, ����
		System.out.println(cc.getName()+"\t"+cc.getKor()+"\t"+cc.getEng()+"\t"+cc.getMath()+"\t"+cc.getTot()+"\t"+String.format("%.2f", cc.getAvg())+"\t"+cc.getGrade());
	}

}
