public class Cachorro {

    // Aqui criamos a função 'latir'
    // Como está dentro de uma Classe chamamos de MÉTODO
    // Método 'latir'
    void latir(){
        System.out.println("Cachorro latindo... auauau");
    }

// ====================================================================================

    // Aqui criamos a função 'farejar'
    // Parenteses sem nada dentro significa que o método funciona mesmo sem parâmetros, ele fareja.
    void farejar(){
        System.out.println("Cão farejando... snif snif");
    }

// ====================================================================================

    // Parenteses com parâmetros indica se o método precisa de algo para funcionar
    // O cachorro vai comer, mas vai comer o que? Ele precisa saber o que vai comer (parâmetros)
    // Aqui criamos um método com 1 PARÂMETRO (String alimento)
    // void = não vai retornar nada
    void comer(String alimento){
        // Dentro do método os parâmetros são como variáveis
        System.out.println("Cachorro comendo %s".formatted(alimento));
    }

// ====================================================================================

    // Aqui criamos um método com 2 PARÂMETROS (String local e Integer minutos)
    void passear(String local, Integer minutos){
        System.out.println("Cachorro passeando em: %s. Por %d minutos".formatted(local, minutos));
    }

// ====================================================================================
    /*
    * Método 'receberVacina'
    * Parâmetros: vacina(texto), preco(real), veterinario(a) (texto)
    * "Cachorro recebendo a vacina X, que custou R$Y pelo(a) dr(a) Z"
    */

    void receberVacina(String vacina, Double preco, String veterinario){
        System.out.println("Cachorro recebendo a vacina %s, que custou R$%.2f pelo(a) dr(a) %s".formatted(vacina, preco, veterinario));
    }

// ====================================================================================
    /*
     * Método 'calcularPreco'
     * Parâmetros: raca(texto), Se é nobre (booleano), Se é fêmea(booleano)
     * "Um exemplar da raça X, por ser nobre e fêmea, custa R$ Y"
     * Regras:
     * - A frase do meio pode ser "por ser nobre" ou "por NÃO ser nobre"
     * - na frase pode constar "fêmea" ou "macho"
     * - O valor de Y é no mínimo 500. Se for de raça nobre, multiplica x10
     * - Se for fêmea multiplica por x3
     */

    // Void = não retorna nada
    // Colocar o tipo da variável que eu quero retornar no luigar do void
    Double calcularPreco(String raca, Boolean nobre, Boolean femea){
        Double valorTotal = 500.00;
        String mensagemNobre = nobre ? "ser nobre" : "NÂO ser nobre";
        String mensagemSexo = femea ? "fêmea" : "macho";

        if(nobre){
            valorTotal *= 10;
        }

        if(femea){
            valorTotal *= 3;
        }

        System.out.println("Um exemplar da raça %s, por %s e %s, custa R$%.2f".formatted(raca, mensagemNobre, mensagemSexo, valorTotal));
        return valorTotal;
    }
// ====================================================================================
    public static void main(String[] args) {
        System.out.println("Iniciando app de achororos");

        Cachorro cao = new Cachorro();
        cao.latir();
        cao.farejar();
        cao.latir();

        cao.comer("resto do almoço");
        cao.comer("ração");

        cao.passear("parque", 19);
        cao.receberVacina("raiva", 100.00, "Raíne");

        Double preco1 = cao.calcularPreco("Border Collie", true, true);
        System.out.println(preco1);
        cao.calcularPreco("Papilon", true, false);
        cao.calcularPreco("Poodle", false, false);
    }
}
