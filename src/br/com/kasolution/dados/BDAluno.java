package br.com.kasolution.dados;

import br.com.kasolution.dominio.Aluno;

public class BDAluno {
    //CTRL+SHIT+I importar alunos
    private Aluno[] alunos = {
        new Aluno(100, "Paulo José", new double[]{6.5, 6.0, 5.0, 6.0}),
        new Aluno(200, "Marcelo Rocha", new double[]{5.5, 5.0, 5.0, 6.0}),
        new Aluno(300, "Sylvia Cristina", new double[]{8.5, 8.0, 7.5, 8.0}),
        new Aluno(400, "Carlos Eduardo", new double[]{5.5, 8.0, 7.0, 6.0}),
        new Aluno(500, "Renata Oliveira", new double[]{6.5, 7.0, 7.0, 3.0})
    };//fim vetor

    public Aluno[] getAlunos() {
        return alunos;
    }
}
