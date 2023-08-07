package Models;

public class Aquaticos extends AnimalBase{
    private String nome = "Peixes";

    @Override
    public void emitirSom() {
        System.out.println(nome + " GlubGlub");
        super.emitirSom();
    }

    @Override
    public void mover() {
        System.out.println(nome + " nadam");
        super.mover();
    }
}
