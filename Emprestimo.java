public class Emprestimo {
    public static void main(String[] args) {

        double valorEmprestimo=20000;
        int parcela = 1;
        double valorParcela= valorEmprestimo / parcela;

        while(valorParcela>1000){
            valorParcela = valorEmprestimo / parcela;
            System.out.printf("%d parcela(s) no valor de R$%.2f\n", parcela, valorParcela);
            parcela++;
        }
    }
}
