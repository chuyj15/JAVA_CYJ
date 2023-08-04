package Day09.Ex01_TryCatch;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCast {
	//(부모 클래스)    (자식 클래스)
	//Animal   <---- Dog, Cat
	//Animal = Cat으로 업캐스팅한 이후에
	//다시 Animal을 Dog로 다운캐스팅할 수 없다.
	// - Cat을 Dog로 타입 변환할 수 없다.
	public static void changeToDog(Animal animal) { //인자로 전달되는 과정에서 업캐스팅
		//예외 메세지:  java.lang.ClassCastException: 
		try {
			Dog dog = (Dog) animal;	//다운캐스팅
		} catch (ClassCastException e) {
			System.err.println("Cat을 Dog로 변환할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeToDog(dog);
		
		Cat cat = new Cat();
		changeToDog(cat);
		
	}
	
	
}
