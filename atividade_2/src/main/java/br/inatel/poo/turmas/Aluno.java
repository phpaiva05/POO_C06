package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calculaMedia() {
        if (notas == null || notas.length == 0) return 0.0;
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void mostraInfo() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula);
        System.out.println("Média: " + String.format("%.2f", calculaMedia()));
        System.out.println("---------------------------------");
    }

    public String getNome() {
        return nome;
    }
}