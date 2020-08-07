package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.List;

public class ListExamp3 {

	public static void main(String args[])
	{
		List<Integer> value= new ArrayList<Integer>();
		value.add(305);
		value.add(998);
		value.add(774)
		;
		value.add(236);
		
		value.add(881);
		
		Comparator <Integer> com = new CompImpl();
		Collections.sort(value, com);
	//	value.forEach(System.out::println); //not working in my pc //lambda Expression?
		//System.out.println(value);
		//List<String> vl = new ArrayList<String>();
		//vl.add("helloWorld");
		//System.out.println(vl);
	}
	}
