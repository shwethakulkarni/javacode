package string;
import java.util.Scanner;
public class lengthusingchararray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=new String();
		s1=sc.nextLine();
		System.out.println(s1);
		int count=0;
		char ch[]= s1.toCharArray();
		
			for(char arr:ch)
			{
				count++;
			}
		System.out.println("Length of string: "+count);
		sc.close();
	}

}
