import java.util.concurrent.ThreadLocalRandom;

public class Programa04 {
    public static void main(String[] args) {

        // Laço de repetição for
        // Utiliza quando você SABE quantas vezes tem q repetir
            System.out.println("For");

            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }

        // Laço de repetição While
        // Utiliza quando você NÃO SABE quantas vezes tem q repetir
            System.out.println("While");

            int contador = 0;
            while(contador < 10){
                System.out.println(contador);
                contador++;
            }

        // Laço de repetição Do While
        // Executa primeiro e depois verifica a condição
            System.out.println("Do While");

            contador = 0;
            do {
                System.out.println(contador);
                contador++;
            } while (contador < 0);

        // Sortear números de 0 a 5 até cair 4
            System.out.println("Sortear Números até achar o 4");

            Integer numeroAleatorio;
            do{
                numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 6);
                System.out.println("Número Sorteado: " + numeroAleatorio);
            } while(numeroAleatorio != 4);

            System.out.println("é 4 pae");
    }
}
