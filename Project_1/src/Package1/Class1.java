package Package1;
// creating a global variable and passing local variable value to global variable and printing through main method


public class Class1 
{
int Roopa; //global variable
public void m1(int a1) // Local variable
{
	Roopa=a1;
}
public static void main(String[] args)
{
	Class1 ob=new Class1();
	ob.m1(10);
	System.out.println(ob.Roopa);
}
}