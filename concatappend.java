package string;
import java.util.Scanner;
public class concatappend {
	public static void main(String[] args) {
		/*
		String s0="Automation";
		System.out.println(s0.concat(" Testing"));
		
		String s1=new String("Automation");
		s1.concat("Testing");
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Swetha");
		s2.append(" Kitkat");
		System.out.println(s2);
		
		StringBuilder s3=new StringBuilder("Cutie");
		s3.append("Kitkat");
		System.out.println(s3);
		*/
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    System.out.println(s1);
	    System.out.println(s1.concat("Swetha"));
	    System.out.println("Enter the string: ");

	    StringBuffer s2=new StringBuffer(sc.nextLine());
	    System.out.println(s2.append("Swetha"));
	    System.out.println("Enter the string: ");

	    StringBuilder s3=new StringBuilder(sc.nextLine());
	    System.out.println(s3.append("SWETHA"));
	    sc.close();
	}
	

	}


