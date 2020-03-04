package br.com.kasolution.teste;

import br.com.kasolution.dados.BDAluno;
import br.com.kasolution.dominio.Aluno;
import br.com.kasolution.dominio.Boletim;
import static br.com.kasolution.util.Formata.formata;
import java.time.LocalDateTime;

public class TesteBoletim {

    public static void main(String[] args) {
        Boletim boletim = new Boletim();
        Aluno alunos[] = new BDAluno().getAlunos();
        alunos[1].setNotaMinimaAprovacao(5); //Marcelo Rocha
        boletim.setCodigo(10);
        boletim.setTurma("Turma Java 1o. Semestre");
        boletim.setAlunos(alunos);
        boletim.imprime();
        System.out.println("Data da impressão: "
                + formata(LocalDateTime.now()));
    }
}
