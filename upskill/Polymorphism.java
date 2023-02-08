package upskill;

public class Polymorphism {
	
	/*Polymorphism is the ability of an object to take on many forms.
		- Method Overloading: (Compile time Polymorphism/Static binding) Same method name with different signature to overload
		- Method Overridding: (Runtime Polymorphism/ Dynamic binding) Same method name from parent class to override
	
	
	*/
	

	public static void main(String[] args) {
		
		car();
		System.out.println();
		car(1000);
		System.out.println();
		car("Moon");
		System.out.println();
		car(2000, "Motor");
		//annualIncome();
		
		
		Polymorphism obj=new Polymorphism();
		obj.car();
		obj.annualIncome();
		
		

	}
	
	public static void car() {
		System.out.println("My car is Marcedese");
	}
	
	public static void car(int hp) {
		System.out.println("My car is Mercedese and It has hp engine "+hp);
	}
	
	public static void car(String roof) {
		System.out.println("My car is BMW and it has roof: "+roof);
	}
	
	public static  void  car(int battery, String motor) {
		System.out.println("My car is TESLA! IS HAS BATTERY : "+battery +" AND MOTOR : "+motor);
	}
	
	public void annualIncome() {
		System.out.println("My annual Income = 150000");
	}
	

}
