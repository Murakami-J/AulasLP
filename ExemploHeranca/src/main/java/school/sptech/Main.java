package school.sptech;

import school.sptech.alunocdf.AlunoCdf;
import school.sptech.alunopos.AlunoPos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Herança: classes que herdam comportamentos e características
        // Todas as classes são derivadas de uma classe pai (origem), chamada "Object"

        // Relacionamento (Agregação/Composição): TEM UM (Ex: Biblioteca TEM UM livro)
        // Herança: É UM (Ex: Cachorro É UM Pet)

        Aluno aluno1 = new Aluno("Manoel Almeida", 7.0, 5.8, 8.5);
        System.out.println(aluno1);

        AlunoPos aluno2 = new AlunoPos("João Pedro", 7.0, 10.0, 8.0, 9.0);
        System.out.println(aluno2);

        AlunoPos aluno3 = new AlunoPos("Michael Jackson", 8.0, 7.0, 6.0, 10.0);

        // Polimorfismo: uma coisa assumir várias formas, ou seja, o calcularMedia assume várias formas dependendo de qual contexto(objeto) você ta chamando ele

        /*
            O código abaixo funciona porque todo AlunoPos é um Aluno
            Sempre começamos da esquerda com a superClasse
            Aqui nós DECLARAMOS como Aluno e INSTANCIAMOS como AlunoPos
         */
        Aluno alunoTeste = new AlunoPos(
                "Maria Bigodenha",
                9.0,
                8.0,
                7.0,
                9.0
        );

        /*
            A partir daqui o alunoTeste pode invocar métodos de Aluno (e SOMENTE dela)
            Porque só podemos invocar métodos do tipo DECLARADO (Aluno)

            O código abaixo NÃO compila pois a superclasse está na IMPLEMENTAÇÃO e não na DECLARAÇÃO
            AlunoPos alunoTeste2 = new Aluno(...);
         */

        /*
            Em tempo de Execução (Runtime), o Java executa a versão do método do tipo da INSTÂNCIA e NÃO da declaração
            Nesse caso, o 'alunoEspecial' executará os métodos de AlunoCdf
        */
        Aluno alunoEspecial = new AlunoCdf();
        System.out.println("Média: " + alunoEspecial.calcularMedia());
        // Executará o calcularMedia() de AlunoCdf


        Aluno dinamico;
        System.out.println("""
            Qual tipo?
            1 - Pós
            2 - Comum
            NDA - CDF
            """);
        String tipo = new Scanner(System.in).nextLine();

        switch (tipo){
            case "1":
                dinamico = new AlunoPos("Zeca", 10.0, 9.0, 8.0, 6.5);
                break;
            case "2":
                dinamico = new Aluno("Joana", 8.0, 7.0, 6.0);
                break;
            default:
                dinamico = new AlunoCdf();
        }

        System.out.println("Média do dinâmico: " + dinamico.calcularMedia());

        /*
            Opperador 'instanceof': Verifica se um objeto é de uma determinada classe
        */
        if(dinamico instanceof AlunoPos){
            /*
                Na linha de baixo  fizemos a técnica chamada CAST
                Fizemos um CAST do objeto 'dinamico' para o tipo AlunoPos
                NÃO É UMA CONVERSÃO, ele cria um objeto e faz ele se comportar de x maneiras (pega o objeto 'dinamico' e faz ele se comportar como se fosse AlunoPos)
                Um CAST é pedir para um objeto se comportar como algo
             */
            AlunoPos dinamicoPos = (AlunoPos) dinamico;
            System.out.println(dinamicoPos.getNotaTCC());

            // É possível fazer um CAST sem criar variável, apenas para invocar método
            System.out.println( ((AlunoPos)dinamico).getNotaTCC());

        }

        /*
            Aqui nós, numa mesma instrução, verificamosse 'dinamico' é um AlunoCdf, SE FOR, já é criado a variável 'dinamicoCdf' que será do tipo AlunoCdf
        */
        if(dinamico instanceof AlunoCdf dinamicoCdf){
            System.out.println(dinamicoCdf.getMetodoCdf());
        }

        Faculdade faculdade1 = new Faculdade("SPTech", "Rua Haddock Lobo 595");
        faculdade1.matricularAluno(aluno1);
        faculdade1.matricularAluno(aluno2);
        faculdade1.matricularAluno(alunoTeste);
        faculdade1.matricularAluno(aluno3);
        faculdade1.exibirAlunos();

        faculdade1.exibirAlunosPosGraduacao();
        System.out.println(faculdade1.calcularMediaNotasTcc());
    }
}