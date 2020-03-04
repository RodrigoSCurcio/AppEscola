package br.com.kasolution.dominio;

import static br.com.kasolution.util.Formata.*;

public class Aluno {

    private int codigo; //0
    private String nome = "--sem nome ainda--";
    private double notas[] = {0.0, 0.0, 0.0, 0.0};
    private boolean aprovado;//false
    private static double notaMinimaAprovacao = 6;

    //sempre será fornecido se a classe não tiver construtor
    //construtor padrão = não recebe argumento
    public Aluno() {
    }

    public Aluno(int codigo, String nome) {
        setCodigo(codigo);
        this.nome = nome;
    } // fim construtor

    public Aluno(int codigo, String nome, double[] notas) {
        setCodigo(codigo);
        this.nome = nome;
        setNotas(notas);
    } // fim construtor

    public void imprime() {
        System.out.println("Aluno: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Notas: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println("Média: " + formata(calculaMedia()));
        System.out.print("\nSituação: ");
        if (aprovado) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        } //fim if
    }//fim imprime

    public static double getNotaMinimaAprovacao() {
        return notaMinimaAprovacao;
    }

    public static void setNotaMinimaAprovacao(double notaMinimaAprovacao) {
        Aluno.notaMinimaAprovacao = notaMinimaAprovacao;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setCodigo(int codigo) {
        if (codigo < 1) {
            System.out.println("Código não permitido! Alterando para o"
                    + " default (0)");
            this.codigo = 0;
        } else {
            this.codigo = codigo;
        }//fim if
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double[] notas) {
        for (double n : notas) {
            if (n < 0) {
                System.out.println("Valor negativo não permitido!");
                return;
            }
        }//fim for
        this.notas = notas;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    public double calculaMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n; //soma = soma + n;
        }//fim for
        double media = soma/notas.length;        
        aprovado = (media >= notaMinimaAprovacao);
        return media;
    }//fim calculaMedia
}//fim classe
