package com.company.aplication;

public class Disciplina {
    private Aluno[] aluno; // new int [10];
    // public int [] Aluno = new int[10];
    private int cont = 0;

    public Disciplina(Aluno[] aluno, int cont) {
        this.aluno = aluno;
        this.cont = cont;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void cadastrarAlunos(Integer novoAluno) {    // public int[]
        //  for(int i=0;i<aluno.length;i++){}
        for (int i = 0; i < cont; i++) {

        }
    }

    /* public void cadastrarAlunos(Aluno matricula) {
         for (int i = 0; i < aluno.length; i++) {
             aluno.length[i] + 1;

         }


     }


     */
    public boolean calcularMedia(Integer matricula) {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i].getMatricula() == matricula) {
                aluno[i].setMedia(aluno[i].getNota1() + aluno[i].getNota2() + aluno[i].getNota3() / 3);
                return true;
            }
            System.out.println("nenhuma matricula encontrada");
        }
        return false;
    }
}


