package Package1;
//Assignment2 Expression is (((((10-2)+2)-2)*2)/2)
public class Expression2 
{
	public int sub1(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Sub1 result is"+c);
		return c;
		
	}
	public int sum(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("Sum result is"+z);
		return z;
		
	}
	public int sub2(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Sub2 result is"+c);
		return c;
		
	}
	public int mul(int a1,int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("Mul result is"+a3);
		return a3;
		
	}
	public void div(int d1,int d2)
	{
		int d3;
		d3=d1/d2;
		System.out.println("Div result is/Final expression result is"+d3);
				
	}
	public static void main(String[] args) 
	{
		Expression2 ob=new Expression2();
		int subResult1=ob.sub1(10,2);
		int sumResult=ob.sum(subResult1,2);
		int subResult2=ob.sub2(sumResult,2);
		int mulResult=ob.mul(subResult2,2);
		ob.div(mulResult, 2);
	}

}
