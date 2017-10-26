package evaluacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Bubble {

	public static void main(String[] args) {
		int Arreglo[] []=new int [13] [13];
		Random aleatorios=new Random();
		
		 for(int i=1 ; i < 12 ; i++){
	            for(int j=1 ; j < 11 ;j++){
	                Arreglo[i][j] = aleatorios.nextInt(100);
	                System.out.println(Arreglo[i][j]);
	            }
	        }
		//for (int i=1; i<arreglo[][]-1; i++) {
			
			
		//}

	}

}
