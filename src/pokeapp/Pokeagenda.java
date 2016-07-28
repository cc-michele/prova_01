package pokeapp;

import java.util.ArrayList;

public class Pokeagenda {

	ArrayList<Pokemon> listaPokemons = new ArrayList<Pokemon>();
	int poderTotal;

	public void adicionaPokemon(Pokemon pokemon) {
		listaPokemons.add(pokemon);

	}

	public int qtdPokemons() {
		return listaPokemons.size();
	}

	public Pokemon getPokemon(int index) {
		return listaPokemons.get(index);

	}

	public Pokeagenda(ArrayList<Pokemon> pokemons) {

	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pokeagenda)) {
			return false;
		}
		Pokeagenda pokeagenda = (Pokeagenda) obj;

		return pokeagenda.qtdPokemons() == qtdPokemons() && pokeagenda.listaPokemons.size() == listaPokemons.size();
	}

	@Override
	public String toString() {
		String s = "";
		
		s += (qtdPokemons() + " pokemons capturados:\n");
		for (int i = 0; i < listaPokemons.size(); i++) {
			 s += ((i+1) + (" - ") + (listaPokemons.get(i) + "\n"));
		}
		return s;
	}

}
