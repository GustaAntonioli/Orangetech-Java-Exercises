import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

    public class parImpar {
        public static void main(String[] args) {
            try(Scanner scan = new Scanner(System.in)){

            int quantNumeros;
            int numero;
            int pares = 0, impares = 0;

            System.out.println("Informe quantos números irá digitar: ");
            quantNumeros = scan.nextInt();

            int count = 0;
            
            do {
                System.out.println("- Número: ");
                numero = scan.nextInt();

                if (numero % 2 == 0 ) pares++;
                else impares++;

                count++;
            
            } while(count < quantNumeros);

            System.out.println("");
            System.out.println("Quantidade Par: " + pares);
            System.out.println("Quantidade Ímpar: " + impares);
        }
    }
}