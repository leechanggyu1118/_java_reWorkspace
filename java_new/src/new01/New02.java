package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		/* for문을 이용하여 1~10 짝수만 출력
		 * 
		 */
		for(int i= 1; i<=10;i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		/* 숫자를 입력받아 1부터 내가 입력한 수 까지 5의 배수를 출력
		 * 
		 */
		System.out.println("숫자를 입력>");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i =1; i<=num; i++) {
			if(i%5 == 0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
		scan.close();

	}

}
