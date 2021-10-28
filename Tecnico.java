package com.rodriguesdelima.mauricio.heranca.parte02;

public class Tecnico extends Aluno {
    // Atributo
    private int registroProfissional;

    // Método
    public void praticar(){
        System.out.println("Em aula prática... ");
    }

    // Métodos Especiais

    public int getRegistroProfissional(int i) {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
