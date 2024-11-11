public class Atirador extends Atleta{

    @Override
    public void treinar() {
        System.out.println("Atirador %s, que é o %dº do ranking treinando tiro numa mira".formatted(nome, ranking));
    }
}
