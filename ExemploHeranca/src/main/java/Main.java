public class Main {
    public static void main(String[] args) {
        // Herança: classes que herdam comportamentos e características
        // Todas as classes são derivadas de uma classe pai (origem), chamada "Object"

        // Relacionamento (Agregação/Composição): TEM UM (Ex: Biblioteca TEM UM livro)
        // Herança: É UM (Ex: Cachorro É UM Pet)

        Aluno aluno1 = new Aluno("Manoel Almeida", 7.0, 5.8, 8.5);
        System.out.println(aluno1);

        AlunoPos aluno2 = new AlunoPos("João Pedro", 7.0, 10.0, 8.0, 9.0);
        System.out.println(aluno2);

        // Polimorfismo: uma coisa assumir várias formas, ou seja, o calcularMedia assume várias formas dependendo de qual contexto(objeto) você ta chamando ele
    }
}
