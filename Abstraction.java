package training;
import java.util.Scanner;

abstract class animal{
	abstract void sound();
	void sleep() {
		System.out.println("zzz");
	}
}
class pig extends animal{
	void sound() {
		System.out.println("weeee");
	}
}

public class anagram {
	public static void main(String[] fghj) {
		pig s1=new pig();
		s1.sleep();
		s1.sound();
}
}
