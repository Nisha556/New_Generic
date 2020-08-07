package Collections;



	import java.util.ArrayList;
import java.util.List;
import java.util.*;
	public class ListExamp2 {
	public static void main(String args[])
	{
		List<Integer> value= new ArrayList<Integer>();
		value.add(10);
		value.add(20);
		value.add(30)
		;
		value.add(90);
		
		value.add(40);
		value.add(60);
		value.add(2,70);
		Collections.sort(value);
	//	value.forEach(System.out::println); //not working in my pc //lambda Expression?
		System.out.println(value);
		List<String> vl = new ArrayList<String>();
		vl.add("helloWorld");
		System.out.println(vl);
	}
	}
