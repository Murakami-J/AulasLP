import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // Sempre do tipo java.util
        // Aqui criamos uma lista que aceita qualquer tipo de dado
        List listaLoka = List.of("uva", 80, false, 9.5, "mato");
        System.out.println(listaLoka);

        // Aqui criamos uma lista que só aceita String
        List<String> frutas = List.of("maçã", "uva", "wait");

        // Aqui criamos uma lista que só aceita Double
        List<Double> notas = List.of(9.5, 5.5, 7.0);

        // Lista vazia (não pode criar uma lista vazia com List.of(), pois o List.of() é imutável)
        // Lista criada com List.of() é SOMENTE LEITURA, ou seja, não podemos incluir nem retirar elementos
        // Para que a lista seja leitura E escrita, criamos com new ArrayList<>()
        List<Integer> mundiaisDoPalmeiras = new ArrayList<>();
        System.out.println(mundiaisDoPalmeiras);

        mundiaisDoPalmeiras.add(1951);
        mundiaisDoPalmeiras.add(2026);
        System.out.println(mundiaisDoPalmeiras);

        // Aqui criamos uma lista de leitura e escrita, a lista era de leitura mas como eu queria adicionar mais elementos, coloquei o List.of dentro do ArrayList<>()
        // Aqui criamos uma lista que permite leitura e escrita
        List<String> paises = new ArrayList<>(List.of("Brasil" , "Bolívia", "Perú"));

        // Adicionando um elemento na lista
        paises.add("Chile");
        System.out.println(paises);

        // Removendo um elemento na lista a partir de seu valor
        paises.remove("Bolívia");
        System.out.println(paises);

        System.out.println(paises.get(1));

        // Para tipo Integer
        // Primitivo é posição
        // Wrapper é o valor

        // Pegando o último elemento da lista
        // Java 17
        System.out.println(paises.get(paises.size() - 1));
        // Java 21+
        System.out.println(paises.getLast());

        // Remove apenas a primeira ocorrência
        List<String> ufs = new ArrayList<>(List.of("SP", "RJ", "SP"));
        ufs.remove("SP");
        System.out.println(ufs);

        System.out.println("Número de elmentos na lista: " + ufs.size());

        paises.add("Colômbia");
        paises.add("Costa Rica");

        // Adicionando uma lista de uma vez
        paises.addAll(List.of("Venezuela", "Guiana"));


        // Aqui estamos iterando na lista 
        for(int i = 0; i < paises.size(); i++){
            System.out.println("Países na lista: " + paises.get(i));
        }

        // for(String pais : paises)
        for(var pais : paises){
            System.out.println("Países na lista: " + pais);
        }

        paises.forEach(pais -> {
            System.out.println("Países na lista: " + pais);
        });
    }
}
