package Day14.Board.DAO;

import java.util.List;

import Day14.Board.DTO.Text;

public interface DataService {
	List<? extends Text> selectList();  //데이터 목록 조회
	List<? extends Text> selectList(int no);  // 특정 글에 해당하는 댓글 데이터 목록 조회
	Text select(int no);  //데이터 조회
	int insert(Text text); //데이터 등록
	int update(Text text); 	//데이터 수정
	int delete(int no);  //데이터 삭제

}
