package Day10.Ex02_Object;

//Equals 메소드가 하는 역할: 
class Student{
	int studentId;		//학번
	String studentName;	//이름
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	//equals를 오버라이딩
	
	@Override
	public boolean equals(Object obj) {
		//obj가 Student 클래스가 아니면, 다른 객체
		if (! (obj instanceof Student) ) 
			return false;
		
		Student student2 = (Student) obj;
		//학번이 같으면 같은 학생
		if ( this.studentId == student2.studentId ) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
}
public class StudentEquals {
	public static void main(String[] args) {
		Student student = new Student(1001, "김조은");
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");
		
		if (student == student2) // 이거나 , equals 쓴거나 똑같이 주솟값을 비교한거임. 
			System.out.println("student와 student2의 주소가 같습니다");
		else 
			System.out.println("student와 student2의 주소가 다릅니다");
		
		if ( student.equals(student2) )
			//student에 equals라는 메소드 정의를 안했는데 사용가능한 이유: object클래스에 있기 때문에.
			System.out.println("student와 student2는 같은 학생입니다.");
		else 
			System.out.println("student와 student2는 다른 학생입니다.");
		
		//-------------------------------------------------
		
		if (student == student3)
			System.out.println("student와 student2의 주소가 같습니다");
		else 
			System.out.println("student와 student2의 주소가 다릅니다");
		
		if ( student.equals(student3) )
			System.out.println("student와 student2는 같은 학생입니다.");
		else 
			System.out.println("student와 student2는 다른 학생입니다.");
		
	}
}
