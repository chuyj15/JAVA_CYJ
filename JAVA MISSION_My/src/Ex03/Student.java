package Ex03;

public class Student implements Comparable<Student>{
	//변수 선언
	int no;
	String name;
	int score;
	String className;
	//생성자
	public Student(int no, String name, int score, String className) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}
	//게터 세터
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	//toString
	
	//컴페어투 메서드
	@Override
	public int compareTo(Student o) {
		int a = this.getScore();
		int b = o.getScore();
		int gap1 = b-a;
		
		int c = this.getNo();
		int d = o.getNo();
		int gap2 = c-d;
		
		return (gap1==0) ? gap2 : gap1;
	}
	
	
}
