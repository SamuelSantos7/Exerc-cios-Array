package familia28;

import java.util.Scanner;

public class ExemploArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float [][] valor = new float [3][3];
	float somavalor=0, mediavalor, somadiagonal=0;
	int l,c;
	
	Scanner leia= new Scanner(System.in);
	
	
	for(l=0;l<3;l++) {
	for(c=0;c<3;c++) {
		System.out.println("\nEntre com um valor : ");
		valor [l][c] = leia.nextFloat();
		somavalor = somavalor + valor[l][c];
		
		if(l == c) {
			somadiagonal = somadiagonal + valor[l][c];
			
		}
	}
	}
		mediavalor = somavalor/9;
		System.out.println("\nSomatório da diagonal principal: "+somadiagonal);
		System.out.println("\nMédia dos valores : "+mediavalor);
		
	}

}
