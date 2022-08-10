package Package1;
// Assignment to display method in order 3 Parameterised constructor,default,4,1,2
public class Class3Assignment2 
{
public void method1()
{
	this.method4(1, 2, 3);
	System.out.println("Default constructor");
	this.method5(1, 2, 3, 4, 5);
}
public void method2(int a)
{
	
	System.out.println("One Parameterized constructor");
	this.method3(1, 2);
}
public void method3(int a,int b)
{
	System.out.println("Two parametersied constructor");

}
public void method4(int a,int b,int c)
{
	System.out.println("Three parametersied constructor");

}
public void method5(int a,int b,int c,int d,int e)
{
	System.out.println("Four parametersied constructor");
	this.method2(1);

}
public static void main(String[] args) 
{
	Class3Assignment2 obj1 = new Class3Assignment2();
	obj1.method1();
}
}
