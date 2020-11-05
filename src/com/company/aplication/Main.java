package com.company.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.printf("quantidade de alunos matriculados: ");
        Disciplina mat = new Disciplina(2);
        //  Integer x = scanner.nextInt();
        //  Aluno[] vetor = new Aluno[x];

        Aluno aluno1 = new Aluno(1, "joaozinho", 8, 7, 8);
        Aluno aluno2 = new Aluno(2, "mariazinha", 3, 3, 3);
        Aluno aluno3 = new Aluno(3, "anastacia", 10, 10, 10);

        System.out.println(mat.getAluno().length);

        mat.cadastrarAlunos(aluno1);
        mat.calcularMedia(1);

        mat.cadastrarAlunos(aluno2);
        mat.calcularMedia(2);
        //  System.out.println(aluno1.getMedia());
        System.out.println(String.format("%.2f", aluno1.getMedia()));
        System.out.println(String.format("%.2f", aluno2.getMedia()));
        mat.mostrarAprovado();
        System.out.println(aluno1.toString());


        //  mat.mostrarAprovado();
    /*    for (int i = 0; i < x; i++) {
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
        }   */
        scanner.close();
    }
}