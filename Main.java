package com.rodriguesdelima.mauricio.heranca.parte02;

public class Main {

    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();  // Tentando instanciar uma classe abstrata.

        // Visitante
        Visitante v1 = new Visitante();
        v1.setNome("Catarina");
        v1.setSexo('F');
        v1.setIdade(25);
        v1.stauts();
        System.out.println(v1.toString());
        System.out.println("_______________________________");

        // Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(18);
        a1.setSexo('F');
        a1.pagarMensalidade();
        a1.status();
        System.out.println(a1.toString());
        System.out.println("_______________________________");

        // Professor
        Professor professor1 = new Professor();
        professor1.nome = "Jorge";
        professor1.idade = 48;
        professor1.sexo = 'M';
        professor1.setSalario(3850.32f);
        professor1.setEspecialidade("Sistemas de informação");
        professor1.receberAumento(200f);
        professor1.fazerAniver();
        professor1.status();
        System.out.println(professor1.toString());
        System.out.println("_______________________________");

        Bolsista b1 = new Bolsista();
        b1.setNome("João");
        b1.setMatricula(2351);
        b1.setCurso("SI");
        b1.setIdade(29);
        b1.setSexo('M');
        b1.setBolsa(75f);
        b1.pagarMensalidade();
        b1.status();
        System.out.println(b1.toString());
        System.out.println("_______________________________");

        Tecnico t1 = new Tecnico();
        t1.setNome("Eulicis");
        t1.setRegistroProfissional(1321153);
        t1.setMatricula(132422);
        t1.setCurso("Manutenção em rede cabeada.");
        t1.setIdade(21);
        t1.setSexo('M');
        t1.pagarMensalidade();
        t1.praticar();
        t1.status();
        System.out.println(t1.toString());
        System.out.println("_______________________________");

        Funcionario f1 = new Funcionario();
        f1.nome = "Marta";
        f1.idade = 33;
        f1.sexo = 'F';
        f1.setSetor("Administrativo. ");
        f1.setTrabalhando(false);
        f1.mudarTrabalho();
        f1.status();
        System.out.println(f1.toString());
        System.out.println("_______________________________");

        //p1.receberAumento(550.20) 	// A classe pessoa não possui atributo para aumento
        //p2.mudarTrabalho()    		// A classe Aluno não comporta mudança de trabalho, métodos não existe.
        //p3.cancelarMatricula()		// A classe Professor não existe o método cancelarMatricula.


       // System.out.println(p2.toString());
       // System.out.println(p3.toString());
       // System.out.println(p4.toString());


    }
}
