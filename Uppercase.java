package string;
import java.util.Scanner;
public class Uppercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1=new String(sc.nextLine());
		System.out.println(s1.toUpperCase());
		sc.close();
	}

}
