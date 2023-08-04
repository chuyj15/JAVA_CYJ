package Day09.Ex05_UserException;
//사용자 정의 예외 클래스
// : public class ??Exception extends Exception{}

//통장만들어서 입금출금기능 만들거임. 출금액과 잔액비교했을때 잔액이 더 커야 출금가능하고, 아닐경우 잔액이부족하다는 예외를 발생시킬거임
public class BalanceException extends Exception {

	public BalanceException() {
		super();
	}

	public BalanceException(String message) {
		super(message);
	}
	
	
	
	
}
