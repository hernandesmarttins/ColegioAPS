package com.company.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("quantidade de alunos matriculados: ");
        Integer x = scanner.nextInt();
        Aluno[] vetor = new Aluno[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Dados aluno: ");
            System.out.print("matricula: ");
            int matricula = scanner.nextInt();
            System.out.print("nome aluno: ");
            String nomeAluno = scanner.next();
            System.out.println("nota 1: ");
            float nota1 = scanner.nextFloat();
            System.out.println("nota 2: ");
            float nota2 = scanner.nextFloat();
            System.out.println("nota 3: ");
            float nota3 = scanner.nextFloat();

            vetor[i] = new Aluno(matricula, nomeAluno, nota1, nota2, nota3);
        }


        scanner.close();
    }
}