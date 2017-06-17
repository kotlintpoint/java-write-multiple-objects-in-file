import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private int age;
	public Employee(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"-"+age;
	}

}
