import java.util.Scanner;

public class SequentialStructure {

    static Scanner input = new Scanner(System.in);

    public static void exerciceEleven() {
        /*
            Faça um Programa que peça 2 números inteiros e um número real.
            Calcule e mostre:
                o produto do dobro do primeiro com metade do segundo .
                a soma do triplo do primeiro com o terceiro.
                o terceiro elevado ao cubo.
         */

        int num1;
        int num2;
        double num3;

        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo numero inteiro: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Digite um numero real: ");
        num3 = Double.parseDouble(input.nextLine());

        System.out.println("Valores:\n" +
                "A - " + ((num1*2) * (num2/2)) + "\n" +
                "B - " + ((num1*3) + num3) + "\n" +
                "C - " + Math.pow(num3, 3) );

    }

    public static void exerciceTwelve() {
        /*
            Tendo como dados de entrada a altura de uma pessoa,
            construa um algoritmo que calcule seu peso ideal,
            usando a seguinte fórmula: (72.7*altura) - 58
         */

        double altura;

        System.out.println("Digite a sua altura: ");
        altura = Double.parseDouble(input.nextLine());

        System.out.println("Seu peso ideal é: " + ((72.7*altura) - 58));

    }

    public static void exerciceThirteen() {
        /*
            Tendo como dado de entrada a altura (h) de uma pessoa,
            construa um algoritmo que calcule seu peso ideal,
            utilizando as seguintes fórmulas:
                Para homens: (72.7*h) - 58
                Para mulheres: (62.1*h) - 44.7
         */

        double altura;

        System.out.println("Digite sua altura: ");
        altura = Double.parseDouble(input.nextLine());

        System.out.println("Se você for homem, seu peso ideal é: " + ((72.7*altura) - 58) + "\n" +
                "Se for mulher: " + ((62.1*altura) - 44.7));

    }

    public static void exerciceFourteen() {
        /*
            João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário
            de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento
            de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
            João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
            Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa
            que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
         */

        int peso;
        int excesso;
        int multa;

        System.out.println("Digite o valor em peso de peixes: ");
        peso = Integer.parseInt(input.nextLine());

        excesso = peso > 50 ? peso - 50 : 0;
        multa = excesso * 4;

        System.out.println("Você teve um excesso de " + excesso + " kg " + "que gerou multa de " + multa + " reais.");

    }

    public static void exerciceFifteen() {
        /*
            Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
            Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11%
            para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
                salário bruto.
                quanto pagou ao INSS.
                quanto pagou ao sindicato.
                o salário líquido.
                calcule os descontos e o salário líquido, conforme a tabela abaixo:
                    + Salário Bruto : R$
                    - IR (11%) : R$
                    - INSS (8%) : R$
                    - Sindicato ( 5%) : R$
                    = Salário Liquido : R$
            Obs.: Salário Bruto - Descontos = Salário Líquido.
         */



    }

    public static void main(String[] args) {
        // exerciceEleven();
        // exerciceTwelve();
        // exerciceThirteen();
        // exerciceFourteen();
        exerciceFifteen();
    }

}
