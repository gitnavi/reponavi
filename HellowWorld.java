/*Comments added*/
import java.lang.instrument.Instrumentation;
public class HellowWorld {

	private  int i;
	private  int j;
	public static void main(String[] args) {
		//HellowWorld hw = new HellowWorld();
		//System.out.println("Hellow World");
		//i=10;
		//j=20;
		//hw.i=10;
		//hw.j=20;
		//hw.sayHello();
		//HellowWorld hw1 = new HellowWorld();
		//hw1.sayHello();
		A superobj = new A();
		superobj.display();
		B subobj = new B();
		subobj.display();
		
	}
	public void sayHello()
	{System.out.println("Hellow World:"+i+":"+j);}

}
 class A{
	protected int i=10;
	protected int j=11;
	public void display() {
		System.out.println(i+":"+j);
	}
	
}
 class B extends A{
int k=12;
public void display()
{
	System.out.println(k);
	i=21;
	j=22;
	System.out.println(i+":"+j);
	System.out.println(super.i+":"+super.j);
	
}
}
