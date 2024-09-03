public class Principal {
    public static void main(String[] args) {
        Utilitaria util = new Utilitaria();

        Integer soma = util.somar(2, 3);
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da soma: " + util.somar(2, 3));

        // Da pra pegar o retorno e usar de novo
        Integer soma2 = util.somar(soma, 5);
        System.out.println("Resultado da soma2: " + soma2);

        // Método analisarAluno com retorno
        System.out.println("\n\rRESULTADO DA ANÁLISE");
        System.out.println(util.analisarAluno("Carioca", 5.0, 2.0));
        System.out.println(util.analisarAluno("Raíne", 10.0, 8.0));
        System.out.println(util.analisarAluno("Rafael", 5.0, 6.0));
    }
}
