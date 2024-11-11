public class AppEnums {
    public static void main(String[] args) {
        // Criando um objeto de enum com valor direto
        ZonaSp zona1 = ZonaSp.LESTE;

        // Criando uym objeto de enum a partir de uma String
        String zonaTeste = "NORTE";
        ZonaSp zonaConvertida = ZonaSp.valueOf(zonaTeste);
        ZonaSp zonaConvertida2 = ZonaSp.valueOf("CENTRO");

        System.out.println(zona1);
        System.out.println(zonaConvertida);
        System.out.println(zonaConvertida2);

        /*
            O código abaixo NÃO compila porque não existe SUDESTE em ZonaSp
            ZonaSp zonaConvertida3 = ZonaSp.valueOf("SUDESTE");
        */
        EstacaoAno estacao1 = EstacaoAno.PRIMAVERA;
        System.out.println(estacao1.getDescricao());
        System.out.println("Temp min: %.2f".formatted(estacao1.getTemperaturaMin()));
        System.out.println("Temp max: %.2f".formatted(estacao1.getTemperaturaMax()));

        // Podemos ITERAR em todos os valores de uma enum usando o .values()
        System.out.println("Estações disponíveis");
        for(EstacaoAno estacao : EstacaoAno.values()){
            System.out.println(estacao.getDescricao());
        }

        // Usuário informa uma temperatura e o Sistema diz qual é a estação do ano
        double tempTeste = 25.5;
        EstacaoAno estacaoTeste = EstacaoAno.fromTemperatura(tempTeste);
        System.out.println("A estação para %.2f graus é %s".formatted(tempTeste, estacaoTeste.getDescricao()));
    }
}