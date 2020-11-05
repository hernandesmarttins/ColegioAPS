package com.company.aplication;

import java.util.Arrays;

public class Disciplina {
    private Aluno[] aluno; // new int [10];
    // public int [] Aluno = new int[10];
    private int contAlunos;

    public Disciplina(int contAlunos) {
        aluno = new Aluno[contAlunos];
        this.contAlunos = 0;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public int getContAlunos() {
        return contAlunos;
    }

    public void setContAlunos(int cont) {
        this.contAlunos = cont;
    }

    public void cadastrarAlunos(Aluno aluno) {    // public int[]
        //  for(int i=0;i<aluno.length;i++){}
        int indice = 0;
        for (int i = 0; i < this.aluno.length; i++) {
            if (this.aluno[i] != null) {
                // this.aluno[i] = aluno;
                indice += 1;
            }
        }
        this.aluno[indice] = aluno;
    }

    public int calcularMedia(Integer matricula) {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i].getMatricula() == matricula) {
                aluno[i].setMedia((aluno[i].getNota1() + aluno[i].getNota2() + aluno[i].getNota3()) / 3);
                return matricula;
            }
        }
        System.out.println("nenhuma matricula encontrada");
        return 0;
    }

    public void mostrarAprovado() {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i].getMedia() >= 7) {
                System.out.println("matricula : " + aluno[i].getMatricula());
            }
        }
    }

   /* public void acharMelhorNota(int max ){
        for(int i = 1; i< aluno.length;i++){
            if(aluno[i] > max){
              max = aluno[i];
            }
        }
        return  ;
    }
    */

}


