package br.inatel.poo.turmas;

public class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    // Construtor inicializando o array de alunos
    public Turma(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            System.out.println(aluno.getNome() + " adicionado(a) com sucesso!");
        } else {
            System.out.println("Erro: A turma já está cheia.");
        }
    }

    public void listarAlunos() {
        System.out.println("\n--- Lista de Alunos da Turma ---");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i] != null) {
                alunos[i].mostraInfo();
            }
        }
    }

    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) return null;

        Aluno melhorAluno = alunos[0];
        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i] != null && alunos[i].calculaMedia() > melhorAluno.calculaMedia()) {
                melhorAluno = alunos[i];
            }
        }
        return melhorAluno;
    }
}