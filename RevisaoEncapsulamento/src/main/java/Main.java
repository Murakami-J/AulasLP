import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Manoel", "manoel@gmail.com");

        usuario1.setCpf("12345678901");
        // usuario1.setDataNascimento(LocalDate.parse("2000-11-28")); // Tem que criar um objeto do tipo LocalDate

        // O usuário não sabe usar o LocalDate, então vamos pedir somente o texto da data de nascimento
        usuario1.setDataNascimento("11/10/2000");

        System.out.println("Data de nascimento: " + usuario1.getDataNascimento());
        System.out.println("Idade: " + usuario1.getIdade());

        if(usuario1.getNome().equals("Manoel")){
            System.out.println("Igual");
        } else{
            System.out.println("Diferente");
        }
    }
}
