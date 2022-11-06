import java.util.*;

//1.ArithmeticException
public class Exhand{
	public static void main(String [] args){
		try{
			int data;
			data=10/0;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}

//2.ArrayIndexOutOfBoundsException
public class Exhand{
	public static void main(String [] args){
		try{
			int a[]={1,2,3,4};
			System.out.println(a[10]);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}