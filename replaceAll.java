package string;

public class replaceAll {
	public static void main(String[] args) {
			String s1="auto";
			System.out.println(s1.replace('a', 'A'));
			
			String s2="automation testing";
			System.out.println(s2.replace("automation", "Automation QA"));
			
			String s3="Testing";
			String s4="Manish Kumar Tiwari";

			//1st -remove all smaller letters 
			System.out.println(s4.replaceAll("[a-z]", ""));
			//	2nd -rmeove all capital letters
			System.out.println(s4.replaceAll("[A-Z]", ""));
			String s5="k v no 2";
			//all the numeric value 
			System.out.println(s5.replaceAll("[0-9]", "ABC"));

				
			}
		
	}

