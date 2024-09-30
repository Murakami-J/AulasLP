public class Produto {
    private Integer codigo;
    private String nome;
    private Double precoCompra;

    // Aqui temos um relacionamento, uma associação entre Produto e Categoria (como se fosse um relacionamento em tabelas de banco de dados)
    /*
        Não faz sentido uma Categoria sem Produto
        Quando isso ocorre,temos uma associação do tipo COMPOSIÇÃO
     */
    private Categoria categoria;


    /*
        Aqui também temos uma associação. Porém, faz sentido um Usuário existir memso que não esteja em nenhum Produto.
        Nesse caso temos uma AGREGAÇÃO
     */
    private Usuario usuarioCadastro;

    public Produto(Integer codigo, String nome, Double precoCompra, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.categoria = categoria;
    }

    public Produto(Integer codigo, String nome, Double precoCompra, Categoria categoria, Usuario usuarioCadastro){
        /*
            A linha de baixo invoca o construtor já existente, o de cima aqui no código e só adiciona o novo atributo que não existia no construtor anterior
            Caso você queira criar outro construtor com os mesmos atributos
            Vantagem: não precisa ficar repetindo código é só chamar o construtor anterior e adicionar o novo atributo
         */
        this(codigo, nome, precoCompra, categoria);
        this.usuarioCadastro = usuarioCadastro;
    }

    /*
         Se a margem de lucro da categoria for 50%, o preço de venda do produto será preço de compra + 1,5
         1 + (50 / 100) = 1,5
    */

    public Double getPrecoVenda(){
        return precoCompra * (1 + categoria.getMargemLucro() / 100);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Usuario getUsuarioCadastro() {
        return usuarioCadastro;
    }
}
