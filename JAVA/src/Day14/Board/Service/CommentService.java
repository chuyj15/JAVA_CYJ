package Day14.Board.Service;

import java.util.List;
import Day14.Board.DTO.Comment;

public interface CommentService {
	
	//게시글 목록 (메소드)
	List<Comment> list();
	List<Comment> list(int boardNo);
	
	
	//게시글 조회 (메소드)
	Comment select(int commentNo);
	//게시글 추가 (메소드)
	int insert(Comment comment);
	//게시글 수정 (메소드)
	int update(Comment comment);
	//게시글 삭제 (메소드)
	int delete(int commentNo);
}
