package familia28;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
public class ExercicioArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valores [] [] = new float [3] [3];
		int  l=0, c=0, cont=0;
		
		Scanner leia  = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			
		for(c=0;c<3;c++) {
			
		System.out.println("\ndigite um valor : ");
		valores[l][c] = leia.nextFloat();
		
		if(valores[l][c]>10) {
		
			cont++;
			
			
		}
		
		}
		
		
		} System.out.println("\nOs valores maiores que 10 são  : "+cont );
		
	}   

}
