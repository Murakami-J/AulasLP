public class AppAtletas {
    public static void main(String[] args) {
        /*
            A linha abaixo NÃO compila!!
            Não podemos instanciar/criar um objeto com um tipo abstrato

            Atleta atleta1 = new Atleta();
        */

        /*
            Aqui nós declaramos os objetos com tipos ABSTRATOS, porém as instâncias são de tipos CONCRETOS
        */
        Atleta atleta1 = new Maratonista();
        Atleta atleta2 = new Atirador();

        atleta1.setNome("Zé Ruela");
        atleta1.setRanking(9);

        atleta2.setNome("João Calvo");
        atleta2.setRanking(3);

        atleta1.treinar();
        atleta2.treinar();

        atleta1.hidratarSe();
        atleta2.hidratarSe();
    }
}
