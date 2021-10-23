package exercise1;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name= name;
		this.age=age;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
