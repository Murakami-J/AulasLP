import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NaoJogueTigrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite o valor do prêmio:");
        Double valorPremio = leitor.nextDouble();

        while(valorPremio < 0.50 || valorPremio > 5000){
            System.out.println("Prêmio deve ser entre R$0,50 e R$5.000,00");
            valorPremio = leitor.nextDouble();
        }

        Integer numeroSorte = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Número da Sorte: " + numeroSorte);

        Integer sorteio;
        Integer quantidadeSorteio = 1;
        Integer tentativa = 0;
        do{
            sorteio = ThreadLocalRandom.current().nextInt(1, 101);
            if(numeroSorte == sorteio){
                tentativa = quantidadeSorteio;
            }
           quantidadeSorteio++;
        }while(numeroSorte != sorteio);

        if(tentativa >= 2 && tentativa <= 5){
            valorPremio *= 0.9;
        } else if(tentativa >= 6 && tentativa <= 10){
            valorPremio = valorPremio / 2;
        } else if(tentativa >= 11) {
            valorPremio = 0.0;
        }

        System.out.println("Olá, %s. Seu número foi sorteado na %da tentativa. Seu prêmio será de R$%.2f".formatted(nome, tentativa, valorPremio));
    }
}
