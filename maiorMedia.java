import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o
maior número e a média desses números. */

/* Write a program that reads 5 numbers and report the 
largest number and the average of these numbers. */

public class maiorMedia{
    public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)){

                int numeros;
                int maiorNumero = 0;
                int somaNumeros = 0;
                int count = 0;
                
                do{
                    System.out.println("Número: ");
                    numeros = scan.nextInt();
                
                    somaNumeros = somaNumeros + numeros;

                    if (numeros > maiorNumero) maiorNumero = numeros;
                    
                    count = count++;
                    
                } while(count < 5);

                System.out.println("Maior: " + maiorNumero);
                System.out.println("Média: " + (somaNumeros/5));    
            }
        }
    }
        
