package JavaMission;
/*
 * ‘김조은’씨는 로또 판매점에 가서 로또를 구매합니다. 
 * 로또는 한 장에 최대 5개의 게임을 선택할 수 있으며, 
 * (자동), (수동) 방식으로 1~45 사이의 숫자 중에서 6개의 번호를 지정할 수 있습니다. 
 * <실행결과>와 같이 구매한 로또 용지를 출력하고 당첨결과도 확인할 수 있는 프로그램을 작성해보세요.
 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


class BigArrayList {
	int a = 65;
	String b= "";
	ArrayList<ArrayList<Integer>> bigArrayList = new ArrayList<ArrayList<Integer>>();
	
	public int getA() {
		return a;
	}
	public void setA(int i) {
		this.a = a+i;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "BigArrayList [a=" + a + ", b=" + b + ", bigArrayList=" + bigArrayList + "]";
	}
	
	
	
}

public class _15 {
	static Scanner sc = new Scanner(System.in);
	
	//자동
	public static ArrayList<Integer> auto() {
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		
		for (int j = 0; j <6; j++) {
			Integer temp = (int) (Math.random()*45+1);
			//중복 제거 방법
			for (int k = 0; k < j; k++) {
				if (lottoList.get(k)==temp) {
					lottoList.remove(temp);
					j--;
				}
			}
			lottoList.add(temp);
		}
		//오름차순 정렬
		Collections.sort(lottoList);
		return lottoList;
	}
	//배열을 받고 출력하는 메소드
	public static void printArrayList(ArrayList<Integer> lottoList) {
		Iterator<Integer> it = lottoList.iterator();
		while (it.hasNext()) {
			Integer item = it.next();
			System.out.print(item);
			if (it.hasNext()) System.out.print(" ");
			else System.out.println();
		}
	}
	
	//수동
	public static ArrayList<Integer> manual() {
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		char symbol = '\u2460';
		for (int i = 0; i < 6; i++) {
			System.out.print(symbol++ +" : ");
			int n = sc.nextInt();
			lottoList.add(n);
		}
		return lottoList;
	}
	//현재 발행일
	public static String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
		String today = sdf.format(cal.getTime());
		return today;
	}
	//추첨일
	public static String late() {
		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.DAY_OF_WEEK) ==7 && cal.get(Calendar.HOUR_OF_DAY) <=21 ) {
			cal.set(Calendar.HOUR_OF_DAY, 21);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			
		} else {
			cal.add(Calendar.DAY_OF_MONTH, (7-cal.get(Calendar.DAY_OF_WEEK)));	
			cal.set(Calendar.HOUR_OF_DAY, 21);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
		String today = sdf.format(cal.getTime());
		return today;
	}
	//지급기한
	public static String lim() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);	
		cal.add(Calendar.YEAR, 1);	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E)");
		String today = sdf.format(cal.getTime());
		return today;
	}
	
	//당첨 번호, 보너스 번호 
	public static void bonus() {
		ArrayList<Integer> bonu = auto();
		System.out.print("당첨 번호 : ");
		printArrayList(bonu);
		
		int bon ;
			do {
				bon = (int) (Math.random()*45+1);
			} while (bonu.contains(bon));
		System.out.println("보너스 번호: "+bon);
		
	}
	
	
	public static void main(String[] args) {
		BigArrayList bigAL = new BigArrayList();
		System.out.print("몇 게임?");
		int n = sc.nextInt();
		for (int i = 1; i < n+1; i++) {
			System.out.print("["+i+" 게임] (1.자동 / 2.수동)");
			int what = sc.nextInt();
			switch (what) {
			case 1:
				ArrayList<Integer> d = auto();
				bigAL.setA(1);
				bigAL.setB("자동");
				bigAL.bigArrayList.add(d);
				printArrayList(d);
				break;
			case 2:
				//여기에 manual();을 쓰면 한번 더돌아. 메뉴얼이.. 그래서 저 밑에 한 줄로 충분함..대박...
				ArrayList<Integer> e = manual();
				bigAL.setA(1);
				bigAL.setB("수동");
				bigAL.bigArrayList.add(e);
				printArrayList(e);
				break;
			default:
				break;
			}
		}
		System.out.println("############ 인생역전 Lottoria ############");
		System.out.println("발행일\t: "+ now());
		System.out.println("추첨일\t: "+ late());
		System.out.println("지급기한\t: "+ lim());
		System.out.println("---------------------------");
		//
		System.out.println(bigAL);
			
		
		System.out.println("---------------------------");
		DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedNumber = decimalFormat.format(n*1000);
		System.out.println("금액\t\t\t\t  \u20A9"+ formattedNumber);
		System.out.println("#########################################");
		
		bonus() ;
		
		System.out.println("#################### 당첨 결과 ####################");
		//
		
		System.out.println("#################################################");
	}
}
