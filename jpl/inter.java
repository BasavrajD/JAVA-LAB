import java.util.*;

public class inter{
	public static void main(String [] args){
		B obj = new I();
		obj.a();
		obj.b();
	}
}

interface B{
	void a();
	void b();
}
class I implements B{
	public void a(){
		System.out.println("I am A");
	}
	public void b(){
		System.out.println("I am B");
	}
}
