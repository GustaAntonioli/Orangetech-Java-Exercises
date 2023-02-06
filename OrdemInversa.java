/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args){

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length);

        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {                     //Nesse trecho do código foi utilizado o while,
            System.out.print(vetor[count] + " ");   //-->   //mas poderia ser o for também.Irá mostrar o vetor em
            count++;                                        //ordem crescente.
        }
    
        System.out.print("\nVetor: ");              //-->   //Nesse trecho do código foi utilizado o for,            
        for(int i = (vetor.length - 1); i >= 0; i --) {     //mas poderia ser o while também.Irá mostrar o vetor em
            System.out.print(vetor[i] + " ");               //ordem decrescente.
        }
    }
}
