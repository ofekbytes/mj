//package jsm.utility.temp;

// jron: fix it to somthing nice

public class Employee {

	String name;
	int age;
	float salary;

	public Employee(String name) {
		this.name = name;
		System.out.println("Name :" + name);
	}

	public void getAge(int age) {
		this.age = age;
	}

	public void getSalary(float salary) {
		this.salary = salary;
	}

	public int showAge() {
		System.out.println("Age :" + age);
		return age;
	}

	public float showSalary() {
		System.out.println("Salary :" + salary);
		return salary;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Sam");
		e1.getAge(25);
		e1.getSalary(50000);
		e1.showAge();
		e1.showSalary();

		Employee e2 = new Employee("Ross");
		e2.getAge(36);
		e2.getSalary(70000);
		e2.showAge();
		e2.showSalary();
	}
}