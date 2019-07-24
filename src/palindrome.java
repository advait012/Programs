
public class palindrome {
	public static void main(String[] args) {
		
	
	int num=1221,r,sum,d;
	sum=0;
	d=num;
	while(d>0)
	{
	r = d%10;
	sum=(sum*10)+r;
	d=d/10;
	}
	if(sum==num)
	{
	System.out.println("Palindrome number");
	}
	else 
	{
	System.out.println("not a palindrome number");
	}
	}
}

