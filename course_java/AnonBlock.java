class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}


public class AnonBlock
{
	public static void main(String args[]) 
	{
		int marks;
		marks=99;
		
		new A();   //created object without reference anonymous object
		new A().show();//every time write new A() it will create a new object
		
//		A obj=new A();
		A obj;
		obj=new A();//
		
		obj.show();
	}
}