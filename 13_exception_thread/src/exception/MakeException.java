package exception;

//개발자가 만든 Exception클래스
public class MakeException extends Exception {
	private String errorMsg;
	
	public MakeException() {}

	public MakeException(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String toString() {
		//return errorMsg;
		return getClass()+errorMsg;
	}
	
	
	

	
}
