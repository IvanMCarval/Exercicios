package Models;

public class Cachorro extends AnimalBase{
    private String nome = "Cachorro";

    @Override
    public void emitirSom() {
        System.out.println(nome + " late");
        super.emitirSom();
    }

    @Override
    public void mover() {
        System.out.println(nome + " anda");
        super.mover();
    }
}
