// Aeui definimos uma classe ABSTRATA
public abstract class Atleta {
    protected String nome;
    protected Integer ranking;

    // Uma Classe abstrata PODE ter métodos abstratos
    // Um método abstrato só tem assinatura, NÃO TEM CORPO!
    public abstract void treinar();

    // Uma Classe abstrata também pode ter métodos concretos!
    public void hidratarSe(){
        System.out.println("Atleta %s bebendo líquido".formatted(nome));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
