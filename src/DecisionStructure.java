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

    public static void exerciceTwo() {
        /*
            Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
         */

        int num1;

        System.out.println("Digite um numero: ");
        num1 = Integer.parseInt(input.nextLine());

        if (num1 >= 0) {
            System.out.println("Esse numero é positivo.");
        } else {
            System.out.println("Esse numero é negativo.");
        }

    }

    public static void exerciceThree() {
        /*
            Faça um Programa que verifique se uma letra digitada é "F" ou "M".
            Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
         */

        String letra;

        System.out.println("Digite uma letra: ");
        letra = input.nextLine();

        switch (letra.toUpperCase()) {
            case "F":
                System.out.println("F - Feminino");
                break;
            case "M":
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Sexo invalido!");
        }

    }

    public static void exerciceFour() {
        /*
            Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
         */

        String letra;
        boolean isVogal;
        String[] vogais = new String[5];

        vogais[0] = "A";
        vogais[1] = "E";
        vogais[2] = "I";
        vogais[3] = "O";
        vogais[4] = "U";

        System.out.println("Digite uma letra: ");
        letra = input.nextLine().toUpperCase();

        isVogal = false;
        for (String vogal: vogais) {
            if (letra.equals(vogal)) {
                isVogal = true;
                break;
            }
        }

        if (isVogal) {
            System.out.println("A letra é uma vogal.");
        } else {
            System.out.println("A letra é uma consoante.");
        }

    }

    public static void exerciceFive() {
        /*
            Faça um programa para a leitura de duas notas parciais de um aluno.
            O programa deve calcular a média alcançada por aluno e apresentar:
                A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
                A mensagem "Reprovado", se a média for menor do que sete;
                A mensagem "Aprovado com Distinção", se a média for igual a dez.
         */

        double nota1;
        double nota2;
        double media;
        String mensagem;

        System.out.println("Digite a primeira nota: ");
        nota1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a segunda nota: ");
        nota2 = Double.parseDouble(input.nextLine());

        media = (nota1 + nota2) / 2;
        mensagem = "Reprovado";

        if (media >= 10) {
            mensagem = "Aprovado com Distinção";
        } else if (media >= 7) {
            mensagem = "Aprovado";
        }

        System.out.println("Sua media foi " + media + " e você foi " + mensagem + "!");

    }

    public static void exerciceSix() {
        /*
            Faça um Programa que leia três números e mostre o maior deles.
         */

        int num1;
        int num2;
        int num3;
        int maior;

        System.out.println("Digite o primeiro numero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o terceiro numero: ");
        num3 = Integer.parseInt(input.nextLine());

        maior = num1;

        if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        }

        if (num3 >= num1 && num3 >= num2) {
            maior = num3;
        }

        System.out.println("O maior numero é: " + maior);

    }

    public static void exerciceSeven() {
        /*
            Faça um Programa que leia três números e mostre o maior e o menor deles.
         */

        int num1;
        int num2;
        int num3;
        int maior;
        int menor;

        System.out.println("Digite o primeiro numero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o terceiro numero: ");
        num3 = Integer.parseInt(input.nextLine());

        maior = num1;
        menor = num1;

        if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        }

        if (num3 >= num1 && num3 >= num2) {
            maior = num3;
        } else if (num3 <= num1 && num3 <= num2) {
            menor = num3;
        }

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);

    }

    public static void exerciceEight() {
        /*
            Faça um programa que pergunte o preço de três produtos e
            informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
         */

        double valorProduto1;
        double valorProduto2;
        double valorProduto3;
        double menorValor;

        System.out.println("Digite o valor do primeiro produto: ");
        valorProduto1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o valor do segundo produto: ");
        valorProduto2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o valor do terceiro produto: ");
        valorProduto3 = Double.parseDouble(input.nextLine());

        menorValor = valorProduto1;

        if (valorProduto2 <= valorProduto1 && valorProduto2 <= valorProduto3) {
            menorValor = valorProduto2;
        }

        if (valorProduto3 <= valorProduto1 && valorProduto3 <= valorProduto2) {
            menorValor = valorProduto3;
        }

        System.out.println("O produto de menor valor custa R$ " + menorValor);

    }

    public static void exerciceNine() {
        /*
            Faça um Programa que leia três números e mostre-os em ordem decrescente.
         */

        int num1;
        int num2;
        int num3;
        int temp;

        System.out.println("Digite o primeiro numero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o terceiro numero: ");
        num3 = Integer.parseInt(input.nextLine());

        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 < num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }

    public static void exerciceTen() {
        /*
            Faça um Programa que pergunte em que turno você estuda. Peça para digitar
            M-matutino ou V-Vespertino ou N-Noturno. Imprima a mensagem "Bom Dia!",
            "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
         */

        String turno;

        System.out.println("Digite o turno que você estuda (M-matutino ou V-Vespertino ou N-Noturno): ");
        turno = input.nextLine();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Invalido!");
        }

    }

    public static void exerciceEleven() {
        /*
            As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe
            contraram para desenvolver o programa que calculará os reajustes.
            Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
            baseado no salário atual:
                salários até R$ 280,00 (incluindo) : aumento de 20%
                salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
                salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
                salários de R$ 1500,00 em diante : aumento de 5%
            Após o aumento ser realizado, informe na tela:
                    o salário antes do reajuste;
                    o percentual de aumento aplicado;
                    o valor do aumento;
                    o novo salário, após o aumento.
         */

        double salarioAtual;
        double percentualAumento;
        double valorAumento;
        double novoSalario;

        System.out.println("Digite seu salario atual: ");
        salarioAtual = Double.parseDouble(input.nextLine());

        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual < 700) {
            percentualAumento = 15;
        } else if (salarioAtual < 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        System.out.println("----- Valores -----");
        System.out.println("Salario anterior: " + salarioAtual);
        System.out.println("Percentual de Aumento: " + percentualAumento + "%");
        System.out.println("Valor de Aumento: " + valorAumento);
        System.out.println("Novo salario: " + novoSalario);

    }

    public static void exerciceTwelve() {
        /*
            Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
            que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11%
            do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário
            Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas
            trabalhadas no mês.
                Desconto do IR:
                    Salário Bruto até 900 (inclusive) - isento
                    Salário Bruto até 1500 (inclusive) - desconto de 5%
                    Salário Bruto até 2500 (inclusive) - desconto de 10%
                    Salário Bruto acima de 2500 - desconto de 20%
            Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5
            e a quantidade de hora é 220.
                Salário Bruto: (5 * 220)        : R$ 1100,00
                (-) IR (5%)                     : R$   55,00
                (-) INSS ( 10%)                 : R$  110,00
                FGTS (11%)                      : R$  121,00
                Total de descontos              : R$  165,00
                Salário Liquido                 : R$  935,00
         */

        double horasTrabalhadas;
        double valorPorHora;
        double salarioBruto;
        double valorInss;
        double porcentagemIr = 0;
        double valorIr;
        double valorFgts;
        double totalDesconto;
        double salarioLiquido;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = Double.parseDouble(input.nextLine());

        System.out.println("Digite o valor por hora trabalhada: ");
        valorPorHora = Double.parseDouble(input.nextLine());

        salarioBruto = valorPorHora * horasTrabalhadas;

        if (salarioBruto > 900 && salarioBruto <= 1500) {
            porcentagemIr = 5;
        } else if (salarioBruto <= 2500) {
            porcentagemIr = 10;
        } else {
            porcentagemIr = 20;
        }

        valorIr = salarioBruto * (porcentagemIr / 100);
        valorInss = salarioBruto * 0.1;
        valorFgts = salarioBruto * 0.11;
        totalDesconto = valorIr + valorInss;
        salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Salário Bruto: (5 * 220): R$ " + salarioBruto);
        System.out.printf("(-) IR (%.0f%s)             : R$ %s%n", porcentagemIr, "%", valorIr);
        System.out.println("(-) INSS (10%)         : R$ " + valorInss);
        System.out.println("FGTS (11%)              : R$ " + valorFgts);
        System.out.println("Total de descontos      : R$ " + totalDesconto);
        System.out.println("Salário Liquido         : R$ " + salarioLiquido);

    }

    public static void exerciceThirteen() {
        /*
            Faça um Programa que leia um número e exiba o dia correspondente da semana.
            (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
         */

        int numeroDiadaSemana;

        System.out.println("Digite o dia da semana: ");
        numeroDiadaSemana = Integer.parseInt(input.nextLine());

        switch (numeroDiadaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor invalido!");
                break;
        }

    }

    public static void main(String[] args) {
        System.out.println("-------- Estruturas de Decisao -------\n\n");
//        System.out.println("---------- Exercicio 01 --------------\n");
//        exerciceOne();
//        System.out.println("---------- Exercicio 02 --------------\n");
//        exerciceTwo();
//        System.out.println("---------- Exercicio 03 --------------\n");
//        exerciceThree();
//        System.out.println("---------- Exercicio 04 --------------\n");
//        exerciceFour();
//        System.out.println("---------- Exercicio 05 --------------\n");
//        exerciceFive();
//        System.out.println("---------- Exercicio 06 --------------\n");
//        exerciceSix();
//        System.out.println("---------- Exercicio 07 --------------\n");
//        exerciceSeven();
//        System.out.println("---------- Exercicio 08 --------------\n");
//        exerciceEight();
//        System.out.println("---------- Exercicio 09 --------------\n");
//        exerciceNine();
//        System.out.println("---------- Exercicio 10 --------------\n");
//        exerciceTen();
//        System.out.println("---------- Exercicio 11 --------------\n");
//        exerciceEleven();
//        System.out.println("---------- Exercicio 12 --------------\n");
//        exerciceTwelve();
        System.out.println("---------- Exercicio 13 --------------\n");
        exerciceThirteen();

    }

}
