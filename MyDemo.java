package Collections;



	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;
	public class MyDemo {
	public static void main(String args[])
	{
		Map<String , String > map = new HashMap<>();
	//map map = new HaahMap();
		map.put("Mayname", "Nisha");
		map.put("Atcor", "Sarukh");
		map.put("ceo", "Maria");
		System.out.println(map);
		Set<String> keys= map.keySet();
		for(String key : keys)
		{
			System.out.println(key + " " + map.get(key));
		}

	}
	}
