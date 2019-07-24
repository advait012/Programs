import java.util.ArrayList;

public class Practice1 {
	
	  static int i  = 1;
	  float f = 0.7f;
	  double d = 0.6;
	Practice1()
	{
		i++;
		System.out.println(i);
		ArrayList<String> s= new ArrayList<String>();
		for(String f : s) {
			System.out.println(f);
		}
	}
	

	public static void main(String[] args) {
		Practice1 p =new Practice1();
		Practice1 p1 =new Practice1();
		int a[] = new int[5];
		char c[] = {'a','b'};
		String s =new String(c);
		System.out.println(s);
		String s1 = "advait";
		System.out.println(s1.substring(3));
		
		
	}
}
