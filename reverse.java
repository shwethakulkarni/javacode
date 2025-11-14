package string;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String S1=new String(sc.nextLine());
		System.out.println(S1.replace(S1, "KITKAT"));
		
		sc.close();
	}

}
