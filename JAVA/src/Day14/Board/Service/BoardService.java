package Day14.Board.Service;

import java.util.List;

import Day14.Board.DTO.Board;

public interface BoardService {		//추상메소드 정의만 해놓음 
	//게시글 목록 (메소드)
	List<Board> list();
	//게시글 조회 (메소드)
	Board select(int boardNo);
	//게시글 추가 (메소드)
	int insert(Board board);
	//게시글 수정 (메소드)
	int update(Board board);
	//게시글 삭제 (메소드)
	int delete(int boardNo);
	
}
