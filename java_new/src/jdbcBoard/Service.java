package jdbcBoard;

import java.util.List;



public interface Service {

	int addBoard(BoardVO b);


	BoardVO getsearchBoard(int bno);


	List<BoardVO> getList();


	


	int remove(int bno);


	int modify(BoardVO a);



	
}
