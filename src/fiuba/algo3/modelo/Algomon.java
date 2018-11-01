package fiuba.algo3.modelo;

/**
 * Created by I860341 on 15/5/2017.
 */
public abstract class Algomon {

    protected int puntos;

    public int getPuntos() {
        return puntos;
    }

    public void recibirDanio(int danio) {
        puntos -= danio;
    }
}
