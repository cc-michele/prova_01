package pokeapp;

public class Pokemon {

	String nome;
	int nivel;
	int ataqueBase;
	int poderAtaque;
	String tipo;

	public Pokemon(String nome, int nivel, String tipo, int ataqueBase) throws Exception {

		this.nome = nome;
		this.nivel = nivel;
		this.ataqueBase = ataqueBase;
		this.tipo = tipo;
		this.poderAtaque = ataqueBase*nivel;
	}
	
	public String getNome() {
		return nome;
	}

	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getAtaqueBase() {
		return ataqueBase;
	}

	public String getTipo() {
		return tipo;
	}
	
	public int getPoderAtaque(){
		return poderAtaque;
	}


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pokemon)){
			return false;
		}
		Pokemon pokemon = (Pokemon) obj;
		
		return pokemon.getNome().equals(nome) && pokemon.getNivel() == nivel;
	}
	
	@Override
	public String toString() {
		
		return nome + " (" + tipo + "). lvl. " + nivel + "; power: " + ataqueBase;
	}

	public void ganhaNivel() {
		nivel ++;
		
	}

}
