package Day14.Board.Service;

import java.util.List;
//비즈니스 로직 계층: BoardServiceImpl, BoardService

import Day14.Board.DAO.BoardDAO;
import Day14.Board.DTO.Board;

public class BoardServiceImpl implements BoardService {
	//이거 만든 이유: 메인에서 요청보냈던 걸 여기로 다 가져오기 위해서....라고 하시네요.
	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<Board> list() {
		List<Board> boardList = (List<Board>) boardDAO.selectList();
		//비즈니스 로직 구현
		//...
		return boardList;
	}

	@Override
	public Board select(int boardNo) {
		Board board = (Board) boardDAO.select(boardNo);
		return board;
	}

	@Override
	public int insert(Board board) {
		int result = boardDAO.insert(board);
		//*비즈니스 로직 예시
		//글 작성 성공 시, 회원에게 포인트 10점을 부여한다.
		//if (result>0) userDAO.updatePoint(10);
		return result;
	}

	@Override
	public int update(Board board) {
		int result = boardDAO.update(board);
		return result;
	}

	@Override
	public int delete(int boardNo) {
		int result = boardDAO.delete(boardNo);
		return result;
	}
	
}
