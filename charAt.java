package string;
import java.util.Scanner;
public class charAt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=new String(sc.nextLine());
		char [] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(ch[i]);
		}
		//System.out.println(s1);
		sc.close();
	}

}
