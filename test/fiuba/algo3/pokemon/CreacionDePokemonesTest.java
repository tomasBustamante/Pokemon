package fiuba.algo3.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CreacionDePokemonesTest {
	
	@Test
	public void test01PikachuRecienCreadoTiene100PuntosDeVida() {
		Pikachu pikachu = new Pikachu();
		
		assertEquals(100, pikachu.getPuntos());
	}
	
	@Test
	public void test02JigglypuffRecienCreadoTiene60PuntosDeVida() {
		Jigglypuff jigglypuff = new Jigglypuff();
		
		assertEquals(60, jigglypuff.getPuntos());
	}
	
	/*
	@Test
	public void test03CharmanderRecienCreadoTiene120PuntosDeVida() {
		Charmander charmander = new Charmander();
		
		assertEquals(120, charmander.getPuntos());
	}
	
	@Test
	public void test04BulbasaurRecienCreadoTiene140PuntosDeVida() {
		Bulbasaur bulbasaur = new Bulbasaur();
		
		assertEquals(140, bulbasaur.getPuntos());
	}
	
	@Test
	public void test05SquirtleRecienCreadoTiene150PuntosDeVida() {
		Squirtle squirtle = new Squirtle();
		
		assertEquals(150, squirtle.getPuntos());
	}
	*/

}
