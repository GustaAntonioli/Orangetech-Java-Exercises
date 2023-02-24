import java.util.Scanner;


public class nomeIdade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        //int idade; Descomentar para usar o código.

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("idade: ");
          //  idade = scan.nextInt(); Descomentar para usar o código.
        }
        
        System.out.println("continue aqui...");
        scan.close();
    }
}

