public class Categoria {
    private Integer codigo;
    private String nome;
    private Double margemLucro;

    public Categoria(Integer codigo, String nome, Double margemLucro) {
        this.codigo = codigo;
        this.nome = nome;
        this.margemLucro = margemLucro;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }
}
