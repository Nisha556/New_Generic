package Collections; 

import java.util.Comparator;
import java.util.*;

class CompImpl implements Comparator {
	
public int compare(Integer o1, Integer o2)
{
	if(o1>o2)
		return 1;
	return -1;
}
}  
