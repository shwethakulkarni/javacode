package string;
import java.util.Scanner;
public class FindDuplicate {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();
		        System.out.println("Duplicate characters:");
		        // Convert string to lowercase (optional)
		        str = str.toLowerCase();
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            int count = 0;
		            // Skip if already counted
		            if (str.indexOf(ch) != i) {
		                continue;
		            }
		            // Count occurrences of ch
		            for (int j = i; j < str.length(); j++) {
		                if (str.charAt(j) == ch) {
		                    count++;
		                }
		            }
		            if (count > 1) {
		                System.out.println(ch + " appears " + count + " times");
		            }
		        }
		        sc.close();
		    }
	}

