import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // Scanner = ler entrada de dados, ele também consegue ler arquivos tipo texto, csv, etc
        // Scanner é como se fosse um tipo, então a variável leitor é do tipo Scanner
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble();

        System.out.println("""
                Olá, %s
                Idade: %d
                Altura: %.2f
                """.formatted(nome, idade, altura));

        leitor.close();
    }
}
