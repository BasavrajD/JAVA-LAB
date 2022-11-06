import java.util.*;

public class threading{
	public static void main(String [] args){
		hi obj1 = new hi();
		hello obj2 = new hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}
}

class hi implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("HI");
		try{
			Thread.sleep(100);
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	}
}
class hello implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("HELLO");
		try{
			Thread.sleep(100);
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	}
}

