package fiuba.algo3.modelo;

/**
 * Created by I860341 on 15/5/2017.
 */
public class Jigglypuff extends Algomon {

    public Jigglypuff() {
        puntos = 80;
    }

    public void araniazo(Algomon otroAlgomon) {
        otroAlgomon.recibirDanio(10);
    }
}
