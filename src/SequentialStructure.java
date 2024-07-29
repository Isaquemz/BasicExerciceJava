import java.util.Scanner;

public class SequentialStructure {

    static Scanner input = new Scanner(System.in);

    public static void exerciceOne() {
        /*
            Faça um Programa que mostre a mensagem "Alo mundo" na tela.
         */

        System.out.println("Hello Word!");

    }

    public static void exerciceTwo() {
        /*
            Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
         */

        int valor;

        System.out.println("Digite um numero: ");
        valor = Integer.parseInt(input.nextLine());
        System.out.println("O numero informado foi: " + valor);

    }

    public static void exerciceThree() {
        /*
            Faça um Programa que peça dois números e imprima a soma.
         */

        int num1;
        int num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("A soma dos dois numeros resulta em: " + (num1 + num2));

    }

    public static void exerciceFour() {
        /*
            Faça um Programa que peça as 4 notas bimestrais e mostre a média.
         */

        double num1;
        double num2;
        double num3;
        double num4;

        System.out.println("Digite a nota do primeiro bimestre.");
        num1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a nota do segundo bimestre.");
        num2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a nota do terceiro bimestre.");
        num3 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a nota do quarto bimestre.");
        num4 = Double.parseDouble(input.nextLine());

        System.out.println("A sua media é: " + ((num1 + num2 + num3 + num4)/4));

    }

    public static void exerciceFive() {
        /*
            Faça um Programa que converta metros para centímetros.
         */

        int metros;

        System.out.println("Digite um valor em metros: ");
        metros = Integer.parseInt(input.nextLine());

        System.out.printf("%s metros equivalem a %s centimetros.", metros, metros*100);

    }

    public static void exerciceSix() {
        /*
            Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
         */
        int raio;

        System.out.println("Digite o raio do circulo: ");
        raio = Integer.parseInt(input.nextLine());

        System.out.printf("A area de um circulo com raio %s é: %s.", raio, Math.PI * Math.pow(raio, 2));

    }

    public static void exerciceSeven() {
        /*
            Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
         */

        int lado;

        System.out.println("Digite o lado do quadrado: ");
        lado = Integer.parseInt(input.nextLine());

        System.out.printf("A area de um quadrado de lado %s cm é: %s.", lado, Math.pow(lado, 2));

    }

    public static void exerciceEight() {
        /*
            Faça um Programa que pergunte quanto você ganha por hora e o número de
            horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
         */

        double reaisHora;
        double horasTrabalhadas;

        System.out.println("Digite quanto você ganha por hora: ");
        reaisHora = Double.parseDouble(input.nextLine());
        System.out.println("Digite quantas horas você trabalhou: ");
        horasTrabalhadas = Double.parseDouble(input.nextLine());

        System.out.println("Você receberá um total de: " + reaisHora * horasTrabalhadas);

    }

    public static void exerciceNine() {
        /*
            Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a
            temperatura em graus Celsius.
            C = 5 * ((F-32) / 9).
         */

        double temperatura;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        temperatura = Double.parseDouble(input.nextLine());

        System.out.printf("%s graus Fahrenheit é equivalente a %s graus Celsius.", temperatura, ((temperatura-32.0) * (5.0 / 9.0)));

    }

    public static void exerciceTen() {
        /*
            Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
         */

        double temperatura;

        System.out.println("Digite a temperatura em Celsius: ");
        temperatura = Double.parseDouble(input.nextLine());

        System.out.printf("%s graus Celsius é equivalente a %s graus Fahrenheit.", temperatura, (temperatura * (9.0 / 5.0)) + 32);
    }

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
        // exerciceOne();
        // exerciceTwo();
        // exerciceThree();
        // exerciceFour();
        // exerciceFive();
        // exerciceSix();
        // exerciceSeven();
        // exerciceEight();
        // exerciceNine();
        // exerciceTen();
        // exerciceEleven();
        // exerciceTwelve();
        // exerciceThirteen();
        // exerciceFourteen();
        exerciceFifteen();
    }

}
