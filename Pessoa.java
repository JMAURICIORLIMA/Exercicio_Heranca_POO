package com.rodriguesdelima.mauricio.heranca.parte02;

public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected char sexo;

    // Métodos
    public void fazerAniver(){
        this.idade++;
    }

    // Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados: {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
