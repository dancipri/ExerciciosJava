package Exercicio2;

public class ex2 {
	public static void main (String[] args)
	{
		int x;
		for (x=1000;x<=1999;x++)
		{
			if(x%11 == 0 || x%11 ==5)
			{
				System.out.println(x);
			}
		}
	}
}
