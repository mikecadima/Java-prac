
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weightIntLbs) {
		super(age, gender, weightIntLbs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub, adds Flyable implement
		System.out.println("Sparrow flying high...");
		
	}
	
	//method override = replace or redefining for chicken
//	public void fly() {
//		System.out.println("not able to fly...");
//	}
	
	

}
