import java.util.Scanner;

/**
 * Um funcionário deseja saber qual o valor líquido anual que recebe da sua empresa.
 * Para tal cálculo é necessário considerar que o funcionário recebe o
 * salário + décimo terceiro + férias e não esqueça de considerar o desconto do inss,
 * não vamos trabalhar com imposto de renda nesse momento.
 * O inss tem desconto com base no valor mensal que o funcionário recebe e para
 * isso vamos utilizar a regra a seguir:
 * de 0 até 1212.00 -> 7,5%.
 * de 1212.01 até 2427,35 -> 9%.
 * de 2427,36 até 3641,03 -> 12%.
 * de 3641,04 até 7087,22 -> 14%.
 * acima de 7087,22 deve ser descontado o teto de 900 reais.
 *
 * O resultado final apresentado ao funcionário deve ter o
 * salário anual bruto, total anual de inss descontado e o
 * salário anual líquido final.
 */

public class CalculoSalarioAnualLiquido {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        if(salarioMensal < 0){
            System.out.println("Valor declarado de salário é inválido");
            System.exit(0);
        }

        // No salário bruto anual é considerado:
        //      12 meses do salário anual + decimo terceiro + ferias (1/3 do salário mensal)
        double salarioBruto = salarioMensal*(13+1/3F);
        double salarioLiquido, descontoTotalINSS;

        // Desconto de INSS
        if (salarioMensal >= 0 && salarioMensal <= 1212.00)
            descontoTotalINSS = salarioBruto * 0.075;
        else if (salarioMensal > 1212.00 && salarioMensal <= 2427.35)
            descontoTotalINSS = salarioBruto * 0.09;
        else if (salarioMensal > 2427.35 && salarioMensal <= 3641.04)
            descontoTotalINSS = salarioBruto * 0.12;
        else if (salarioMensal > 3641.04 && salarioMensal <= 7087.22)
            descontoTotalINSS = salarioBruto * 0.14;
        else
            descontoTotalINSS = 13*900 + 900/3;

        // Salário Liquido

        salarioLiquido = salarioBruto - descontoTotalINSS;

        // Print de retorno

        System.out.printf("O salário anual bruto é no valor de R$%.2f \nÉ descontado o INSS anual no valor de R$%.2f\nSendo assim o valor do salário líquido é de R$%.2f\n",
                salarioBruto,
                descontoTotalINSS,
                salarioLiquido);

        scanner.close();
    }
}
