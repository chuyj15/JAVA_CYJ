package JavaMission._15;

import java.util.ArrayList;

public class LottoCompany {
	//유일한 인스턴스 생성
	private static LottoCompany lottocompany = new LottoCompany();
	
	//생성자(프라이빗)
	private LottoCompany() {
	}
	
	//인스턴스를 가져오는 메소드 
	public static LottoCompany getInstance() {
		if (lottocompany ==null) {
			lottocompany = new LottoCompany();
		}
		return lottocompany;
	}
	
	//ArrayList<Integer> 객체를 생성하는 메소드
	public ArrayList<Integer> createLotto(){
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		return lotto;
	}
	
}
