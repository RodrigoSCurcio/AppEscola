package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;

public class TesteAluno02 {
    public static void main(String[] args) {
        //CTRL + SHIFT + I => importação de Aluno
        Aluno aluno = new Aluno(-15, "Teste");
        aluno.imprime();
        aluno.setCodigo(-15);
        aluno.setNotas(new double[]{1, 1, -1, -1});
        aluno.imprime();
    }//fim main
}
