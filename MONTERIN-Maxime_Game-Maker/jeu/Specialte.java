package jeu;

import java.util.List;

import enumeration.SPECIALITES;

public class Specialte {
	private SPECIALITES name;
	private List<Sort> MoovePool;
	
	public Specialte(SPECIALITES name, List<Sort> moovePool) {
		this.name = name;
		MoovePool = moovePool;
	}

	public SPECIALITES getName() {
		return name;
	}

	public void setName(SPECIALITES name) {
		this.name = name;
	}

	public List<Sort> getMoovePool() {
		return MoovePool;
	}

	public void setMoovePool(List<Sort> moovePool) {
		MoovePool = moovePool;
	}

	@Override
	public String toString() {
		return "Specialte [name=" + this.getName() + ", MoovePool=" + this.getMoovePool().toString() + "]";
	}
	
	
	
}
