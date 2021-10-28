package com.rodriguesdelima.mauricio.heranca.parte02;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;

    // Métodos
    public void receberAumento(float aumento){this.salario += aumento;
    }
    public void status(){
        System.out.println("Especialidade: " + getEspecialidade() +
                "\nSalário: " + getSalario());
    }

    // Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {this.salario = salario;
    }

}
