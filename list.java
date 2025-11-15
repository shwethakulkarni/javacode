package Upcasting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Swetha");
		l1.add(0, "Karthik");
		l1.add(null);
		l1.add("Karthik");
		l1.addAll(l1);
		l1.addAll(0, l1);
		System.out.println(l1);
		System.out.println(l1.get(0));
		System.out.println(l1);
		int count=l1.size();
		System.out.println(count);
		Iterator i1=l1.iterator();
		System.out.println("Forward Iteration");
		{
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
		}
		ListIterator i2=l1.listIterator();
		{
			System.out.println("FORWARD ITERATOR");
			while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
			System.out.println("BACKWARD ITERATOR");
			while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		}
	}

}
