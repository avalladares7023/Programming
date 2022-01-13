package pokemon;

import java.io.Serializable;
import java.util.UUID;

public class Pokemon implements Serializable {
	private UUID pokemonID;
	private String pokemonType;
	private String name;
	private boolean checkedIn = false;

	Pokemon(String pokemonType, String name) {
		pokemonID = UUID.randomUUID();
		this.pokemonType = pokemonType;
		this.name = name;
	}

	public UUID getPokemon() {
		return pokemonID;
	}

	public String getPokemonType() {
		return pokemonType;
	}

	public String getName() {
		return name;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void checkIn() {
		checkedIn = true;
	}

	public void checkOut() {
		checkedIn = false;
	}
}

