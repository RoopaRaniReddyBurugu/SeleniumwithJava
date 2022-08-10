package Package1;
//using constructors without using this keyword or Method display output in Assignment order
//Assignment to display in order - 4 Parameterised constructor , default,1,2,3

public class Class3Assignment1 

{
public Class3Assignment1()
{
	System.out.println("Default Method");
}
public Class3Assignment1(int a)
{
	System.out.println("One Parameterized Method");
}
public Class3Assignment1(int a,int b)
{
	System.out.println("Two Parameterized method");
}
public Class3Assignment1(int a,int b,int c)
{
	System.out.println("Three Parameterized method");
}
public Class3Assignment1(int a,int b,int c,int d)
{
	System.out.println("Four Parameterized method");
}
public static void main(String[] args) 
{
	Class3Assignment1  obj1=new Class3Assignment1(10,20,30,40);
	Class3Assignment1  obj2=new Class3Assignment1();
	Class3Assignment1  obj3=new Class3Assignment1(10);
	Class3Assignment1  obj4=new Class3Assignment1(10,20);
	Class3Assignment1  obj5=new Class3Assignment1(10,20,30);	
}
}