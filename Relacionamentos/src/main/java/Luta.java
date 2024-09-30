public class Luta {
    // Aqui temos associação do tipo AGREGAÇÃO
    private Lutador lutador1;
    private Lutador lutador2;

    private Lutador vencedor;

    public Luta(Lutador lutador1, Lutador lutador2, Lutador vencedor) {
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
        this.vencedor = vencedor;
    }

    public Lutador getLutador1() {
        return lutador1;
    }

    public Lutador getLutador2() {
        return lutador2;
    }

    public Lutador getVencedor() {
        return vencedor;
    }
}
