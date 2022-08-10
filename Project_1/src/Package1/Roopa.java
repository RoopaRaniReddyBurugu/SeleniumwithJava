package Package1;

public class Roopa
{//boundary of the class
	
	int a; //Variable
	public void Roopa()  // () indicate this is a method
	{// boundary of the method
	 System.out.println("First Class");
			
	}
public static void main(String[] args) 
{
	Roopa abc = new Roopa();
	abc.Roopa();
	abc.a=27;
	System.out.println(abc.a);
}
}
