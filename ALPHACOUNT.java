package string;
import java.util.Scanner;
public class ALPHACOUNT {
	public static void main(String[] args) {
		int alphacount=0,digitcount=0,spacecount=0;
		Scanner sc=new Scanner(System.in);
		String S1=sc.nextLine();
		System.out.println(S1);
		char []ch=S1.toCharArray();
		System.out.println(ch);
		for(int i=0;i<S1.length();i++)
		{
			boolean b1=Character.isAlphabetic(ch[i]);
			if(b1)
			{
				alphacount++;
			}
			boolean b2=Character.isDigit(ch[i]);
			if(b2)
			{
				digitcount++;
			}
			boolean b3=Character.isWhitespace(ch[i]);
			if(b3)
			{
				spacecount++;
			}
		}
		System.out.println("Alphacount = "+alphacount);
		System.out.println("Digitcount = "+digitcount);
		System.out.println("Spacecount = "+spacecount);
		sc.close();
	}

}
