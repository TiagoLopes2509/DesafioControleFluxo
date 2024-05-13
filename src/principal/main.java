package principal;

import java.util.Scanner;

import Utils.Contador;
import exception.ParametrosInvalidosException;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro:");
		Integer param1 = sc.nextInt(); 
		
		System.out.println("Digite o segundo parâmetro:");
		Integer param2 = sc.nextInt(); 
		
		try 
		{
			Contador.contar(param1, param2);
		} catch (ParametrosInvalidosException e) 
		{
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}

	}

}
