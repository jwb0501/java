package nested;

public class AbstractMain{

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {
			@Override
			public void setName(String name) {
				this.name = name;
			}
		};
		
		InterA aa = new InterA() {
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
			
		};
	}
}
