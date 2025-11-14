package string;
import java.util.Scanner;
public class substring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String S1=new String(sc.nextLine());
		System.out.println(S1.substring(3));
		System.out.println(S1.substring(3,7));
		sc.close();
	}

}
