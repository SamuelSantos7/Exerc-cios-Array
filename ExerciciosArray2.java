package familia28;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
public class ExerciciosArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int [] numeros = new int [6];
		int somap=0, cont=0, x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite um número : ");
			numeros[x] = leia.nextInt();
			
		}
		for(x=0;x<6;x++) {
			if(numeros[x] % 2 == 0) {
			System.out.println("\n" +numeros[x]+ " Números pares : ");
			somap = somap + numeros[x];
			
			}
			else {
				cont++;
				System.out.println("\nNúmeros ímpares : "+numeros[x]);
				
			}
			System.out.println("\nA soma dos números pares digitados : "+somap);
			System.out.println("\nA quantidade dos números ímpares digitados : "+cont);
		}
		


		
	}

}
