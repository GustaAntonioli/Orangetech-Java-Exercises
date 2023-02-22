import java.util.Scanner; 

public class mesadaSobrinho {
    public static void main(String[] args) {
        
        calcularMesada(); //O código pode ser feito sem utilizar método.

        }

        public static void calcularMesada(){
        
        try (Scanner leitor = new Scanner(System.in)) {
            
            int mesada = 50;
            int entrada = leitor.nextInt();
            System.out.println(entrada*mesada);

        }
    }
}
