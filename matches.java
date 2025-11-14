package string;

public class matches {
	public static void main(String[] args) {
		String s1="auto";
		//string starts with
		boolean b1=s1.matches("a(.*)");
		System.out.println(b1);
		//string ends with
		boolean b2=s1.matches("(.*)o");
		System.out.println(b2);
		//string finds between
		String s2="KITKAT";
		boolean b3=s2.matches("(.*)KAR(.*)");
		System.out.println(b3);
		String S3="abc123";
		System.out.println(S3.matches("[a-z]+[0-9]+"));
		String s = "Java123is456fun";
		System.out.println(s.replaceAll("[0-9]", "*")); // Java***is***fun
		String s5 = "one two two three two two";
		System.out.println(s5.replaceFirst("two", "2")); // one 2 three two
		String s6 = "apple,banana;cherry.orange";
		String[] parts = s6.split("[,;.]");
		for(String word : parts) {
		    System.out.println(word);
		}

				
		
	}

}
