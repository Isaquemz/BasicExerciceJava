import java.util.Scanner;

public class DecisionStructure {

    static Scanner input = new Scanner(System.in);

    public static void exerciceOne() {
        /*
            Faça um Programa que peça dois números e imprima o maior deles.
         */

        int num1;
        int num2;
        int maior;

        System.out.println("Digite o primeiro numero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

        maior = num1;
        if (num1 < num2) {
            maior = num2;
        }

        System.out.println("O maior numero entre os digitados é: " + maior);

    }

    public static void main(String[] args) {
        System.out.println("-------- Estruturas de Decisao -------\n\n");
        System.out.println("---------- Exercicio 01 --------------\n");
        exerciceOne();
    }

}
