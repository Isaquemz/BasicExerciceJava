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

        double valorPHora;
        int horasTrabalhadas;
        double salarioBruto;
        double valorIr;
        double valorInss;
        double valorSindicato;

        // Recebe os dados
        System.out.println("Digite quanto você recebe por hora: ");
        valorPHora = Double.parseDouble(input.nextLine());

        System.out.println("Digite quantas horas você trabalhou: ");
        horasTrabalhadas = Integer.parseInt(input.nextLine());

        // Realiza os calculos
        salarioBruto = horasTrabalhadas * valorPHora;
        valorIr = salarioBruto * 0.11;
        valorInss = salarioBruto * 0.08;
        valorSindicato = salarioBruto * 0.05;

        System.out.println("-----------------------------");
        System.out.println("+ Salário Bruto : R$ " + salarioBruto);
        System.out.println("- IR (11%) : R$ " + valorIr);
        System.out.println("- INSS (8%) : R$ " + valorInss);
        System.out.println("- Sindicato ( 5%) : R$ " + valorSindicato);
        System.out.println("= Salário Liquido : R$ " + (salarioBruto - (valorIr + valorInss + valorSindicato)));
        System.out.println("-----------------------------");

    }

    public static void exerciceSixteen() {
        /*
            Faça um programa para uma loja de tintas. O programa deverá
            pedir o tamanho em metros quadrados da área a ser pintada.
            Considere que a cobertura da tinta é de 1 litro para cada
            3 metros quadrados e que a tinta é vendida em latas de 18 litros,
            que custam R$ 80,00. Informe ao usuário a quantidades de latas de
            tinta a serem compradas e o preço total.
         */

        double area;
        double litrosTinta;
        double qtdLatas;

        // Busca dados do usuario
        System.out.println("Digite a area em metros quadrados a ser pintada: ");
        area = Double.parseDouble(input.nextLine());

        // Realiza calculos
        litrosTinta = Math.ceil(area / 3);
        qtdLatas = Math.ceil(litrosTinta / 18);

        System.out.println("Sera necessario " + qtdLatas + " latas, custando R$ " + qtdLatas * 80.0);

    }

    public static void exerciceSeventeen() {
        /*
            Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho
            em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
            é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
            18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
            Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
            preços em 3 situações:
                comprar apenas latas de 18 litros;
                comprar apenas galões de 3,6 litros;
                misturar latas e galões, de forma que o desperdício de tinta seja menor.
                Acrescente 10% de folga e sempre arredonde os valores para cima, isto é,
                considere latas cheias.
         */

        double area;
        double litrosTinta;
        double qtdLatasMaior;
        double qtdLatasMenor;

        System.out.println("Digite a area a ser pintada: ");
        area = Double.parseDouble(input.nextLine());

        litrosTinta = Math.ceil((area / 6) * 1.10);

        System.out.println("Para essa area, é necessario " + litrosTinta + " litros de tinta.");

        qtdLatasMaior = Math.ceil(litrosTinta / 18);
        qtdLatasMenor = Math.ceil(litrosTinta / 3.6);

        System.out.println("Se quiser comprar apenas galoes de 18 litros, sera necessario " + qtdLatasMaior + " latas, custando R$ " + qtdLatasMaior * 80.0);
        System.out.println("Se quiser comprar apenas galoes de 3.6 litros, sera necessario " + qtdLatasMenor + " latas, custando R$ " + qtdLatasMenor * 25.0);

        qtdLatasMaior = Math.floor(litrosTinta / 18);
        qtdLatasMenor = Math.ceil((litrosTinta - (qtdLatasMaior * 18)) / 3.6);

        System.out.println("Se quiser comprar galoes mistos, sera necessario " +
                qtdLatasMaior + " latas de 18 litros e " +
                qtdLatasMenor + " latas de 3.6 litros, custando R$ " +
                ((qtdLatasMaior * 80.0) + (qtdLatasMenor * 25.0)));

    }

    public static void exerciceEighteen() {
        /*
            Faça um programa que peça o tamanho de um arquivo para download (em MB)
            e a velocidade de um link de Internet (em Mbps), calcule e informe o
            tempo aproximado de download do arquivo usando este link (em minutos).
         */

        double tamanhoArquivo;
        double velocidadeInternet;

        System.out.println("Digite o tamanho do arquivo (em MB) para download: ");
        tamanhoArquivo = Double.parseDouble(input.nextLine());

        System.out.println("Digite a velocidade do link de internet (em Mbps): ");
        velocidadeInternet = Double.parseDouble(input.nextLine());

        System.out.println("O download levara aproximadamente " + Math.ceil((tamanhoArquivo / velocidadeInternet) / 60) + " minutos.");

    }

    public static void main(String[] args) {
        System.out.println("------- Estruturas Sequenciais -------\n\n");
        System.out.println("---------- Exercicio 01 --------------\n");
        exerciceOne();
        System.out.println("---------- Exercicio 02 --------------\n");
        exerciceTwo();
        System.out.println("---------- Exercicio 03 --------------\n");
        exerciceThree();
        System.out.println("---------- Exercicio 04 --------------\n");
        exerciceFour();
        System.out.println("---------- Exercicio 05 --------------\n");
        exerciceFive();
        System.out.println("\n---------- Exercicio 06 --------------\n");
        exerciceSix();
        System.out.println("\n---------- Exercicio 07 --------------\n");
        exerciceSeven();
        System.out.println("\n---------- Exercicio 08 --------------\n");
        exerciceEight();
        System.out.println("---------- Exercicio 09 --------------\n");
        exerciceNine();
        System.out.println("\n---------- Exercicio 10 --------------\n");
        exerciceTen();
        System.out.println("\n---------- Exercicio 11 --------------\n");
        exerciceEleven();
        System.out.println("---------- Exercicio 12 --------------\n");
        exerciceTwelve();
        System.out.println("---------- Exercicio 13 --------------\n");
        exerciceThirteen();
        System.out.println("---------- Exercicio 14 --------------\n");
        exerciceFourteen();
        System.out.println("---------- Exercicio 15 --------------\n");
        exerciceFifteen();
        System.out.println("---------- Exercicio 16 --------------\n");
        exerciceSixteen();
        System.out.println("---------- Exercicio 17 --------------\n");
        exerciceSeventeen();
        System.out.println("---------- Exercicio 18 --------------\n");
        exerciceEighteen();
    }

}
