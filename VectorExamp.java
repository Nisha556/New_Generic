package Collections;
import java.util.*;

public class VectorExamp {
public static void main(String args[])
{
	Vector<Object> v = new Vector<Object>();
	System.out.println(v.capacity()); //byDefaul 10
	v.add(10);
	v.add("NIsha");
	v.add(20);
	v.add(40);
	v.add("vv");
	v.add("NN");
	v.add("John");
	v.add("John");
	v.add("John");v.add("John");
	v.add("John");
	v.add("John");
	v.add("John");
	v.add("John");
	v.add("John");
	for(Object i :v)
	{
		System.out.println(i);
	}
	System.out.println(v.capacity()); 
	
}
}
