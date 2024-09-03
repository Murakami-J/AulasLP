public class Utilitaria {

    // Integer somar(Integer numero1, Integer numero2) => Cabeçalho do método
    // {} => Corpo do método
    // Médoto com retorno: você espera que ele devolva algo (espera q ele entregue um resultado)
    // Na dúvida utiliza o método com retorno, nem que seja um true or false
    // Se o método parece um select no banco de dados é com retorno
    Integer somar(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

    /*
        Crie um método chamado analisarAluno
        Ele recebe os seguintes parâmetros:
        - aluno (texto)
        - nota1 (real)
        - nota2 (real)

        Ele retorna um texto que pode ser:
        "Aluno X - Reprovação" - caso a média entre as notas for < 5
        "Aluno X - Recuperação" - caso a média for >= 5 e < 6
        "Aluno X - Aprovação" - caso a média for >= 6

        Teste esse método na classe Principal com os três cenários
     */

    String analisarAluno(String nomeAluno, Double nota1, Double nota2){
        Double media = (nota1 + nota2) / 2;
        String mensagem;

        if(media < 5){
            mensagem = "Aluno(a) %s - Reprovação".formatted(nomeAluno);
        } else if(media < 6){
            mensagem = "Aluno(a) %s - Recuperação".formatted(nomeAluno);
        } else{
            mensagem = "Aluno(a) %s - Aprovação".formatted(nomeAluno);
        }

        // Não pode colocar nada depois do return
        return mensagem;
    }
}
