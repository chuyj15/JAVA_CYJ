package JavaMission.m15;
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

public class _15 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Numbber nummber = new Numbber();
		Date ddate = new Date();
		ArrayList<ArrayList<Integer>> bigAL = new ArrayList<>();
		ArrayList<Integer> abc = new ArrayList<Integer> ();
		int a = 65;
		ArrayList<String> automanu = new ArrayList<String> ();
		
		System.out.print("몇 게임?");
		int n = sc.nextInt();
		for (int i = 1; i < n+1; i++) {
			System.out.print("["+i+" 게임] (1.자동 / 2.수동) : ");
			int what = sc.nextInt();
			switch (what) {
			case 1:
				ArrayList<Integer> d = nummber.auto();
				abc.add(a);
				a += 1;
				automanu.add("자동");
				bigAL.add(d);
				nummber.printArrayList(d);
				break;
			case 2:
				//여기에 manual();을 쓰면 한번 더돌아. 메뉴얼이.. 그래서 저 밑에 한 줄로 충분함..대박...
				ArrayList<Integer> e = nummber.manual();
				abc.add(a);
				a += 1;
				automanu.add("수동");
				bigAL.add(e);
				nummber.printArrayList(e);
				break;
			default:
				break;
			}
		}
		System.out.println("############ 인생역전 Lottoria ############");
		System.out.println("발행일\t: \t"+ ddate.now());
		System.out.println("추첨일\t: \t"+ ddate.late());
		System.out.println("지급기한\t: \t"+ ddate.lim());
		System.out.println("---------------------------");
		//
			//ArrayList<Integer>를 인덱스별로 for문을 씀
			for (int i = 0; i < bigAL.size(); i++) {
				System.out.print((char)(int) abc.get(i) +" ");
				System.out.print(automanu.get(i)+" ");
				ArrayList<Integer> f = bigAL.get(i);
				//ArrayList<Integer> 하나에 대한 프린트
				for (Integer integer : f) {
					DecimalFormat df = new DecimalFormat("00");
					String intee = df.format(integer);
					System.out.print(intee+" ");
				}
				System.out.println();
			}
			
		
		System.out.println("---------------------------");
		DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedNumber = decimalFormat.format(n*1000);
		System.out.println("금액\t\t\t  \u20A9"+ formattedNumber);
		System.out.println("#########################################");
		
		ArrayList<Integer> bb = nummber.bonus() ;
		
		System.out.println("#################### 당첨 결과 ####################");
		
		//bb랑 bigAL의 요소들이랑 중복되는 게 5개 이상 있으면 당첨이고 아니면 낙첨임. 
		
		ArrayList<Integer> 중복갯수 = new ArrayList<>();
		ArrayList<String> 당첨낙첨 = new ArrayList<>();
		//k: 가장 큰 bigAL의 인덱스
		for (int k = 0; k < bigAL.size(); k++) {
			ArrayList<Integer> f = bigAL.get(k);
			//j: bigAL의 요소 f의 인티저배열의 인덱스
			for (int j = 0; j < 6; j++) {
					//i : 보너스 7개의 인덱스
				int t=1;
				for (int i = 0; i < 7; i++) {
					if (f.get(j) == bb.get(i)) {
						중복갯수.add(k, t++);
					}  else {
						중복갯수.add(k, 0);
					}
				}
			}
			if (중복갯수.get(k) ==5 || 중복갯수.get(k) ==6) {
				당첨낙첨.add("(당첨)");
			} else {
				당첨낙첨.add("(낙첨)");
			}
		}
		
		
		//ArrayList<Integer>를 인덱스별로 for문을 씀
		for (int i = 0; i < bigAL.size(); i++) {
			System.out.print(""+ (char)(int) abc.get(i) +" ");
			System.out.print(automanu.get(i));
			ArrayList<Integer> f = bigAL.get(i);
			//ArrayList<Integer> 하나에 대한 프린트
			for (Integer integer : f) {
				DecimalFormat df = new DecimalFormat("00");
				String intee = df.format(integer);
				System.out.print(" "+intee+" ");
			}
			System.out.println(당첨낙첨.get(i));
		}
		System.out.println("#################################################");
	}
}
