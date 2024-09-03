import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        // Ao final de toda instrução (linha de código) o ; é obrigatório
        System.out.println("É nóis no 2º Semestre!! :D");
        System.out.println("Aí sim pae!!");

        /* Atalhos
            main tab: Escreve automaticamente o código main
            sout tab: Escreve automaticmanete o System.out.println();
            Ctrl D: Duplicar linha
            Ctrl Shift Seta: mover a linha toda
            Ctrl Shift /: Comentar linhas
        */

        // ====================================================================================

            // TIPAGEM ESTÁTICA
            String bairro = "Saúde";  // texto
            Integer populacao = 10000; // num inteiro
            Boolean temParque = false; // lógico ou booleano
            Double idh = 0.85; // num rel

            // TIPAGEM DINÂMICA
            var cidade = "Belo Horizonte"; // texto
            var veiculos = 50_000; // num inteiro
                // tem como usar o underline para separar os numeros para facilitar a leitura, não muda o nada, só por questões de visualização
            var temMetro = false; // num booleano
            final var a = true; // final var == const

        // ====================================================================================

            // Concatenação
            System.out.println("No bairro " + bairro + " tem parque? " + temParque);

            // Interpolação
            System.out.println("Na cidade %s há %d veículos".formatted(cidade, veiculos));
            System.out.println("Moro no bairro %s e o metro quadrado lá é %.2f".formatted(bairro, (100/3.0)));
                /*
                    %s: Indica que entrará um texto (String)
                    %d: Indica que entrará um número INTEIRO (Integer)
                    %.2f: Indica que entrará um número real (Double), 2 indica a quantidade de casas decimais
                */

        // ====================================================================================

            System.out.println("Linha 1\r\nLinha 2\r\nLinha 3");
                /*
                    \r: Quebra de linha no Linux/Mac
                    \n: Quebra de linha no Windows
                    Coloca os dois para ter certeza que irá quebrar a linha independente do SO
                */

            // Multiline String -> texto entre """
            System.out.println("""
                            Linha 1
                            Linha 2
                            Linha 3
                            Linha 4
                            """);

        // Não Compilou: Erro no código
    }
}
