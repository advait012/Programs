import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class practive2 {
	
	
	public void m() throws IOException
	{
		throw new IOException();
	}
	
	void n() throws IOException 
	{
		m();
	}
	
	
	public static void main(String[] args) throws IOException  {
		new practive2().n();
		System.out.println("aaya");
		ArrayList<String> l =  new ArrayList<String>();
		Iterator wer = l.iterator();
	wer.next();
	Map<Integer,String> hm= new HashMap<Integer,String>();
	Set set = hm.entrySet();
	Iterator set1 = set.iterator();
	while(set1.hasNext())
	{
		Map.Entry entry = (Map.Entry)set1	.next();  
	}
		}
	
	
	

}
