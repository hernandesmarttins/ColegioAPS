package com.company.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Dados aluno: ");
        System.out.print("matricula: ");
        int matricula = scanner.nextInt();
        System.out.print("nome aluno: ");
        String nomeAluno  = scanner.next();
        System.out.println("nota 1: ");
        float nota1 = scanner.nextFloat();
        System.out.println("nota 2: ");
        float nota2 = scanner.nextFloat();
        System.out.println("nota 3: ");
        float nota3 = scanner.nextFloat();

        Aluno aluno  = new Aluno(matricula, nomeAluno,nota1,nota2,nota3);

       // Disciplina disciplina = new Disciplina(matricula, nomeAluno,nota1,nota2,nota3);


       int contador = scanner.nextInt();
        Disciplina[] vetor = new Disciplina[contador];

        for(int i =0;i<contador;i++){
            scanner.next(String.valueOf(aluno));
        }
        scanner.close();
    }
}
