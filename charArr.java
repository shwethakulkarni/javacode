package string;

import java.util.Arrays;

public class charArr {
public static void main(String[] args) {
	String s1="auto";
	char[] c1=s1.toCharArray();
	/*
	System.out.println(c1[0]);
	System.out.println(c1[1]);
	System.out.println(c1[2]);
	System.out.println(c1[3]);
	*/
	/*	for(int i=0;i<=s1.length()-1;i++)
	{
		System.out.println(c1[i]);
	}
	*/
	//Create an Array of length 4 for storing 4 roll nos
	///*
	int []rollno =new int[4];
	rollno[0]=10;
	rollno[1]=20;
	rollno[2]=30;
	rollno[3]=40;
	//for(int i=0;i<4;i++)
	//System.out.println(rollno[i]);
	//System.out.println("Value at index position -> " +i+ " -> "+rollno[i]);
	//System.out.println(rollno[0]);
	//System.out.println(rollno[1]);
	//System.out.println(rollno[2]);
	//System.out.println(rollno[3]);
	//*/
	System.out.println(Arrays.toString(rollno));
	String []name=new String[4];
	name[0]="ram";
	name[1]="bhavya";
	name[2]="chetna";
	name[3]="hari";
	for(int i=0;i<rollno.length;i++) {
		System.out.print(Arrays.toString(rollno));
		System.out.print(Arrays.toString(name));
	}
}
}
