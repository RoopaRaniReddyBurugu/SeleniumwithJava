package Package1;
//Assignment 1 (((((10+2)+2)-2)*2)/2
public class Expression
{
public int sum(int a,int b)
{
int c;
c=a+b+b;
System.out.println("print sum result is"+c);
return c;
}
public int sub(int x,int y)
{ 
	int z;
	z=x-y;
	System.out.println("print sub result is"+z);
	return z;
}
public int mul(int a1,int a2)
{
	int a3;
	a3=a1*a2;
	System.out.println("print mul result is"+a3);
	return a3;
}
public void div(int b1,int b2)
{
int b3;
b3=b1/b2;
System.out.println("print div result is "+b3);	
}
public static void main(String[] args)
{
Expression ob=new Expression();
	int sumResult=ob.sum(10, 2);
	int subResult=ob.sub(sumResult, 2);
	int mulResult=ob.mul(subResult, 2);
	ob.div(mulResult, 2);
}
}


