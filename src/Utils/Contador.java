package Utils;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void contar(int param1, int param2) throws ParametrosInvalidosException
	{
		if(param1 > param2) 
		{
			throw new ParametrosInvalidosException();	
		}
		else
		{
			for(int x = param1; x <= param2; x++) 
			{
				System.out.println(param1);
				param1++;	
			}
		}
	}
}