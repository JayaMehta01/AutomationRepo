package pkg2;

public class Assignment4 
{
	public Assignment4() 
	{
		this(33, 44, 55);
		System.out.println("default constructor");	
	}
	public Assignment4(int a) 
	{
		this();
		System.out.println("one parametrized constructor");	
	}
	public Assignment4(int a, int b) 
	{
		this(1);
		System.out.println("two parametrized constructor");	
	}
	public Assignment4(int a, int b, int c) 
	{
		System.out.println("three parametrized constructor");	
	}
	public Assignment4(int a, int b, int c, int d) 
	{
		this(22, 33);
		System.out.println("four parametrized constructor");	
	}
	public static void main(String[] args)
	{
		Assignment4 obj = new Assignment4(1,2,3,4);
	}
	
}
