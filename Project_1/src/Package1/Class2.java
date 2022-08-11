package Package1;
//Keeping local and Global variable name same

public class Class2 
{
	int Roopa; // Global variable
	public void m1(int Roopa) // Local variable
	{
		Roopa=Roopa;
	}
public static void main(String[] args)
{
	Class2 ob=new Class2();
	ob.m1(10);
	System.out.println(ob.Roopa);
}
}

//when the local and global variables names are same it is not able to differentiate ,in this case it will print default int value 0
