package diagnostica;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * main
 */
public class main {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int somaTotal = 0;        
        int quantMaior = 0;

        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            
            numbers[i] = read.nextInt();

            somaTotal += numbers[i];
            
            if(numbers[i] > 30){
                quantMaior++;
            }
        }

        System.out.println("Os números são ->"); 
        
        for (int i : numbers) {
            
            System.out.print(i + " - ");
        }
        
        System.out.println("Quantidade dos números maiores que 30 -> " + quantMaior);

        System.out.println("A soma total é ->" + somaTotal);
        read.close();
    }
}