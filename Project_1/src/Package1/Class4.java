package Package1;
//When Local and Global variable are same ,this.variablename will always point to global variable
//req-pass local variable value to global variable
public class Class4 
{
int Roopa;//Global variable
public void m1(int Roopa)//Local variable
{
	this.Roopa=Roopa;
}
public static void main(String[] args)
{
	Class4 ob=new Class4();
	ob.m1(10);
	System.out.println(ob.Roopa);
}
}

// it will pass value to the global variable