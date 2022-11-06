import java.util.*;
//for executing in notepad++ we have to write class with main function at the top

public class hierarchical{
	public static void main(String args[]){
		Square s = new Square();
		s.show();
		
		s.display2();
	}
}

class Shape{
	void show(){
		System.out.println("Everything is some shape");
	}
}
class rectangle extends Shape{
	void display(){
		System.out.println("This is rectangle");
	}
}
class Square extends Shape{
	void display2(){
		System.out.println("This is square");
	}
}
