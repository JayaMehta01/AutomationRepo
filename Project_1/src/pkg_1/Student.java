package pkg_1;

public class Student
{
	int age = 24;
	int roll_no = 01;
	public void display1()
	{
		System.out.println("Welcome to all of you!");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
		Student a = new Student();
		a.display1();
		a.display2();
		System.out.println("My age: "+ a.age);
		System.out.println("Roll no: "+ a.roll_no);
	}
}


