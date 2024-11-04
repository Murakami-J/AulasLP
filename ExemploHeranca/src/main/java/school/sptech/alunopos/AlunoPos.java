package school.sptech.alunopos;/*
    Aluno é SUPERCLASSE (ou classe Base) de AlunoPos
    AlunoPos é SUBCLASSE (ou classe Derivada) de Aluno

    Uma Subclasse herda tudo que não é private!!!98
    default (ou package): é quando não tem nem private nem public nem protected
*/

import school.sptech.Aluno;

public class AlunoPos extends Aluno {
    private Double notaTCC;


    public AlunoPos(String nome, Double nota1, Double nota2, Double nota3, Double notaTCC) {
        // Super Classe = classe mãe
        // Sub Classe = classe filha
        super(nome, nota1, nota2, nota3);
        this.notaTCC = notaTCC;
        // Esse super significa que eu estou chamando o construtor da classe Aluno, o AlunoPos passa as informações para a classe Aluno chamando esse construtor

        // super é como se fosse o this, da para chamar os getters/setters assim: super.getNome();
    }

    public Double getNotaTCC() {
        return notaTCC;
    }

    public void setNotaTCC(Double notaTCC) {
        this.notaTCC = notaTCC;
    }

    @Override
    public Double calcularMedia() {
        return (getNota1() + getNota2() + getNota3() + notaTCC) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlunoPos{" +
                "notaTCC=" + notaTCC +
                '}';
    }
}
