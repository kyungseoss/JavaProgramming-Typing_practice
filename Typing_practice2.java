package typing_practice2;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[2단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
 * 예)
 * 문제 : mys*l
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : *sp
 * 입력 : jsp
 * ...
 */

public class Typing_practice2 {
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
			int size = words[i].length();
			int r = ran.nextInt(size);
			System.out.print("문제  : ");
			for(int j=0; j<size; j++) {
				if(j == r) {
					System.out.print("*");
				}else {
					System.out.print(words[i].charAt(j));
				}
			}
			System.out.println();
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			/*
			 * # 주의! 문자열 [비교]
			 * . 문자열 비교는 equals() 메서드를 통해 확인할 수 있다.
			 */

			if(myWord.equals(words[i])) {
				i+=1;
			}
		}
	}
}