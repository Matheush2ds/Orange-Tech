import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        if(tamanhoDaFila % 2 == 0){
            System.out.println(tamanhoDaFila/2 + " pessoas no camarote");
        }else{
            System.out.println(tamanhoDaFila/2 + 1 + " pessoas no camarote");
        }
    }
}