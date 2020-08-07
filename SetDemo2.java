package Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
public static void main(String args[])
{
	Set<Integer> value = new TreeSet<Integer>();
	value.add(10);
	value.add(200);
	value.add(200);
	value.add(20);
	value.add(50);
	value.add(300);System.out.println(value);
}
}
