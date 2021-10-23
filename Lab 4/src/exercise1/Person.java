package exercise1;

public class Person {
	
	private String name;
	private float age;
	Account acc;
	
	//constructor
	public Person(String name, float age, Account acc) {
		this.name= name;
		this.age=age;
		this.acc=acc;
		
	}
	
	
	
	//toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", acc=" + acc + "]";
	}
	

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	
	
}
