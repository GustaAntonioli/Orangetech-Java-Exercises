import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class notas {
    
   
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
        
            int nota; //armazena a nota.
            
            System.out.println("Digite a nota do aluno de 0 a 10: ");
                nota = scan.nextInt();

        while ((nota > 10) | (nota < 0)){
            System.out.println("Nota inválida, reinicie o app");
                nota = scan.nextInt();
            }
      
        if((nota <= 10) && (nota >= 0)){
            System.out.println("Nota registrada");

                if(nota >= 7){
                    System.out.println("Aluno aprovado");
                        }else{

                if(nota >= 5){
                    System.out.println("Aluno em recuperação");
                        }else{
                            System.out.println("Reprovado");
                    }
                }
            } 
        }
    }
}
