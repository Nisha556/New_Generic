package Collections;
//using for loop
import java.util.*;
import java.util.ArrayList;

public class ArrayListExamp4 {
public static void main(String aegs[])
{
	Collection <String> value = new ArrayList<>();
	value.add("No");
	//value.add(77);
	value.add("is");
	value.add("prime no");
	for(String i : value)
	{
		System.out.println(i);
	}
}
}
