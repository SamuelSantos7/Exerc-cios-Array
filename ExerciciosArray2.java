package familia28;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
public class ExerciciosArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int [] numeros = new int [6];
		int somap=0, cont=0, x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite um n�mero : ");
			numeros[x] = leia.nextInt();
			
		}
		for(x=0;x<6;x++) {
			if(numeros[x] % 2 == 0) {
			System.out.println("\n" +numeros[x]+ " N�meros pares : ");
			somap = somap + numeros[x];
			
			}
			else {
				cont++;
				System.out.println("\nN�meros �mpares : "+numeros[x]);
				
			}
			System.out.println("\nA soma dos n�meros pares digitados : "+somap);
			System.out.println("\nA quantidade dos n�meros �mpares digitados : "+cont);
		}
		


		
	}

}
