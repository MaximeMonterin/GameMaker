package jeu;

import java.util.Objects;

public class Objet {
	private String name;

	public Objet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Objet [name=" + this.getName() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objet other = (Objet) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
}
