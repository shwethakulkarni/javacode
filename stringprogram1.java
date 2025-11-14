package string;

public class stringprogram1 {
public static void main(String[] args) {
	String a="Auto";
	String b="LAPTOP";
	//length
	System.out.println(a.length());
	//charAT
	System.out.println(a.charAt(0));
	System.out.println(a.charAt(1));
	System.out.println(a.charAt(2));
	System.out.println(a.charAt(3));
	//toupper tolower
	System.out.println(b.toLowerCase());
	System.out.println(a.toUpperCase());
	//System.out.println(a.equals(b));
	/*boolean answer=b.equals("LAPTOP");
	System.out.println(answer);
	*/
	//equals
	boolean answer=b.equals(a);
	System.out.println(answer);
	boolean answer1=b.equalsIgnoreCase("laptop");
	System.out.println(answer1);
	//trim
	String c="     Automation Testing";
	System.out.println(c);
	System.out.println(c.trim());
	String d="     Automation Testing             ";
	System.out.println(d);
	System.out.println(d.trim());
	String e="Automation Testing             ";
	System.out.println(e);
	System.out.println(e.trim());
	//contains
	String f="Star Kitkat";
	boolean b1=f.contains("Kitkat");
	System.out.println(b1);
	
	String e1="Star Kitkat 123";
	boolean b2=e1.contains("456");
	System.out.println(b2);
} 

	
	

}
