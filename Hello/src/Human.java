
public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//constructor method always have same name as class belong in
	public Human() {
		
	}
	
	
	
	public void speak() {
		System.out.println("hello, my name is "+ name);
		//sysout ctrl+space
		System.out.println("I am "+heightInInches + " inches tall");	
		System.out.println("I am " + age + " years old");
		System.out.println("My eye color is "+ eyeColor);
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	public void walk() {
		System.out.println("walking...");
	}
	public void work() {
		System.out.println("working...");
	}
}
