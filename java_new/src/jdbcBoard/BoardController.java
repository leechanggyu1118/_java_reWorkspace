package jdbcBoard;


import java.util.List;
import java.util.Scanner;





public class BoardController {

	private Scanner scan;
	private Service svc; // interface로 만듦
	private boolean flag; //종료변수
	
	public BoardController() {
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl(); //service 구현체
		flag = true;
		printMenu();
	}

	private void printMenu() {
		while(flag) {
			System.out.println("--게시판프로그램--");
			System.out.println("1.게시글추가 | 2.게시글검색 | 3.게시글수정 ");
			System.out.println("4.게시글삭제 | 5.게시글출력 | 6.종료");
			System.out.println("메뉴선택 >");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1: addBoard(); break;
			case 2: searchBoard(); break;
			case 3: modifyBoard(); break;
			case 4: removeBoard(); break;
			case 5: printBoard(); break;

			default:
				flag = false;
				break;
			}

			
			
		}
		
	}

	private void printBoard() {
		// 게시글 출력
		List<BoardVO> bl = svc.getList();
		for(BoardVO a : bl) {
			System.out.println(a);
		}
		
		
	}

	private void removeBoard() {
		// 게시글 제거
		System.out.println("제거할 번호 :");
		int bno = scan.nextInt();
		// service에게 등록을 요청하는 메서드 작성
		int isOk = svc.remove(bno);
		//잘 되면 1, 안 되면 0
		System.out.println("상품등록 "+((isOk >0)? "성공" : "실패 "));
	}

	private void modifyBoard() {
		// 게시글 수정
		System.out.println("수정할 번호 :");
		int bno = scan.nextInt();
		System.out.println("제목: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("작성자: ");
		String writer = scan.nextLine();
		System.out.println("내용: ");
		String content = scan.nextLine();
		BoardVO a = new BoardVO(bno, title, writer, content);
		int isOk = svc.modify(a);
		//잘 되면 1, 안 되면 0
		System.out.println("상품등록 "+((isOk >0)? "성공" : "실패 "));
		
	}

	private void searchBoard() {
		// 게시글 검색
		System.out.println("출력할 번호 :");
		int bno = scan.nextInt();
		BoardVO b = svc.getsearchBoard(bno);
		System.out.println(b);
	}

	private void addBoard() {
		// 게시글 추가;
		
		System.out.println("제목: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("작성자: ");
		String writer = scan.nextLine();
		System.out.println("내용: ");
		String content = scan.nextLine();
//		LocalDateTime today = LocalDateTime.now();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
//		String regdate = dtf.format(today);
//		String moddate = regdate;
		BoardVO b = new BoardVO(title, writer, content);
		// service에게 등록을 요청하는 메서드 작성
		int isOk = svc.addBoard(b);
		//잘 되면 1, 안 되면 0
		System.out.println("상품등록 "+((isOk >0)? "성공" : "실패 "));
		
		
		
	}
	
	
}
