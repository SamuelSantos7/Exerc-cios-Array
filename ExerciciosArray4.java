package familia28;

import java.util.Scanner;

public class ExerciciosArray4 {
/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um
menu de op��es:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
pr�pria matriz.*/
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
	  System.out.println("\n\t\tMenu das op��es :");
	  System.out.println("\n1-Somar as duas matrizes :");
	  System.out.println("\n2-Subtrair a primeira matriz na segunda :");
	  System.out.println("\n3-Adicionar uma constante as duas matrizes :");
	  System.out.println("\n4-Imprimir as matrizes :");
	  System.out.println("\nDigite sua op��o :");
	  op = leia.nextInt();
	  
	  
	  
		  
		  
	  
	 
	  
	  }
	}	 
		  
	  

