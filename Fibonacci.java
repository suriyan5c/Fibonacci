package project_fibonacci;
public class Fibonacci
{
	public static void main(String[] args)
	{
	int f = 0;
	int s = 1;
	while(true)
	{
	System.out.println(f);
	if((f==21)||(s==21))   
	{
	break;
	}
	System.out.println(s);
	if((f==21)||(s==21))
	{
	break;
	}
	f = f + s;
	s = f + s;
	}
	}
}
