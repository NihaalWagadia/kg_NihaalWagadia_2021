import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KG {
	
	public boolean match(String string1, String string2) {
		//hash_map to map every character from string1 with its corresponding character from string2
		Map<Character, Character>hash_map = new HashMap<Character, Character>();

		//If string length is not same, then it will return false
		if(string1.length()>string2.length() || string1.length()<string2.length()) {
			return false;
		}
		
		for(int i=0; i<string1.length(); i++) {	
			if(!hash_map.containsKey(string1.charAt(i))) {
				hash_map.put(string1.charAt(i), string2.charAt(i));
			}
			else {
				if(!hash_map.get(string1.charAt(i)).equals(string2.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		KG kg = new KG();
		if(args.length == 2) {
			System.out.println(kg.match(args[0],args[1]));	
		}
		else {
			System.out.println("Not enough strings");
		}
	}

}
