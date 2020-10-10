
public class Bird extends Animal{
	
	public Bird(int age, String gender, int weightIntLbs) {
		super(age, gender, weightIntLbs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("flapping wings...");
	}

//	public void fly() {
//		System.out.println("flying...");
//	}
}
