package pkg_1;

public class ClassA 
{
	public ClassA()
	{
		this(1,2,3);
		System.out.println("default constructor");
	}
	public ClassA(int a)
	{
		this(1,2,3,4);
		System.out.println("1 parameterized constructor");
	}
	public ClassA(int a, int b)
	{
		this();
		System.out.println("2 parameterized constructor");
	}
	public ClassA(int a, int b, int c)
	{
		System.out.println("3 parameterized constructor");
	}
	public ClassA(int a, int b, int c, int d)
	{
		this(1,2);
		System.out.println("4 parameterized constructor");
	}
	public static void main(String[] args) 
	{
		ClassA obj = new ClassA(1);
	}
}
