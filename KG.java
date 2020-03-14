import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KG {
	
	public boolean match(String x, String y) {
		Map<Character, Character>hm = new HashMap<Character, Character>();
		int leng = x.length();
		if(x.length()>y.length() || x.length()<y.length())return false;
		for(int i=0; i<leng; i++) {
			if(!hm.containsKey(x.charAt(i))) {
				hm.put(x.charAt(i), y.charAt(i));
			}
			else {
				if(!hm.get(x.charAt(i)).equals(y.charAt(i))) {
					return false;
				}
				
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KG kg = new KG();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(kg.match(s1,s2));
	

	}

}
