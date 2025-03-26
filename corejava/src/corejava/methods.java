package corejava;

public class methods {

	public static void main(String[] args) {
		
		display();
	//methods.display();   2nd way of calling static methods
		
		methods ob=new methods();//creation of object
		
		ob.fruitname();//calling nonstatic methods
		
		ob.shownumber(100);
	
	}
	
	static void display()//static method
	{
		System.out.println("fortune cloud technologies");
		System.out.println("pune");
	}
	void fruitname()//nonstatic method
	{
		System.out.println("_________________________________________________");
		System.out.println("Apple");
		System.out.println("Banana");
		System.out.println("Mango");
		System.out.println("Orange");
		System.out.println("Grapes");
	}
	
void shownumber(int num)//parameterized method
	{
		System.out.println("_________________________________________________");
		System.out.println("the number is :" +num);
	}
}
