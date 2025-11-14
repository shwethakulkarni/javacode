package string;
import java.util.Scanner;
public class Stringrev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S1=new String(sc.nextLine());
		System.out.println("Orginal String = "+S1);
		String S2="";
		for(int i=S1.length()-1;i>=0;i--)
		{
			S2 += S1.charAt(i);
		}
		System.out.println("Reversed String = "+S2);
		sc.close();
	}

}
/*
 * "package ab59;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		String input=""auto"";
		String output="""";
		for(int i=3;i>=0;i--)
		{
			char c1=	input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);

	//i=3,c1=o,output=o
	//i=2,c1=t,output=o+t=ot
	//i=1,c1=u,output=ot+u=otu
	//i=0,c1=a,output=otu+a=otua	
	}
}
"
 */
