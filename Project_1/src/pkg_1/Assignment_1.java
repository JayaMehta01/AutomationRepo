package pkg_1;

public class Assignment_1
{
	public int sum(int a, int b)
	{
	int c = a+b;
	return c;
	}
	public int sub(int a1, int b1)
	{
	int c1 = a1-b1;
	return c1;
	}
	public int mul(int a2, int b2)
	{
	int c2 = a2*b2;
	return c2;
	}
	public int div(int a3, int b3)
	{
	int c3 = a3/b3;
	return c3;
	}
	public static void main(String[] args) 
	{
		Assignment_1 abc = new Assignment_1();
		int mulRef= abc.mul(10,2);
		int sumRef= abc.sum(mulRef,2);
		int subRef= abc.sub(sumRef,2);
		int subRef2= abc.sub(subRef, 2);
		int sumRef2= abc.sum(subRef2, 2);
		int divRef= abc.div(sumRef2,2);
		System.out.println("Result: "+ divRef);
		
	}
	
}
