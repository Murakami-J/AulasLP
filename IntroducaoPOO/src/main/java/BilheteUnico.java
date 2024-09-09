public class BilheteUnico {
    String nomeTitular;
    Boolean estudante;
    Double saldo;
    String numero;

    void recarregar(Double valorRecarga){
        if(valorRecarga < 2.0){
            System.out.println("Valor insuficiente para recarga");
            return; // break
        }

        if(valorRecarga + saldo > 250.0){
            System.out.println("Limite ultrapassado");
            return;
        }

        saldo += valorRecarga;
    }

    void exibirInformacoes(){
        System.out.println("""
                Nome: %s
                Saldo: %.2f
                Estudante: %b
                Número: %s
                """.formatted(nomeTitular, saldo, estudante, numero));
    }

    Boolean utilizar(Boolean integracao){
        if(integracao){
            System.out.println("Saldo debitado R$ 0,00");
            return true;
        }

        Double precoPassagem = estudante ? 2.5 : 5.0;

        if(saldo >= precoPassagem){
            System.out.println("Saldo debitado R$ 5,00");
            saldo -= 5.0;
            return true;
        }

        System.out.println("Saldo insuficiente");
        return false;
    }
}
