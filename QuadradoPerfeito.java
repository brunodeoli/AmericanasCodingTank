/**
 * Um quadrado pode ser considerado como perfeito quando a soma de cada linha, cada coluna, diagonal principal e segundaria resultam no mesmo valor. Veja o exemplo abaixo:

 *                 50
 * [20][ 6][ 7][17] = 50
 * [ 9][15][14][12] = 50
 * [13][11][10][16] = 50
 * [ 8][18][19][ 5] = 50
 *  50  50  50  50  50
 * Agora, que já foi entendido o que é um quadrado perfeito, escreva um algoritmo capaz de identificar se o quadrado pode ser considerado como perfeito.
 *
 */

public class QuadradoPerfeito {
    public static int[][] montarEPreencheQuadradoPerfeito() {
        int[][] matriz = {
                {20,6,7,17},
                {9,15,14,12},
                {13,11,10,16},
                {8,18,19,5}
        };
        return matriz;
    }

    public static void main(String[] args) {
        int[][] matriz = montarEPreencheQuadradoPerfeito();
        //Escreva seu algoritmo aqui

        int somaLinhaAtual = 0;
        int somaLinhaAnt = 0;
        int somaColunaAtual = 0;
        int somaColunaAnt = 0;
        int somaDiagonal = 0;
        int somaDiagonalInv = 0;
        int aux = matriz.length-1;

        for (int i = 0; i < matriz.length ; i++) {
            somaColunaAtual = 0;
            somaLinhaAtual = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhaAtual += matriz[i][j];
                somaColunaAtual += matriz[j][i];
                if(i==j)
                    somaDiagonal += matriz[i][j];
                if (j == aux) {
                    somaDiagonalInv += matriz[i][j];
                    aux--;
                }
            }
            if(i>0){
                if(somaLinhaAnt != somaLinhaAtual || somaColunaAnt != somaColunaAtual){
                    System.out.println("Matriz quadrada -> [NÃO PERFEITA]");
                    System.exit(0);
                }
            }
            somaLinhaAnt = somaLinhaAtual;
            somaColunaAnt = somaColunaAtual;
        }
        if(somaDiagonal == somaDiagonalInv && somaDiagonal == somaLinhaAtual)
            System.out.println("Matriz quadrada -> [PERFEITA]");
        else
            System.out.println("Matriz quadrada -> [NÃO PERFEITA]");
    }
}