package com.company.aplication;

public class Aluno {
    private int matricula;
    private String nomeAluno;
    private float nota1,nota2,nota3,media = 0;

    public Aluno(int matricula,String nomeAluno,float nota1,float nota2,float nota3,float media){

    }
    public Aluno(int matricula,String nomeAluno,float nota1,float nota2,float nota3){
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
   /* public Aluno(int matricula,String nomeAluno){
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
    }

    */

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

}
