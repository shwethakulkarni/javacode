package string;
import java.util.Scanner;
public class regex {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the string: ");
	        String S1=new String(sc.nextLine());
	        System.out.println("Original String "+S1);
	        System.out.println("Enter the regex string: ");
	        String regex=new String(sc.nextLine());
	        System.out.println("Regular expression or regex = "+regex);
	        System.out.println("Enter the replacement string: ");
	        String replace=new String(sc.nextLine());
	        System.out.println("Replace expression is ="+replace);
	        System.out.println(S1.replaceAll(regex,replace));
	        sc.close();
	    }
	}



