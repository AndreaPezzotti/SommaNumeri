
public class SommaNumeri 
{
	public static int somma4(int x)
	{
		for (int i = 0; i < 4; i++) 
			x++;
		return x;
	}
	
	public static int somma10(int x)
	{
		for (int i = 0; i < 10; i++) 
			x++;
		return x;
	}
	
	public static void main(String[] args)
	{
		int x=1;
		System.out.println(somma4(x));
		System.out.println(somma10(x));
	}
}
