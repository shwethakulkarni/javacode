package string;

import java.util.Arrays;

public class nameandrollno {
	public static void main(String[] args) {
		int rollno[]=new int[4];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
			
			String name[]=new String[4];
			name[0]="ram";
			name[1]="bhavya";
			name[2]="chetna";
			name[3]="hari";
			System.out.println("Rollno"+(Arrays.toString(rollno)+"Name"+Arrays.toString(name)));
			//System.out.println(Arrays.toString(name));
	}

}
