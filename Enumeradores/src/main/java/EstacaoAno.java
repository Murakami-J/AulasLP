public enum EstacaoAno {
    PRIMAVERA("Primavera, estação das flores", 20.0, 24.5),
    VERAO("Verão, estação quente", 24.51, Double.MAX_VALUE),
    OUTONO("Outono, onde as folhas caem", 15.0, 19.99),
    INVERNO("Inverno, aquele friozinho", Double.MIN_VALUE, 14.99);

    // Final significa que os valores nunca irão mudar
    // Os atributos de uma enum sempre são final (Não podem ser alterados)
    private final String descricao;
    private final double temperaturaMin;
    private final double temperaturaMax;

    EstacaoAno(String descricao, double temperaturaMin, double temperaturaMax) {
        this.descricao = descricao;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
    }

    // static indica que podemos invocar o método direto da própria classe (EstacaoAno)
    public static EstacaoAno fromTemperatura(double temperatura){
        for(EstacaoAno estacao : values()){
            if(temperatura >= estacao.temperaturaMin && temperatura <= estacao.temperaturaMax){
                return estacao;
            }
        }
        return null; // Caso não encontre nenhuma
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }
}
