/*
Escreva um algoritmo que solicite um valor da tabuada,
por exemplo, tabuada do 2, 5 etc. Exiba os resultados de 1 a 10, no
formato do exemplo:
4x1=4
4x2=8 
 */
package prova03;

import java.util.Scanner;

public class Prova03 {

    public static void main(String[] args) {
	int contador = 1;
	int tabuada;
	
	Scanner teclado=new Scanner(System.in);
        System.out.print("Digite a tabuada desejada: ");
		tabuada = teclado.nextInt();
	
            while (contador <=10){
		System.out.println(tabuada+"x"+contador+"="+contador * tabuada);
                
                
                contador++;
            }
        }

    }
