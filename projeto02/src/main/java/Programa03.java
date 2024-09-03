import java.util.concurrent.ThreadLocalRandom;

public class Programa03 {
    public static void main(String[] args) {
        // Convertendo texto em inteiro
            String nota1Txt = "9";
            Integer nota1Wrapper = Integer.valueOf(nota1Txt);
            int nota1Primitivo = Integer.parseInt(nota1Txt);

        // OBS: Na prática qualquer um dos métodos serve porém, o mais apropriado tem mais desempenho
        // Ou seja: utilize valueOf para tipo Rapper e parseInt para tipo primitivo

        // Convertendo texto em Double
            String altura1Txt = "1.99";
            Double altura1Wrapper = Double.valueOf(altura1Txt);
            double altura1Primitivo = Double.parseDouble(altura1Txt);


       // Sortear um número inteiro aleatório de 0 a 2
            int x = ThreadLocalRandom.current().nextInt(0, 3);
            System.out.println(x);
        // 0: Limite fechado
        // 3: Limite aberto
        // Ou seja, o 0 tem como cair no random, mas o 3 nunca irá aparecer, sempre irá parar no 2

        // Sortear um número real aleatório de 0 a 3.03
            double y = ThreadLocalRandom.current().nextDouble(0, 3.03);
            System.out.println(y);
    }
}
