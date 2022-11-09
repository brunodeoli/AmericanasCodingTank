import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrizAleatoria {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Informe o tamanho da matriz quadrada: ");
        
        int tamMatriz = sn.nextInt();
        int matrizQuadrada[][] = new int[tamMatriz][tamMatriz];
        Random rd = new Random();

        //Criando matriz
        for (int i = 0; i < matrizQuadrada.length; i++) {
            for (int j = 0; j < matrizQuadrada[i].length; j++) {
                matrizQuadrada[i][j] = rd.nextInt(1, 9);
                System.out.print(matrizQuadrada[i][j] + " ");
            }
            System.out.println();
        }
        
        sn.close();
    }
}
