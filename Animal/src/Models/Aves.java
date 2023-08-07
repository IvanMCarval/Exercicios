package Models;

public class Aves extends AnimalBase{
    private String nome = "Aves";

    @Override
    public void emitirSom() {
        System.out.println(nome + " cantam");
        super.emitirSom();
    }

    @Override
    public void mover() {
        System.out.println(nome + " voam");
        super.mover();
    }
}
