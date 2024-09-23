import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Usuario {
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento; // Classe do java para manipular datas

    // Encapsulamento serve para esconder os detalhes de processamento do código do usuário

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatador.format(dataNascimento);
    }

    public void setDataNascimento(String dataNascimento) {
        // Por padrão você tem que declarar a data igual os EUA, então para formatar em PT-BR você utiliza o DateTimeFormatter
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // O MM tem que ser maiúsculo pq se não ele reconhece como minutos (MM = mês / mm = minutos)
        // Agora recebemos uma String do usuário e transformamos em LocalDate aqui
        this.dataNascimento = LocalDate.parse(dataNascimento, formatador);
    }

    public Integer getIdade(){
        // Precisa ser Long, pois retorna em um long
        Long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now()); // Calcular quantos anos existem durante 2 datas (entre a dataNascimento e agora)
        return idade.intValue(); // Transformar em int
    }
}
