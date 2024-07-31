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
        System.out.println("---------- Exercicio 05 --------------\n");
        exerciceFive();
    }

}
