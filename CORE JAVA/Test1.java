class Test1 
{
	static int x ;
	int y;
	/*
	static int x;
	static double d;
	static String str;
*/
/*
	Variables
	   local variables:
	      1) variables are declared inside the method or constructor or blocks.
		  2) scope of the local variable within the blocks,constructor,method.
		  3) memory allocated when method starts and memory released when method is
		     completed.
		  4) local variable are stored in stack memory.
	   static variables
	   instance variables:
	      
	methods

	constructors
	Instances blocks
	static blocks
*/
	public static void main(String[] args) 
	{
		//int a = 10;
		//int b = 20;
		//System.out.println(x);
				//System.out.println(d);
				//		System.out.println(str);
		
		//System.out.println("Addition:"+(a+b));
		//System.out.println(a+"...."+b);
		//System.out.println("Hello World!");
		Test1 t = new Test1();
		System.out.println(t.x+"..."+t.y);
		t.x = 88;
		t.y = 99;
		System.out.println(t.x+"..."+t.y);

		Test1 t1 = new Test1();
		t1.x = 33;
		System.out.println(t1.x+"..."+t1.y);
		System.out.println(t.x+"..."+t.y);

	}
	void m1()
	{
		int a = 10; // local variable
		System.out.println(x);
		System.out.println(a);//possible

	}

}

