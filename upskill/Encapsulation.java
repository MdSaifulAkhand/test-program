package upskill;

public class Encapsulation {
	//Encapsulation used to hide the data using setter and getter method
	
	private String  name = "Upskill";
	private int ssn = 438747282;
	private String userName="Saiful";
	private int age;
	private String city;
	
	public static void main(String [] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Sai");
		System.out.println(obj.getName());
		System.out.println(obj.getUserName());
		obj.setAge(28);
		System.out.println(obj.getAge());
		obj.setCity("Chandpur");
		System.out.println(obj.getCity());
		
		
		
	}
	
	public void setCity(String c) {
		city=c;
	}
	public String getCity() {
		return city;
	}
	
	public void setName(String value) {
		name=value;
	}
	public String getName() {
		return name;
	}
	
	public void setSsn(int value) {
		ssn=value;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	

}
