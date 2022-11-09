import java.util.Scanner;

/**
 * Nesse exercício deve ser desenhado um Losango no console. Para isso teremos as seguintes regras:
 * O usuário deve informar o tamanho do Losango, esse tamanho trata da quantidade de colunas a serem utilizadas.
 * O tamanho mínimo para o desenho é de 5 colunas. Não existe limitação para o tamanho máximo.
 */

public class Losango {
    public static void main(String[] args) {
        //Inicializa scanner
        Scanner scanner = new Scanner(System.in);
        //Recebe do usuário tamanho do losango
        System.out.println("Informe o tamanho do Losango: ");
        int tamLosango = scanner.nextInt();
        //Verifica condição de tamanho minimo para o losango
        if(tamLosango < 5){
            System.out.println("O tamanho deve ser maior ou igual a 5.");
            scanner.close();
            System.exit(0);
        }
        //Verifica se tamanho informado é par
        boolean ehPar = tamLosango%2==0;

        int numeroAux = ehPar ? 1:0;    //Inteiro de valor 1 caso par, se não 0
        int percorreEsq = tamLosango/2 - numeroAux; //Inteiro para percorrer região esquerda do losango
        int percorreDir = tamLosango/2;     //Inteiro para percorrer região direita do losango

        //Percorre as linhas
        for (int i=0; i<(tamLosango-numeroAux); i++){
            //Percorre as colunas
            for (int j=0; j<tamLosango; j++){
                //Printa '*' caso:
                //          coluna atual menor permitido para percorrer;
                //          coluna atual maior permitido para percorrer.
                if(j<=percorreEsq || j>=percorreDir){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //Verifica linha atual para decidir se incrementa ou decrementa o percurso do losango
            if(i < (tamLosango/2 - numeroAux)){
                percorreEsq--; percorreDir++;
            }else{
                percorreEsq++; percorreDir--;
            }
            System.out.println();
        }
        //Encerra scanner
        scanner.close();
    }
}
