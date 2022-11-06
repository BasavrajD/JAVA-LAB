import java.util.*;
public class single{
	public static void main(String args[]){
		Square s = new Square();
		s.show();
		s.display();
	}
}
class Shape{
	void show(){
		System.out.println("Everything is some shape");
	}
}
class Square extends Shape{
	void display(){
		System.out.println("This is square");
	}
}

//not executing in notepad but executing in online compiler if we put class single at bottom