package Package1;

public class SecondApproach 
{
	int a,b,c,d,e;
	public void method1(int a1,int a2,int a3,int a4,int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	public static void main(String[] args) 
	{
		SecondApproach obj1=new SecondApproach();
		obj1.method1(10,20,30,40,50); // call 1
		System.out.println(obj1.a); //call 2
		System.out.println(obj1.b); // call 3
		System.out.println(obj1.c); // call 4
		System.out.println(obj1.d); // call 5
		System.out.println(obj1.e); // call 6
		
		}

}
