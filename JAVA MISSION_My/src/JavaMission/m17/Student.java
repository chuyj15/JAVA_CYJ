package JavaMission.m17;

public class Student {
	String name;
	int classnum;
	int sit;
	
	public Student(String name, int classnum, int sit) {
		super();
		this.name = name;
		this.classnum = classnum;
		this.sit = sit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassnum() {
		return classnum;
	}

	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}

	public int getSit() {
		return sit;
	}

	public void setSit(int sit) {
		this.sit = sit;
	}
	
	
}
