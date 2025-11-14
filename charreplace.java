package string;
import java.util.Scanner;
public class charreplace {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the charcter: ");
			String S1=new String(sc.next());
			char C1=S1.charAt(0);
			System.out.println(S1.replace(C1, 'A'));
			sc.close();
	}
}
