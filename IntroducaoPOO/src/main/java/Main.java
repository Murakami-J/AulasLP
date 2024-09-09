import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Objetos representam coisas do mundo real

        // bilhete1 e bilhete2 == instância
        BilheteUnico bilhete1 = new BilheteUnico();

        bilhete1.saldo = 0.0;
        bilhete1.numero = "12345";
        bilhete1.estudante = false;
        bilhete1.nomeTitular = "Manoel";

        bilhete1.recarregar(20.0);
        System.out.println(bilhete1.saldo);

        BilheteUnico bilhete2 = new BilheteUnico();
        bilhete2.saldo = 0.0;
        bilhete2.numero = "54321";
        bilhete2.estudante = true;
        bilhete2.nomeTitular = "Yoshi";

        System.out.println(bilhete2.saldo);

        // Assim irá repetir muito código, então é melhor criar um método para utilizar várias vezes
        System.out.println("""
                Nome: %s
                Saldo: %.2f
                Estudante: %b
                Número: %s
                """.formatted(bilhete1.nomeTitular, bilhete1.saldo, bilhete1.estudante, bilhete1.numero));

        System.out.println("""
                Nome: %s
                Saldo: %.2f
                Estudante: %b
                Número: %s
                """.formatted(bilhete2.nomeTitular, bilhete2.saldo, bilhete2.estudante, bilhete2.numero));

        bilhete1.exibirInformacoes();
        bilhete2.exibirInformacoes();

        bilhete1.utilizar(false);
        bilhete1.utilizar(true);
        bilhete2.utilizar(false);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter a = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String b = now.format(a);
        System.out.println(b);


    }
}
