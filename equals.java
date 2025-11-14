package string;
import java.util.Scanner;
public class equals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String S1=new String(sc.nextLine());
		String S2=new String(sc.nextLine());
		//System.out.println(S1.equals(S2));
		boolean b1=(S1.equals(S2));
				System.out.println(b1);
		sc.close();
	}

}
