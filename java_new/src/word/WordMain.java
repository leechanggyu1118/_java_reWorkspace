package word;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException{
		/* 단어장 프로그램 작성
		 * Word 클래스 생성
		 * 단어, 의미
		 * 
		 * 메뉴
		 * 1.단어등록, 2.단어검색, 3.단어수정, 4.단어출력, 5.파일로 내보내기
		 * 6.종료
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		WordManager w = new WordManager();
		do {
		
			System.out.println("--단어장 프로그램 작성--");
			System.out.println("1.단어등록, 2.단어검색, 3.단어수정, 4.단어출력, 5.파일로 내보내기");
			System.out.println("6.종료");
			System.out.println("메뉴를 선택해주세요");
			menu =  scan.nextInt();
				switch (menu) {
				case 1: System.out.println("1.단어등록");
				w.insertWord(scan);
				break;
				case 2: System.out.println("2.단어검색");
				w.searchWord(scan);
				break;
				case 3: System.out.println("3.단어수정");
				w.modifyWord(scan);
				break;
				case 4: System.out.println("4.단어출력");
				w.printWord(scan);
				break;
				case 5: System.out.println("5.파일로 보내기");
				w.fileWord(scan);
				break;
				
				default:
					System.out.println("잘못된 메뉴선택입니다.");
					break;
				}

			System.out.println("6.프로그램 종료");
			System.out.println("프로그램이 종료되었습니다.");
			
			
			
		}while(menu != 6);
		
		
		scan.close();

	}

}
