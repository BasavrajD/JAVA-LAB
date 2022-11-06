import java.util.*;

public class Method{
	static void add(int x,int y){
		System.out.println("addition is "+(x+y));
	}
	static void add(int x){
		System.out.println("no. is "+x);
	}
	public static void main(String[] args){
		add(10,20);
		add(5);
	}
}