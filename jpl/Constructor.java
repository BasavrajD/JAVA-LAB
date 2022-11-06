import java.util.*;

public class Constructor{
	int id;
	String name;
	
	Constructor(){
		System.out.println("this is default");
	}
	
	Constructor(int i,String n){
		id=i;
		name=n;
	}
	
	public static void main(String [] args){
		Constructor c1 = new Constructor();
		System.out.println("default C values:");
		System.out.println("ID= "+c1.id+" name= "+c1.name);
		
		Constructor c2 = new Constructor(3,"Alok");
		System.out.println("parameter C values:");
		System.out.println("ID= "+c2.id+" name= "+c2.name);
	}
}