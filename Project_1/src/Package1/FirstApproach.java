package Package1;

public class FirstApproach
{
	int a,b,c,d,e;
	public static void main(String[] args)
	{
		FirstApproach obj1=new FirstApproach();
		obj1.a=10; // 1 call
		obj1.b=20; // 2 call
		obj1.c=30; // 3 call
		obj1.d=40; // 4 call
		obj1.e=50; // 5 call
		System.out.println(obj1.a); // call 6
		System.out.println(obj1.b); // call 7
		System.out.println(obj1.c); // call 8
		System.out.println(obj1.d); // call 9
		System.out.println(obj1.e); // call 10
		
		FirstApproach obj2=new FirstApproach();
		obj2.a=60; // 11 call
		obj2.b=70; // 12 call
		obj2.c=80; //13 call
		obj2.d=90; // 14 call
		obj2.e=100; // 15 call
		System.out.println(obj2.a); // call 16
		System.out.println(obj2.b); // call 17
		System.out.println(obj2.c); // call 18
		System.out.println(obj2.d); // call 19
		System.out.println(obj2.e); // call 20
		
	}

}
