package entities;

import java.util.List;

public class Rezerwacja {

	private int IDLotu;
	private List<Miejsce> miejsca;

	/**
	 * 
	 * @param IDLotu;
	 * @param miejsca
	 */
	public Rezerwacja(int IDLotu, List<Miejsce> miejsca) {
		this.IDLotu = IDLotu;
                this.miejsca = miejsca;
	}

	public int getIDLotu() {
		return this.IDLotu;
	}

	/**
	 * 
	 * @param IDLotu
	 */
	public void setIDLotu(int IDLotu) {
		this.IDLotu = IDLotu;
	}

	public List<Miejsce> getMiejsca() {
		return this.miejsca;
	}

	/**
	 * 
	 * @param miejsca
	 */
	public void setMiejsca(List<Miejsce> miejsca) {
		this.miejsca = miejsca;
	}

}