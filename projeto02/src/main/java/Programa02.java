public class Programa02 {
    public static void main(String[] args) {
        /*
            Os tipos String, Double, Integer e Boolean são chamados de tipos wrapper ou classes wrapper
        */

        // Podemos declarar variáveis como null (sem valor)
            String nome = null;

        // Na sequência o valor poderia ser informado pelo usuário
            System.out.println("Nome " + nome);

        // Aqui apenas DECLARAMOS uma variável, mas não inicializamos
            Double peso;
        // A linha abaixo nem compila porque 'peso' não tem valor
        // System.out.println("Peso: " + peso);

        peso = null;
        System.out.println("Peso " + peso);

        /*
        Tipos PRIMITIVOS:
        Possuem só e somente um valor.
        Não é possível invocar funções a partir deles (Ex: .toUpperCase())

        -> Eles NÃO aceitam null!
        */

        int filhos; // Primitivo do Integer
        double altura = 2.11;  // Primitivo do Doule
        boolean jaViajou = false; // Primitivo do Boolean
        char sistemaAtivo = 's'; // Tipo primitivo que só aceita 1 letra
        // char é com aspas simples e sempre só com 1 letra

        filhos = 0;
        System.out.println("Filhos: " + filhos);


        // O tipo primitivo só aceita o número, não chama nenhuma função
    }
}
