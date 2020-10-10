//Animal is parent class
public abstract class Animal {
	int age;
	String gender;
	int weightIntLbs;
	
	public Animal(int age, String gender, int weightIntLbs) {
		this.age = age;
		this.gender = gender;
		this.weightIntLbs = weightIntLbs;
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	public void sleep() {
		System.out.println("Sleeping...");
		
	}
	//you cannot create instance of Abstract class
	public abstract void move();
}
