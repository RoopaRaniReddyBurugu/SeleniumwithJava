package Package1;

public class ClassthisparamMethod 

	{
	public void m1()
	{
		System.out.println("method 1");
	}
	public void m2()
	{
		this.m1();  //calling method1
		System.out.println("method 2");
		this.m3(10,20); //calling method 3
	}
	public void m3(int a,int b)
	{
		System.out.println("method 3");
	}
	public static void main(String[] args) 
	{
		Class3thismethod obj=new Class3thismethod();
		obj.m2(); //calling method2
	}
	}


