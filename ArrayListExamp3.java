package Collections;
//using iterator
import java.util.ArrayList;
import java.util.*;

public class ArrayListExamp3 {
public static void main(String args[]) throws Exception
{
	Collection <Integer> value = new ArrayList<Integer>();
	value.add(44);
	value.add(55);
	value.add(66);
	Iterator i = value.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
