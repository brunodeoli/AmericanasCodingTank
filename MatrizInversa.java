import java.util.Random;
import java.util.Scanner;

public class MatrizInversa {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Informe o tamanho do array: ");

        int tamanho = sn.nextInt();
        int[][] minhaMatriz = new int[tamanho][tamanho];
        int aux = tamanho-1;

        //Criando matriz
        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j < minhaMatriz[i].length; j++) {
                if (j == aux) {
                    minhaMatriz[i][j] = 1;
                    aux--;
                }
                System.out.print(minhaMatriz[i][j] + " ");
            }
            System.out.println();
        }

        sn.close();
    }
}
