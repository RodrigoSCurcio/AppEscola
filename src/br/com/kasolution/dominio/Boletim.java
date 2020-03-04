package br.com.kasolution.dominio;

public class Boletim {
    private int codigo;
    private String turma;
    private Aluno[] alunos;
    
    public Boletim() {
    }

    public Boletim(int codigo, String turma, Aluno[] alunos) {
        this.codigo = codigo;
        this.turma = turma;
        this.alunos = alunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public void imprime() {
        System.out.println("Boletim: " + codigo);
        System.out.println("Turma: " + turma);
        System.out.println("\n[-- RELAÇÃO DE ALUNOS NOTAS E MÉDIAS --]");
        for (Aluno a : alunos) {
            a.imprime();
            System.out.println();//pula uma linha
        }//fim for
    }//fim imprime
}
