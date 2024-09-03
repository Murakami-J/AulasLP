public class Programa01 {

    public static void main(String[] args) {
        var idade = 19;

        if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Vai jogar playstation!");
        }

        // OPERADOR TERNÁRIO -> [Teste Lógico] ? [valor se true] : [Valor se false]
        System.out.println(idade >= 18 ? "Maioridade" : "Infâncaia");

        Double auxilio = idade < 12 ? 350.00 : 200.15;
        System.out.println("Auxílio: R$%.2f" .formatted(auxilio));


        /* Exercício de Lousa
        Criar duas variáveis reais (nota1 e nota2). Dê quaisquer valores enre 0 e 10 para
        elas.

        Se a média entre elas for menor que 6.0, exiba "#tenteOutraVez". Caso contrário,
        exiba "#aíSim!"

        Resolva com operador ternário.
        */

        Double n1 = 7.0;
        Double n2 = 3.0;
        Double media = (n1 + n2) / 2;

        // Solução 1
        System.out.println(media >= 6 ? "#aíSim" : "#tenteOutraVez");

        // Solução 2
        String resultado = media >= 6 ? "#aíSim" : "#tenteOutraVez";
        System.out.println(resultado);
    }

}