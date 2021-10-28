package com.rodriguesdelima.mauricio.heranca.parte02;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;

    // Métodos
    protected void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno, " + this.nome );
    }
    public void status(){
        System.out.println("Matrícula: " + this.getMatricula() +
                "\nCurso: " + this.getCurso());
    }

    // Métodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}