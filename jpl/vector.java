import java.util.*;

public class vector{
	public static void main(String [] args){
		Vector v1 = new Vector();
		Vector v2 = new Vector(20);
		v2.add(100);
		v2.add(100);
		
		System.out.println("Vector v1 of capacity "+v1.capacity()+" and of size "+v1.size());
		System.out.println("Vector v2 of capacity "+v2.capacity()+" and of size "+v2.size());
	}
}