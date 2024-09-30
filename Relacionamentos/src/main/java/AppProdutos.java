import java.util.List;

public class AppProdutos {
    public static void main(String[] args) {
        // Criamos duas classes e fizemos uma associação simples
        //Vantagens: pode criar quantas categorias quiser, sem precisa alterar o código toda hora para adicionar ou remover categorias

        Categoria cat1 = new Categoria(1, "Eletrônicos", 50.0);
        Categoria cat2 = new Categoria(2, "Móveis", 40.0);
        Categoria cat3 = new Categoria(3, "Frutas", 10.0);

        Usuario us1 = new Usuario("Capybara", "123", true);
        Usuario us2 = new Usuario("Carioca", "321", true);

        var prod1 = new  Produto(1, "Pilha", 10.0, cat1, us1);
        var prod2 = new  Produto(2, "Cartão SD", 150.0, cat1, us1);
        var prod3 = new  Produto(3, "Cadeira de debate", 50.0, cat2, us1);
        var prod4 = new  Produto(4, "Uva", 3.5, cat3, us2);
        var prod5 = new  Produto(5, "Maracujá", 7.0, cat3, us2);

        List<Produto> produtos = List.of(prod1, prod2, prod3, prod4, prod5);
        produtos.forEach(produto ->{
            System.out.println("""
                    Produto: %d - %s
                    Comprado por: %.2f
                    Categoria: %s
                    Será vendido por: R$%.2f
                    Quem cadastrou: %s
                    """.formatted(produto.getCodigo(), produto.getNome(), produto.getPrecoCompra(), produto.getCategoria().getNome(), produto.getPrecoVenda(), produto.getUsuarioCadastro().getLogin()));
            System.out.println();
        });

    }
}
