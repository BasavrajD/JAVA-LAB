import java.util.*;

public class Array{
	public static void main(String [] args){
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements= ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++){
			System.out.println("Enter no.= ");
			a[i]=sc.nextInt();
		}
		System.out.println("Your array= ");
		for(i=0;i<n;i++){
			
			System.out.print(a[i]+" ");
		}
	}
}