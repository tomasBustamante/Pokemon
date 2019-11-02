package fiuba.algo3.pokemon;

public class EstadoPikachuNormal implements EstadoPikachu {

    @Override
    public void impacTrueno(Pikachu pikachu, Pokemon otroPokemon) {
    	otroPokemon.recibirDanio(20);
    }

}
