package Package1;
//Explicit data conversion storing float in int

public class Class6 
{
	public static void main(String args[])
	{
		float f=12.3F;
		int a;
		//a=f;  // it will not allow to store as float value is bigger than int
		a=(int)f; //explicitly converting float to int
		System.out.println(a);
	}

}
