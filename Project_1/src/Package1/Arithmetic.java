package Package1;

public class Arithmetic 
{
public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
}
public int sub(int x,int y) 
{
	int z;
	z=x-y;
	System.out.println("sub result is"+z);
	return z;
}
public void multi(int a1,int a2)
{
	int a3;
	a3=a1*a2;
	System.out.println("final result is"+a3);
}
public static void main(String[] args) 
	{
		Arithmetic ob=new Arithmetic();
		int sumResult=ob.sum(10,12);
		int subResult=ob.sub(10,2);
		ob.multi(sumResult, subResult);
	}

	
}

