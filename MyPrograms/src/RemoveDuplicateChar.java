
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveDuplicateChar {
public static void main(String[] args) {
	String s="asha";
	String temp="";
	Map<Character,Integer> map=new ConcurrentHashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(map.containsKey(s.charAt(i)))
		{
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		else
		{
			map.put(s.charAt(i), 1);
		}
	}
	System.out.println(map);
	
	for(Entry<Character, Integer> entry:map.entrySet())
	{
		if(entry.getValue()>1)
		{
			map.remove(entry.getKey());
			
		}
		else
		{
			temp=temp+entry.getKey();
		}
		
	}
	System.out.println(map);
	System.out.println(temp);
	
}
}
