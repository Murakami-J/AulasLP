/*
    Aqui temos uma classe CONCRETA que IMPLEMENTA uma classe ABSTRATA
*/
public class Maratonista extends Atleta{

    /*
        Aqui fomos OBRIGADOS a implementar o método treinar(), porque ele é ABSTRATO na classe Atleta
        Em classes CONCRETAS NÃO podemos criar métodos ABSTRATAS
    */
    @Override
    public void treinar() {
        System.out.println("Maratonista %s, na posição %d do ranking treinando correndo 5km".formatted(nome, ranking));
    }
}
