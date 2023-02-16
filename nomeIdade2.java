import java.util.Scanner;


public class nomeIdade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome = "";
        int idade = 0; //Para erro da variável (notUsed), inseri 
                       //a condição if (idade == 0) break; no último bloco de código.

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("idade: ");
            idade = scan.nextInt();
            if (idade == 0) break;

        }
        scan.close(); // Para o erro do scanNeverClose
        System.out.println("continue aqui...");
    }

}

