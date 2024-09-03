import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args) {
        /*
        * Peça para o usuário digitar o nome do aluno
        * Peça para o usuário digitar a quantidade de provas que ele fez
        * Peça então para ele digitar a nota de cada uma das provas
        *
        * Então exiba para ele a média de todas as provas
        *
        * "Aluno: XXXXX"
        * "Média: X.XX"
        * */

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = leitor.nextLine();

        System.out.println("Digite a quantidade de provas que você fez:");
        Integer quantidadeProvas = leitor.nextInt();

        Double totalNotas = 0.0;
        for(int prova = 1; prova <= quantidadeProvas; prova++){
            System.out.println("Digite a nota da prova " + prova + ":");
            totalNotas += leitor.nextDouble();
        }

        Double media = totalNotas / quantidadeProvas;
        System.out.println("""
                Aluno: %s
                Média: %.2f
                """.formatted(nome, media));
    }
}
