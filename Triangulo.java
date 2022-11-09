import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas a serem impressas: ");
        int linhas = scanner.nextInt();

        for(int i=0;i<linhas;i++) {
            for(int j=linhas-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
