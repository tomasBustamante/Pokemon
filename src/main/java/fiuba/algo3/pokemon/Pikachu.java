package fiuba.algo3.pokemon;

public class Pikachu extends Pokemon {

    private EstadoPikachu estado = new EstadoPikachuNormal();

    public Pikachu() {
        puntos = 100;
    }

    public void impacTrueno(Pokemon otroPokemon) {
        estado.impacTrueno(this, otroPokemon);
    }

    @Override
    public void dormirse() {
        estado = new EstadoPikachuDormido();
    }

    @Override
    public void despertarse() {
        estado = new EstadoPikachuNormal();
    }

}