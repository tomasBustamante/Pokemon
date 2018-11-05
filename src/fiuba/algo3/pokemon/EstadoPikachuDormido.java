package fiuba.algo3.pokemon;

public class EstadoPikachuDormido implements EstadoPikachu {

    private int turnos;

    public EstadoPikachuDormido() {
        turnos = 3;
    }

    @Override
    public void impacTrueno(Pikachu pikachu, Pokemon otroPokemon) {
        turnos -= 1;
        if (turnos > -1)
            throw new PokemonEstaDormidoException();
        pikachu.despertarse();
        pikachu.impacTrueno(otroPokemon);
    }

}
