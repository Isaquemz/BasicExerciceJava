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
        System.out.println("---------- Exercicio 10 --------------\n");
        exerciceTen();

    }

}
