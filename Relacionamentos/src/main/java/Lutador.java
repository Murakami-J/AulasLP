import java.util.ArrayList;
import java.util.List;

public class Lutador {
    private String nome;
    private Double peso;

    public Lutador(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Aqui fizemos uma Associaçãodo tipo COMPOSIÇÃO
    // Quando fazemos associações com List é recomendável a lista nascer vazia
    private List<Luta> lutas = new ArrayList<>();

    public Integer getTotalLutas(){
        return lutas.size();
    }

    public Integer getVitorias(){
        int vitorias = 0;

        /*
            Neste for abaixo estamos iterando em cada um dos elementos da lista 'lutas'
            Dentro do for, cada elemento da lista terá o nome de 'luta'
         */
        for(var luta : lutas){
            if(luta.getVencedor() != null && luta.getVencedor().equals(this)){
                vitorias++;
            }
        }
        return vitorias;
    }

    public Integer getDerrotas(){
        /*
            .count(): contagem de algo, sempre retorna Long
            .valueOf() e .intValue(): transformar em int
            .stream(): operação avançada do java com o propósito de reduzir códigos de lista
            .filter(): é usado dentro do .stream(), passa primeiro o objeto da lista e depois do -> passa o filtro que você quer retornar
        */
        return Long.valueOf(lutas.stream().filter(luta -> luta.getVencedor() != null && !luta.getVencedor().equals(this)).count()).intValue();
    }

    public Integer getEmpate(){
        int empates = 0;

        for(var luta : lutas){
            if(luta.getVencedor() == null){
                empates++;
            }
        }
        return empates;
    }

    public Integer getEmpatesV2(){
        int empates = (int) lutas.stream().filter(luta -> luta.getVencedor() == null).count();

        return empates;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public List<Luta> getLutas() {
        return lutas;
    }
}