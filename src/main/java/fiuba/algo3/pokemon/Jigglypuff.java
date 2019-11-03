package fiuba.algo3.pokemon;

public class Jigglypuff extends Pokemon {

    public Jigglypuff() {
      puntos = 60;
    }

    public void cachetazo(Pokemon otroPokemon) {
    	otroPokemon.recibirDanio(10);
    }

    public void cantar(Pokemon otroPokemon) {
      otroPokemon.dormirse();
    }

    @Override
    public void dormirse() {
      throw new JigglypuffNoPuedeDormirseException();
    }

    @Override
  	public void despertarse() {

  	}

}
