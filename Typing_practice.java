package typing_practice;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class Typing_practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"Java", "mysql", "jsp", "spring"};
		
		// 셔플
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		int i=0;
		while(i<words.length) {
			System.out.println("문제  : " + words[i]);
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			/*
			 * # 주의! 문자열 [비교]
			 * . 문자열 비교는 equals() 메서드를 통해 확인할 수 있다.
			 */

			if(words[i].equals(myWord)) {
				i+=1;
			}
		}
	}
}
