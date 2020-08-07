package Collections;



	import java.util.*;
	import java.util.Collection;
	public class MyDemo1 {
	public static void main(String args[])
	{
		Collection<Integer> value = new ArrayList<Integer>();
		value.add(3);
		//value.add("Navin");
		//value.add(5.8f);
		Iterator i = value .iterator();
		while(i.hasNext())
			{
			System.out.println(i.next());
			}
		//for( Object i : value)
		{
			System.out.println(i);
		}
	}
	}
