package Collections;
import java.util.Set;
import java.util.HashSet;
public class SetDemo {
public static void main(String args[])
{
	Set<Integer> value = new HashSet<>();
	value.add(5);
	value.add(4);
	value.add(9);
	value.add(900);
	value.add(80);
	value.add(20);
	value.add(30);
	System.out.println(value); //random memory allocation 
}
}
