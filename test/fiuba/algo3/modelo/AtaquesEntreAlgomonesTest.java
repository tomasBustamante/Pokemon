package fiuba.algo3.tests;

import fiuba.algo3.modelo.Jigglypuff;
import fiuba.algo3.modelo.Pikachu;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AtaquesEntreAlgomonesTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void PikachuHaceAtackTruenoAJigglypuffYLeQuita20PuntosDeVida() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 80 puntos de vida

        pikachu.atackTrueno(jigglypuff); // quita 20 puntos

        Assert.assertEquals(60, jigglypuff.getPuntos());
    }

    @Test
    public void JigglypuffHaceAraniazoAPikachuYLeQuita10PuntosDeVida() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 80 puntos de vida

        jigglypuff.araniazo(pikachu); // quita 10 puntos

        Assert.assertEquals(90, pikachu.getPuntos());
    }

//    @Test
//    public void JigglypuffCantaYPikachuNoPuedeAtacarPorqueEstaDormido() {
//        Algomon pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
//        Algomon jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 80 puntos de vida
//
//        jigglypuff.cantar(pikachu);
//
//        thrown.expect(AlgomonEstaDormidoException.class);
//        pikachu.atackTrueno(jigglypuff);
//    }

}
