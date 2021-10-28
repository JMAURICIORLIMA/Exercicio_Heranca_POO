package com.rodriguesdelima.mauricio.heranca.parte02;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Métodos
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }
    public void status(){
        System.out.println("Setor: " + this.getSetor() +
                "\nTrabalhando: " + this.getTrabalhando());
    }

    // Métodos Especiais

    public String getSetor() {return setor;
    }

    public void setSetor(String setor) {this.setor = setor;
    }

    public boolean getTrabalhando() {return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
