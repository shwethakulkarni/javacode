package string;

public class reversestring {
	public static void main(String[] args) {
		String a="Kitkat";
		System.out.println(a.length());
		/*
		System.out.println(a);
		System.out.print(a.charAt(5));
		System.out.print(a.charAt(4));
		System.out.print(a.charAt(3));
		System.out.print(a.charAt(2));
		System.out.print(a.charAt(1));
		System.out.print(a.charAt(0));
		*/
		/*
		System.out.println(a);
		for(int i=a.length()-1;i>=0;i--)
		{
			/*
			char c1=a.charAt(i);
			System.out.print(c1);
			*/
			//System.out.print(a.charAt(i));
		String output="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char c1=a.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
	}

}
