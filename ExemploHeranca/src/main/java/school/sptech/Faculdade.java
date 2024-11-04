package school.sptech;

import school.sptech.alunocdf.AlunoCdf;
import school.sptech.alunopos.AlunoPos;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private String endereco;
    private List<String> cursos;
    private List<Aluno> alunos;

    public Faculdade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void exibirAlunos(){
        System.out.println("\nExibindo os alunos da faculdade: %s".formatted(nome));
        for(Aluno aluno : alunos){
            System.out.println("Nome: %s ".formatted(aluno.getNome()));
            System.out.println("Média: %.2f ".formatted(aluno.calcularMedia()));
        }

    }

    public void exibirAlunosPosGraduacao(){
        System.out.println("\nExibindo somente os alunos da Pós Graduação");
        for(Aluno aluno : alunos){
            if(aluno instanceof AlunoPos){
                System.out.println("Nome: " + aluno.getNome());
            }
        }
    }

    public Double calcularMediaNotasTcc(){
        System.out.println("\nExibindo média de notas of TCC");
        Double somaNotasTcc = 0.0;
        Integer qtdAluno = 0;
        for (Aluno aluno : alunos) {
            if(aluno instanceof AlunoPos alunoPos){
                somaNotasTcc += alunoPos.getNotaTCC();
                qtdAluno++;
            }
        }
        return somaNotasTcc / qtdAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
