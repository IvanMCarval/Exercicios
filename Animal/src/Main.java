import Models.AnimalBase;
import Models.Aquaticos;
import Models.Aves;
import Models.Cachorro;

public class Main {
    public static void main(String[] args) {
        AnimalBase animal1 = new Cachorro();
        AnimalBase animal2 = new Aves();
        AnimalBase animal3 = new Aquaticos();

        animal1.emitirSom();
        animal1.mover();

        animal2.emitirSom();
        animal2.mover();

        animal3.emitirSom();
        animal3.mover();
    }
}