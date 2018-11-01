package fiuba.algo3.modelo;

/**
 * Created by I860341 on 15/5/2017.
 */
public class Pikachu extends Algomon {

    public Pikachu() {
        puntos = 100;
    }

    public void atackTrueno(Algomon otroAlgomon) {
        otroAlgomon.recibirDanio(20);
    }
}
