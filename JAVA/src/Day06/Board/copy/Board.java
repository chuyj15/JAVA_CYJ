package Day06.Board.copy;


public class Board {
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	//Date : 날짜/시간을 다루는 클래스
	private String regDate;
	private String updDate;
	
	//생성자
	//생성자에는 boardNo가 없네??
	public Board() {
		this("제목없음", "글쓴이없음", "내용없음");
	}
	//여기 생성자에도 boardNo는 없고, Date도 매개변수로 안넣어주네. 
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;		
	}
	public Board(String title, String writer, String content, String regDate, String updDate) {
		this.title = title;
		this.writer = writer;
		this.content = content;		
		this.regDate = regDate;
		this.updDate = updDate;
	}
	
	
	//getter, setter
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUpdDate() {
		return updDate;
	}
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}
	//toString
	// :  객체를 출력할 때, 지정한 문자열 형식으로 반환하는 메소드
	// Object(최상위클래스)에 정의되어 있으며, 이를 오버라이딩하여 사용한다.
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", regDate=" + regDate + ", updDate=" + updDate + "]";
	}
}
