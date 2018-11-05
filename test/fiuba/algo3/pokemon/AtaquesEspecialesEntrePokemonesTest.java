package fiuba.algo3.pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class AtaquesEspecialesEntrePokemonesTest {

    @Test
    public void test01JigglypuffCantaYPikachuNoPuedeAtacarPorqueEstaDormido() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        jigglypuff.cantar(pikachu); // pikachu pasa a estar dormido

        assertThrows(PokemonEstaDormidoException.class,
        			()->{
        				pikachu.impacTrueno(jigglypuff);
        			});
    }

    @Test
    public void test02LosPuntosDePikachuNoSonAlteradosCuandoJigglypuffCanta() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        jigglypuff.cantar(pikachu); // pikachu pasa a estar dormido

        assertEquals(100, pikachu.getPuntos()); // los puntos de pikachu no son alterados
    }

    @Test
    public void test03JigglypuffNoRecibeDanioCuandoPikachuIntentaAtacarEstandoDormido() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        jigglypuff.cantar(pikachu); // pikachu pasa a estar dormido

        // Atrapo la excepcion y la ignoro para poder seguir
        try {
            pikachu.impacTrueno(jigglypuff);
        } catch (PokemonEstaDormidoException ignored) { }

        assertEquals(60, jigglypuff.getPuntos()); // los puntos de Jigglypuff no son alterados
    }

    @Test
    public void test04PikachuSigueSinPoderAtacarPorSegundaVezDespuesDeHaberseDormido() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        jigglypuff.cantar(pikachu); // pikachu pasa a estar dormido

        boolean seLanzoError = false;
        try {
            pikachu.impacTrueno(jigglypuff);
        } catch (PokemonEstaDormidoException e1) {
            try {
            	pikachu.impacTrueno(jigglypuff);
            } catch (PokemonEstaDormidoException e2) {
            	seLanzoError = true;
            }
        }

        assertTrue(seLanzoError);
    }

    @Test
    public void test05PikachuSigueSinPoderAtacarPorTerceraVezDespuesDeHaberseDormido() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        jigglypuff.cantar(pikachu); // pikachu pasa a estar dormido

        boolean seLanzoError = false;
        try {
            pikachu.impacTrueno(jigglypuff);
        } catch (PokemonEstaDormidoException e1) {
            try {
                pikachu.impacTrueno(jigglypuff);
            } catch (PokemonEstaDormidoException e2) {
            	try {
            		pikachu.impacTrueno(jigglypuff);
            	} catch (PokemonEstaDormidoException e3) {
            		seLanzoError = true;
            	}
            }
        }

        assertTrue(seLanzoError);

    }

    @Test
    public void test06JigglypuffCantaYPikachuNoPuedeAtacarPorTresTurnosPeroSiAlCuarto() {
        Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida
        Jigglypuff jigglypuff = new Jigglypuff(); // Crea a Jigglypuff con 60 puntos de vida

        jigglypuff.cantar(pikachu); // pikachu pasa a estar dormido

        // Pikachu intenta atacar tres veces y se despierta
        try {
            pikachu.impacTrueno(jigglypuff);
        } catch (PokemonEstaDormidoException e1) {
            try {
                pikachu.impacTrueno(jigglypuff);
            } catch (PokemonEstaDormidoException e2) {
                try {
                    pikachu.impacTrueno(jigglypuff);
                } catch (PokemonEstaDormidoException ignored){ }
            }
        }

        pikachu.impacTrueno(jigglypuff); // quita 20 puntos

        assertEquals(40, jigglypuff.getPuntos());
    }

    @Test
    public void test07JigglypuffNoPuedeQuedarseDormido() {
        Jigglypuff jigglypuff1 = new Jigglypuff(); // Crea a un Jigglypuff con 80 puntos de vida
        Jigglypuff jigglypuff2 = new Jigglypuff(); // Crea a otro Jigglypuff con 60 puntos de vida

        assertThrows(JigglypuffNoPuedeDormirseException.class,
        			()->{
        				jigglypuff1.cantar(jigglypuff2);
        			});
    }

    @Test
    public void test08NadaSucedeAlDespertarAJigglypuff() {
      Jigglypuff jigglypuff = new Jigglypuff(); // Crea a un Jigglypuff con 80 puntos de vida
      Pikachu pikachu = new Pikachu(); // Crea a Pikachu con 100 puntos de vida

      jigglypuff.despertarse(); // Nada sucede

      assertEquals(80, jigglypuff.getPuntos()); // Sigue con los mismos puntos

      jigglypuff.cachetazo(pikachu); // Quita 10 puntos a Pikachu

      assertEquals(90, pikachu.getPuntos());
    }

    /*
    @Test
    public void test09CharmanderAtacaAJigglypuffConFogonazoYLeQuita2PuntosDeVida() {
    	Jigglypuff jigglypuff = new Jigglypuff(); // 60 puntos iniciales
    	Charmander charmander = new Charmander(); // 120 puntos iniciales

    	charmander.fogonazo(jigglypuff); // quita 2 puntos

    	assertEquals(58, jigglypuff.getPuntos());
    }

    @Test
    public void test10CharmanderAtacaAJigglypuffConFogonazoYJigglypuffAhoraSeQuita10PorCientoDelDanioCadaVezQueAtaca() {
    	Jigglypuff jigglypuff = new Jigglypuff(); // 60 puntos iniciales
    	Charmander charmander = new Charmander(); // 120 puntos iniciales

    	charmander.fogonazo(jigglypuff); // jigglypuff pasa a estar quemado

    	jigglypuff.cachetazo(charmander); // jigglypuff se quita un punto a s� m�smo

    	assertEquals(57, jigglypuff.getPuntos()); // 60 - 2 - 1
    }

    @Test
    public void test11CharmanderAtacaAJigglypuffConFogonazoYJigglypuffAtacaACharmanderConCachetazo() {
    	Jigglypuff jigglypuff = new Jigglypuff(); // 60 puntos iniciales
    	Charmander charmander = new Charmander(); // 120 puntos iniciales

    	charmander.fogonazo(jigglypuff); // jigglypuff pasa a estar quemado

    	jigglypuff.cachetazo(charmander); // quita 10 puntos

    	assertEquals(110, charmander.getPuntos()); // 120 - 10
    }

    @Test
    public void test12CharmanderAtacaAJigglypuffConFogonazoYJigglypuffAtacaHastaMorirPorLasQuemaduras() {
    	Jigglypuff jigglypuff = new Jigglypuff(); // 60 puntos iniciales
    	Charmander charmander = new Charmander(); // 120 puntos iniciales

    	charmander.fogonazo(jigglypuff); // jigglypuff pasa a estar quemado

    	// jigglypuff hace 60 cachetazos estando quemado
    	for (int i = 0; i < 5; i++) {
    		charmander = new Charmander(); // instancio nuevos Charmanders porque se van a ir muriendo
	    	for (int j = 0; j < 12; j++) { // jigglypuff se quita 1 * 12 puntos
	            jigglypuff.cachetazo(charmander); // quita 10 puntos a Charmander
	        }
    	}

    	assertThrows(PokemonEstaMuertoException.class,
    			()->{
    				charmander.cachetazo(jigglypuff);
    			});
    }
    */
}
