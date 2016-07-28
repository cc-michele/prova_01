package pokeapp;

import java.util.ArrayList;



public class Treinador {
	
	String nomeTreinador;
	Pokeagenda minhaPokeagenda = new Pokeagenda(null);
	Pokemon maisForte;
	int qtdPokemons;
	int poderAtaque;

	
	private String getNomeTreinador() {
		
		return nomeTreinador;
	}

	public Treinador(String nomeTreinador) {
		this.nomeTreinador = nomeTreinador;
		
	}

	public void captura(Pokemon pokemon) {
		minhaPokeagenda.adicionaPokemon(pokemon);
		
		
	}
	
	public Pokemon getMaisForte() throws Exception {
		maisForte = new Pokemon("nome", 1, "tipo", 1);
		for (int i = 0; i < minhaPokeagenda.qtdPokemons(); i++) {
			if (maisForte.getPoderAtaque() < minhaPokeagenda.getPokemon(i).getPoderAtaque()) {
				maisForte = minhaPokeagenda.getPokemon(i);
				
			}		
			
		}		
		
		return maisForte;
	}

	public boolean jaCapturou(String nomePokemon) {
		
		
		for (Pokemon pokemon : minhaPokeagenda.listaPokemons) {
			if (pokemon.getNome().equals(nomePokemon)){
				return true;
			}
		}
		return false;
	}

	public int getQtdPokemons() {
		qtdPokemons = minhaPokeagenda.listaPokemons.size();
		return qtdPokemons;
	}

	public ArrayList<Pokemon> getPokemons(String nomePokemon) {
		ArrayList<Pokemon> meusPokes = new ArrayList<Pokemon>();
		for (Pokemon pokemon : minhaPokeagenda.listaPokemons) {
			if (pokemon.getTipo().equals(nomePokemon)){
				meusPokes.add(pokemon);
			}
		}
		return meusPokes;
	}

	public int getPoderAtaque() {
		for (Pokemon pokemon : minhaPokeagenda.listaPokemons) {
			poderAtaque += pokemon.getPoderAtaque();
		}
		return poderAtaque;
	}

	public String lutaContra(Treinador treinador) {
		String s = "";
		if (poderAtaque > treinador.getPoderAtaque()){
			s = ("Aew, ganhei! Sou mais forte que " + treinador.getNomeTreinador());
		} else if (poderAtaque == treinador.getPoderAtaque()){
			s = ("Eu e "+ treinador.getNomeTreinador() + " estamos empatados.");
		} else if (poderAtaque < treinador.getPoderAtaque()){
			s = ("Droga, perdi! " + treinador.getNomeTreinador() + " eh mais forte!");
		}
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Treinador)){
			return false;
		}
		Treinador treinador = (Treinador) obj;
		
		return treinador.getNomeTreinador().equals(nomeTreinador) && treinador.minhaPokeagenda.equals(minhaPokeagenda);
	}
	
	
	@Override
	public String toString() {
		String s = "";
		s += "Ola, sou " + getNomeTreinador() + "\nMeu poder total eh " + poderAtaque 
				+ ", vai encarar?!\n" + minhaPokeagenda;
		return s;
	}

}
