package app.revisarLogica;

import java.util.Scanner;


public class ejercicioArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Introduzca el numero de valores a leer");
	     Scanner sc = new Scanner(System.in);
	     int num = sc.nextInt();
	     int[] valores = new int[num];
	     int numero;
	     for (int i = 0; i < num; i++) {
	    	 System.out.println("Introduzca un numero:");
	    	 numero = sc.nextInt();
             if (numero < 1 || numero > 100) {
                 System.out.println("Error el numero introducido tiene que pertencer al intervalo (0,100)");
                 break;
             } else {
            	 valores[i] = numero;
             }
	     }
	     int[] impresos = new int[num];
	     for (int i = 0; i < num; i++){
	    	 boolean impreso = false;
	    	 for (int j = 0; j < num; j++){
	    		 if (impresos[j] == valores[i]){
	    			 impreso = true;
	    		 }
	    	 }
	    	 if (!impreso){
    			 System.out.print(valores[i]+": *");
    			 for (int k = i+1; k < num; k++){
    				 if (valores[k] == valores[i]){
    					 System.out.print("*");
    				 }
    			 }
    			 System.out.println("");
    			 for (int k = 0; k < num; k++){
    				 if (impresos[k] == 0){
    					 impresos[k] = valores[i];
    					 break;
    				 }
    			 }
	    	 }
	     }
	}
}
