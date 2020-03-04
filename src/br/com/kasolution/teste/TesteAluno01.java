package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;

public class TesteAluno01 {

    public static void main(String[] args) {
        System.out.println("Dados do aluno: ");
        //importação CTRL+SHIT+I
        Aluno aluno = new Aluno(6100, "Marcelo");
        System.out.println("Aluno: " + aluno.getCodigo());
        //sout+TAB = System.out.println()
        System.out.println("Nome: " + aluno.getNome());
    }
}
