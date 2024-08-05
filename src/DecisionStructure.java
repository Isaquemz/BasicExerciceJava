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

    public static void exerciceFourteen() {
        /*
            Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um
            semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
              Média de Aproveitamento  Conceito
              Entre 9.0 e 10.0        A
              Entre 7.5 e 9.0         B
              Entre 6.0 e 7.5         C
              Entre 4.0 e 6.0         D
              Entre 4.0 e zero        E
            O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se
            o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
         */

        double nota1;
        double nota2;
        double media;
        String conceito;

        System.out.println("Digite a nota 1: ");
        nota1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a nota 2: ");
        nota2 = Double.parseDouble(input.nextLine());

        media = (nota1 + nota2) / 2;

        if (media > 9 && media <= 10) {
            conceito = "A";
        } else if (media > 7.5 && media <= 9) {
            conceito = "B";
        } else if (media > 6 && media <= 7.5) {
            conceito = "C";
        } else if (media > 4 && media <= 6) {
            conceito = "D";
        } else if (media >=0 && media <= 4) {
            conceito = "E";
        } else {
            conceito = "Conceito fora do intervalo.";
        }

        switch (conceito) {
            case "A":
            case "B":
            case "C":
                System.out.printf("Categoria %s - Aprovado%n", conceito);
                break;
            case "D":
            case "E":
                System.out.printf("Categoria %s - Reprovado%n", conceito);
                break;
            default:
                System.out.println(conceito);
        }

    }

    public static void exerciceFifteen() {
        /*
            Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem
            ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles
            ou escaleno.

            Dicas:
                Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
                Triângulo Equilátero: três lados iguais;
                Triângulo Isósceles: quaisquer dois lados iguais;
                Triângulo Escaleno: três lados diferentes;
         */

        double lado1;
        double lado2;
        double lado3;
        boolean isTriangulo;

        System.out.println("Digite a lado 1: ");
        lado1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a lado 2: ");
        lado2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a lado 3: ");
        lado3 = Double.parseDouble(input.nextLine());

        isTriangulo = (lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1;

        if (isTriangulo) {
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Esse é um triangulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Esse é um triangulo Isósceles.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Esse é um triangulo Escaleno.");
            }
        } else {
            System.out.println("Esse não é um triangulo valido!");
        }
    }

    public static void exerciceSixteen() {
        /*
            Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
            O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas
            seguintes situações:
                Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não
                deve fazer pedir os demais valores, sendo encerrado;
                Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e
                encerre o programa;
                Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
                Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
         */

        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;

        System.out.println("Digite o valor de a: ");
        a = Double.parseDouble(input.nextLine());

        if (a != 0) {

            System.out.println("Digite o valor de b: ");
            b = Double.parseDouble(input.nextLine());

            System.out.println("Digite o valor de c: ");
            c = Double.parseDouble(input.nextLine());

            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0 ) {
                System.out.println("A equação não possui raizes reais.");
            } else {
                if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.println("A equação possui apenas uma raiz real");
                    System.out.println("x = " + x1);
                } else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("A equação possui duas raiz reais");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }
        } else {
            System.out.println("Essa equação não é de segundo grau.");
        }

    }

    public static void exerciceSeventeen() {
        /*
            Faça um Programa que peça um número correspondente a um determinado ano e em seguida
            informe se este ano é ou não bissexto.
         */

        String anoTexto;
        int ano;

        System.out.println("Digite o ano: ");
        anoTexto = input.nextLine();
        ano = Integer.parseInt(anoTexto.substring(anoTexto.length() - 2));

        if (ano % 4 == 0) {
            System.out.printf("%s é um ano bissexto.%n", anoTexto);
        } else {
            System.out.printf("%s não é um ano bissexto.%n", anoTexto);
        }

    }

    public static void exerciceEighteen() {
        /*
            Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
         */



    }

    public static void exerciceNineteen() {
        /*
            Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas,
            dezenas e unidades do mesmo.
            Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
                326 = 3 centenas, 2 dezenas e 6 unidades
                12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10,
                21, 11, 1, 7 e 16
         */



    }

    public static void exerciceTwenty() {
        /*
            Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média
            alcançada por aluno e presentar:
                A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
                A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
                A mensagem "Aprovado com Distinção", se a média for igual a 10.
         */



    }

    public static void exerciceTwentyOne() {
        /*
            Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e
            depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10,
            50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com
            a quantidade de notas existentes na máquina.
                Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50,
                uma nota de 5 e uma nota de 1;
                Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
                quatro notas de 10, uma nota de 5 e quatro notas de 1.
         */



    }

    public static void exerciceTwentyTwo() {
        /*
            Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o
            operador módulo (resto da divisão).
         */



    }

    public static void exerciceTwentyThree() {
        /*
            Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
            Dica: utilize uma função de arredondamento.
         */



    }

    public static void exerciceTwentyFour() {
        /*
            Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
            O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
                par ou ímpar;
                positivo ou negativo;
                inteiro ou decimal.
         */



    }

    public static void exerciceTwentyFive() {
        /*
            Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
                "Telefonou para a vítima?"
                "Esteve no local do crime?"
                "Mora perto da vítima?"
                "Devia para a vítima?"
                "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da
                pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como
                "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado
                como "Inocente".
         */



    }

    public static void exerciceTwentySix() {
        /*
            Um posto está vendendo combustíveis com a seguinte tabela de descontos:
                Álcool:
                    até 20 litros, desconto de 3% por litro
                    acima de 20 litros, desconto de 5% por litro
                Gasolina:
                    até 20 litros, desconto de 4% por litro
                    acima de 20 litros, desconto de 6% por litro
            Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte
            forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço
            do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
         */



    }

    public static void exerciceTwentySeven() {
        /*
            Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                                      Até 5 Kg           Acima de 5 Kg
                Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
                Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
            Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
            ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
            morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
         */



    }

    public static void exerciceTwentyEight() {
        /*
            O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                                      Até 5 Kg           Acima de 5 Kg
                File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
                Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
                Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
            Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
            porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara
            o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o
            tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da
            compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
         */



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
//        System.out.println("---------- Exercicio 13 --------------\n");
//        exerciceThirteen();
//        System.out.println("---------- Exercicio 14 --------------\n");
//        exerciceFourteen();
//        System.out.println("---------- Exercicio 15 --------------\n");
//        exerciceFifteen();
//        System.out.println("---------- Exercicio 16 --------------\n");
//        exerciceSixteen();
        System.out.println("---------- Exercicio 17 --------------\n");
        exerciceSeventeen();
//        System.out.println("---------- Exercicio 18 --------------\n");
//        exerciceEighteen();
//        System.out.println("---------- Exercicio 19 --------------\n");
//        exerciceNineteen();
//        System.out.println("---------- Exercicio 20 --------------\n");
//        exerciceTwenty();
//        System.out.println("---------- Exercicio 21 --------------\n");
//        exerciceTwentyOne();
//        System.out.println("---------- Exercicio 22 --------------\n");
//        exerciceTwentyTwo();
//        System.out.println("---------- Exercicio 23 --------------\n");
//        exerciceTwentyThree();
//        System.out.println("---------- Exercicio 24 --------------\n");
//        exerciceTwentyFour();
//        System.out.println("---------- Exercicio 25 --------------\n");
//        exerciceTwentyFive();
//        System.out.println("---------- Exercicio 26 --------------\n");
//        exerciceTwentySix();
//        System.out.println("---------- Exercicio 27 --------------\n");
//        exerciceTwentySeven();
//        System.out.println("---------- Exercicio 28 --------------\n");
//        exerciceTwentyEight();
    }

}
