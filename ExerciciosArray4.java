package familia28;

import java.util.Scanner;

public class ExerciciosArray4 {
/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/
	public static void main(String[] args) {
		
			// TODO Auto-generated method stub

	 float [][] a = new float [2][2];
	float [][] b = new float [2][2];
	float [][] resultado = new float [2][2];
	int l,c,valor,op;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("\nEntre com um valor :");
	valor = leia.nextInt();
	
	for(l=0;l<2;l++) {
		
	for(c=0;c<2;c++) {
		
		System.out.println("\nEntre com o valor de A :");
		a[l][c] = leia.nextFloat();
		System.out.println("\nEntre com o valor de B :");
		b[l][c] = leia.nextFloat();
	}
	
	}
	  System.out.println("\n\t\tMenu das opções :");
	  System.out.println("\n1-Somar as duas matrizes :");
	  System.out.println("\n2-Subtrair a primeira matriz na segunda :");
	  System.out.println("\n3-Adicionar uma constante as duas matrizes :");
	  System.out.println("\n4-Imprimir as matrizes :");
	  System.out.println("\nDigite sua opção :");
	  op = leia.nextInt();
	  
	  
	  
		  
		  
	  
	 
	  
	  }
	}	 
		  
	  

