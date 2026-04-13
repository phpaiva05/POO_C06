package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turmaC06 = new Turma(10);

        Aluno a1 = new Aluno("Pedro", "101", new double[]{8.5, 9.0, 9.5});
        Aluno a2 = new Aluno("Ze", "102", new double[]{7.0, 8.5, 8.0});
        Aluno a3 = new Aluno("Fulano", "103", new double[]{9.5, 9.8, 10.0});

        turmaC06.adicionarAluno(a1);
        turmaC06.adicionarAluno(a2);
        turmaC06.adicionarAluno(a3);

        turmaC06.listarAlunos();
        
        System.out.println("--- Melhor Aluno da Turma ---");
        Aluno melhor = turmaC06.buscarMelhorAluno();

        if (melhor != null) {
            System.out.println("O melhor aluno é: " + melhor.getNome() +
                    " com média " + String.format("%.2f", melhor.calculaMedia()));
        }
    }
}