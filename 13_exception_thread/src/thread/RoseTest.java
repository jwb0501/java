package thread;

public class RoseTest extends Thread{
	private String name;
	
	
	public RoseTest(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+"\t"+Thread.currentThread());
		}
		
		System.out.println(name+ " 종료");
	}


	public static void main(String[] args) {
		RoseTest aa = new RoseTest("안락");//스레드 생성
		RoseTest bb = new RoseTest("행복");
		RoseTest cc = new RoseTest("쾌락");
		
		aa.setName("안락");
		bb.setName("행복");
		cc.setName("쾌락");
		
		//우선순위 1~10, default는 5
//		aa.setPriority(10);
//		bb.setPriority(1);
//		cc.setPriority(1);
		
		aa.start();//스레드 시작 - 스레드 실행(운영체제)
		try {
			aa.join();//스레드를 실행하고 해당 스레드가 멈출때까지 기다린다
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		bb.start();
		cc.start();
		

	}

}
