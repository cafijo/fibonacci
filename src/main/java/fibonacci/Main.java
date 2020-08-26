package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int option;
		FibonacciService fiboService = new FibonacciService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a Fibonacci:");
		System.out.println("Opcion 1: Dime el numero de la posición.");
		System.out.println("Opcion 2: Genera X numeros.");
		do {
			System.out.println("Elige opcion?");
			while (!sc.hasNextInt()) sc.next();
			option = sc.nextInt();
		}while(option != 1 && option !=2);
		
		if(option == 1) {
			int position = 0;
			do
			{
				System.out.println("Posicion?");
				while (!sc.hasNextInt()) sc.next();
				position = sc.nextInt();
			}while(position < 0);
			System.out.println("Result:" + fiboService.getFibonacciPosition(position));
		}else {
			int counter = 0;
			do
			{
				System.out.println("¿Numeros de la sucession?");
				while (!sc.hasNextInt()) sc.next();
				counter = sc.nextInt();
			}while(counter <= 0);
			System.out.println("Result:" + fiboService.getFibonacciSequence(counter));
		}
		sc.close();
		System.exit(0);
	}
	
	

}
