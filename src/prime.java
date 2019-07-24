
public class prime {

	public static void main(String[] args) {
		int n = 19;
		int m = n/2;
		boolean temp=false;
		
		for (int i =2 ; i <= m ; i++)
		{
			if (n%i==0)
			{
				temp=true;
				break;
			}
			
		}
		if(temp)
		{
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
}
