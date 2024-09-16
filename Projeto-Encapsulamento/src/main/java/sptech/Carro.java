package sptech;

public class Carro {
    /* Um atributo private só pode ser acessado dentro da classe
       Em outras classes não pode nem ser alterado nem lido

        Atributos privados só podem ser alterados por outra classe:
            - nos construtores
            - por meio de métodos públicos

        Atributos privados só podem ser lidos por outra classe:
            - por meio de métodos públicos (por exemplo, um método getter)

        Quando temos atributos privados que podem ser alterados ou lidos por meio de construtores e/ou métodos públicos, estamos implementando o conceito de ENCAPSULAMENTO
     */

    // É uma boa prática declarar os atributos como private
    private String modelo;
    private String cor;
    private Integer anoFabricacao;

    // É possível definir atributos com valores padrão
    // Aqui estamos dizendo com quais valores os atributos devem ser inicializados
    private Integer quilometragem = 0;
    private Double combustivel = 0.0; // nasce com esse valor
    private Integer marcha = 0;

    private Double capacidadeTanque;

    /*
    Aqui temos um construtor, que é um método especial que é chamado quando um objeto é instanciado.

    O construtor NÃO influencia nos atributos com valor padrão.
    A não ser que isso esteja EXPLICITAMENTE definido no construtor.

    Os construtores são uma forma de implementar o conceito de Encapsulamento.
    */
    public Carro(String modelo, String cor, Integer anoFabricacao, Double capacidadeTanque) {
        // Os que começam com this são atributos do objeto.
        // Os demais são parâmetros do objeto
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTanque = capacidadeTanque;

        /*
        * Um método construtor é um método normal.
        * Tudo que está codificado dentro dele é executado quando o objeto é instanciado
        * */

        System.out.println("Um novo carro acaba de ser criado");
    }

    // Podemos ter mais de um construtor
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    /*
        Quando criamos construtores que recebem valores, caso desejamos que o objeto seja instanciado sem valores, temos que criar um construtor sem parâmetros explicitamente
    */
    public Carro() {
    }

    /*
        Aqui usamos um padrão de nome de método chamado getter, que faz parte do padrão JavaBeans
        Quando um método público tem como objetivo retornar um dado ou informação de um objeto, ele começa com 'get' ou 'is' (nesse caso só para boleanos)
    */
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    /*
        Um getter pode ser usado para retornar também uma INFORMAÇÃO, ou seja, algo que usa os dados e alguma regra para retornar um valor
    */

    public String getAnoFabricacao() {
        if(anoFabricacao == null){
            return "<Ainda não definido>";
        }

        // retorna o anoFabricacao em string
        return anoFabricacao.toString();
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public Double getCombustivel() {
        return combustivel;
    }

    /*
        Altere o getMarcha para retornar a marcha atual do carro:
        Caso a marcha seja entre 1 e 5, retornar seu valor normalmente.
        Caso a marcha seja 0, retornar "Neutro"
        Caso a marcha seja -1, etornar "Ré"
        Caso seja -2, retornar "P"
    */
    public String getMarcha() {
        return switch(marcha){
            case null -> "Neutro";
            case 0 -> "Neutro";
            case -1 -> "Ré";
            case -2 -> "P";
            default -> marcha.toString();
       };
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    /*
    Aqui, como não existe um atributo chamado "ipva", dissemos que esse getter é um:
    Campo Calculado OU
    Campo Virtual OU
    Atributo Virtual OU
    Atributo Calculado

        Regra de IPVA:
        - 1000 s a quilometragem for entre 0 e 2000
        - 700 se a quilometragem for mais que 2000 até 10000
        - 500 se a quilometragem for mais de 10000
    */
    public Double getIPVA(){
        if(quilometragem >= 0 && quilometragem <= 2000){
            return 1000.0;
        } else if(quilometragem > 2000 && quilometragem <= 10_000){
            return 700.0;
        }

        return 500.0;
    }

    /*
        Campo Virtual: isNaReserva()
        Retorna boolan
        Um carro está na reserva se o combustível for menor que 10% da capacidade do tanque

        Como retorna um Boolean, o método começa com 'is'
    */

    public Boolean isNaReserva(){
        return combustivel < capacidadeTanque * 0.1;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    /*
        Aqui temos um setter.
        Também faz parte do padrão JavaBeans.
        E também é uma forma de implementar o Encapsulamento
    */
    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    /*
        A ordem dos métodos não importa.
        Portanto, a ordem dos getters e setter também não importa.
    */

    // Considerando que o carro tem no máximo 5 marchas
    public void aumentarMarcha(){
        if(marcha < 5){
            marcha++;
        }
    }

    public void reduzirMarcha(){
        if(marcha > -2){
            marcha--;
        }
    }

    public void re(){
        marcha = -1;
    }

    public void neutro(){
        marcha = 0;
    }

    public void estacionamento(){
        marcha = -2;
    }

    /*
        Encapsulamento: proteger o código (private, get, set)
        Quanto mais métodos o atributo tem, mais encapsulado ele é
     */


    /*
        Crie métodos que ajudem no encapsulamento do 'combustível'
            - void abastecer(double quantidadeNova)
            Ao ser invocado, ele aumenta a quantidade de combustível conforme o valor do parâmetro 'quantidadeNova'

            - void acelerar(int segundos)
            Ao ser invocado, ele reduz a quantidade do combustível.
            Para cada segundo, o carro consome 0.2 litros de combustível

            Teste esses métodos na AppCarro
    */

    public void abastecer(double quantidadeNova){
        if(quantidadeNova + combustivel <= capacidadeTanque){
            combustivel += quantidadeNova;
        } else {
            combustivel = capacidadeTanque;
        }
    }

    public void acelerar(int segundos){
        if(combustivel >= 0.2 * segundos){
            combustivel -= 0.2 * segundos;
        } else{
            combustivel = 0.0;
        }
    }
}
