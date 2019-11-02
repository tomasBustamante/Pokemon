package fiuba.algo3.pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.Test;

public class AtaquesSimplesEntrePokemonesTest {

    @Test
    public void test01PikachuHaceImpacTruenoAJigglypuffYLeQuita20PuntosDeVida() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        pikachu.impacTrueno(jigglypuff); // quita 20 puntos

        assertEquals(40, jigglypuff.getPuntos());
    }

    @Test
    public void test02PikachuHaceImpacTruenoAOtroPikachuYLeQuita20PuntosDeVida() {
        Pikachu pikachu1 = new Pikachu(); // Crea un Pikachu con 100 puntos de vida
        Pikachu pikachu2 = new Pikachu(); // Crea otro Pikachu con 100 puntos de vida

        pikachu1.impacTrueno(pikachu2); // quita 20 puntos

        assertEquals(80, pikachu2.getPuntos());
    }

    @Test
    public void test03JigglypuffHaceCachetazoAPikachuYLeQuita10PuntosDeVida() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        jigglypuff.cachetazo(pikachu); // quita 10 puntos

        assertEquals(90, pikachu.getPuntos());
    }

    @Test
    public void test04JigglypuffHaceCachetazoAOtroJigglypuffYLeQuita10PuntosDeVida() {
        Jigglypuff jigglypuff1 = new Jigglypuff(); // Crea un Jigglypuff con 60 puntos de vida
        Jigglypuff jigglypuff2 = new Jigglypuff(); // Crea otro Jigglypuff con 60 puntos de vida

        jigglypuff1.cachetazo(jigglypuff2); // quita 10 puntos

        assertEquals(50, jigglypuff2.getPuntos());
    }

    @Test
    public void test05PikachuMataAJigglypuffYJigglypuffYaNoPuedeRecibirDanio() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        for (int i = 0; i < 3; i++) {
            pikachu.impacTrueno(jigglypuff); // quita 20 puntos
        }

        /* Forma casera de probar el lanzamiento de la excepcion
        boolean seLanzoError = false;
        try {
        	pikachu.impacTrueno(jigglypuff);
        } catch (PokemonEstaMuertoException e) {
        	seLanzoError = true;
        }
        Assert.assertTrue(seLanzoError);
        */


        // Lo siguiente solamente funciona con JUnit 5
        assertThrows(PokemonEstaMuertoException.class,
        			()->{
        				pikachu.impacTrueno(jigglypuff);
        			});
    }

    @Test
    public void test06JigglypuffMataAPikachuYPikachuYaNoPuedeRecibirDanio() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        for (int i = 0; i < 10; i++) {
            jigglypuff.cachetazo(pikachu); // quita 10 puntos
        }

        assertThrows(PokemonEstaMuertoException.class,
        			()->{
        				jigglypuff.cachetazo(pikachu);
        			});

    }

}
