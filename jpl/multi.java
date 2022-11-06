import java.util.*;
//for executing in notepad++ we have to write class with main function at the top

public class multi{
	public static void main(String args[]){
		Square s = new Square();
		s.show();
		s.display();
		s.display2();
	}
}

class Shape{
	void show(){
		System.out.println("Everything is some shape");
	}
}
class closed_shape extends Shape{
	void display(){
		System.out.println("It is closed shape");
	}
}
class Square extends closed_shape{
	void display2(){
		System.out.println("This is square");
	}
}

 