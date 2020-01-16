package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제5] 성적 관리 프로그램
중간고사, 기말고사, 레포트, 출석점수를 입력받아서 계산하시오

조건1) (중간+기말)/2    ---> 60%
                    과제   	     ---> 20%
                    출석                ---> 20%     
조건2)  90이상 'A'학점     		
       80이상 'B'학점        		  	 
       70이상 'C'학점        		  	 
       60이상 'D'학점        		  	 
             나머지 'F'학점
조건3)
         A, B학점  ---->"excellent"     
         C, D학점  ---->"good"
         F학점    ---->"poor"

[실행결과]
중간고사를 입력하시오 : 90
기말고사를 입력하시오 : 89
과제점수를 입력하시오 : 99
출석점수를 입력하시오 : 100

성적=93.20         <---소수이하 2째자리까지
학점=A              
평가=excellent
*/
public class Practice5 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("중간고사를 입력하시오 : ");
		int mScore = Integer.parseInt(br.readLine());
		System.out.print("기말고사를 입력하시오 : ");
		int lScore = Integer.parseInt(br.readLine());
		System.out.print("과제점수를 입력하시오 : ");
		int homeWork = Integer.parseInt(br.readLine());
		System.out.print("출석점수를 입력하시오 : ");
		int attendance = Integer.parseInt(br.readLine());
		
		double score = ((mScore+lScore)/2*0.6) + (homeWork*0.2) + (attendance*0.2);
		char grade;
		String value;
		
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else {
			grade='F';
		}
		
		if(grade=='A'||grade=='B') {
			value="excellent"; 
		}else if(grade=='C'||grade=='D') {
			value="good";
		}else {
			value="poor";
		}
		
		
		System.out.println("성적="+String.format("%.2f", score));
		System.out.println("학점="+grade);
		System.out.println("평가="+value);
		

	}

}
