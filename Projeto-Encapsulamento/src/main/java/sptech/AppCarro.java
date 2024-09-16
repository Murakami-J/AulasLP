package sptech;

public class AppCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Azul", 1970, 40.0);

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Combustível: " + carro1.getCombustivel());
        System.out.println("Marcha: " + carro1.getMarcha());
        System.out.println("Ano de Fabricação: " + carro1.getAnoFabricacao());

        Carro carro2 = new Carro("Honda Fit", "Cinza");
        System.out.println("Ano fabricação: " + carro2.getAnoFabricacao());

        Carro carro3 = new Carro();
        // Este carro3 não tem nenhum atributo inicializado, porém os que têm valor padrão, estão com seus valores padrão
        // Ainda: seu modelo, cor, anoFabricacao e capacidadeTanque nascem null

        Carro carro4 = new Carro("Ferrari", "Vermelho", 2020, 100.0);
        carro4.setCor("Amarelo");
        carro4.setQuilometragem(60);
        System.out.println("Cor: " + carro4.getCor());
        System.out.println("IPVA: " + carro4.getIPVA());
        System.out.println("Está na reserva: " + carro4.isNaReserva());

        Carro carro5 = new Carro("Fusca", "Branco", 2020, 16.0);
        System.out.println("Quantidade de combustível: " + carro5.getCombustivel());
        carro5.abastecer(50.0);
        System.out.println("Quantidade de combustível: " + carro5.getCombustivel());
        carro5.acelerar(100);
        System.out.println("Quantidade de combustível: " + carro5.getCombustivel());
    }

}
