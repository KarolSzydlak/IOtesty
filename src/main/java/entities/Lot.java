package entities;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Lot {

	private int ID;
	private String miejsceWylotu;
	private String celLotu;
	private int numerBramki;
	private int numerSamolotu;
	private int opoznienie;

	public int getIloscMiejsc() {
		return iloscMiejsc;
	}

	public void setIloscMiejsc(int iloscMiejsc) {
		this.iloscMiejsc = iloscMiejsc;
	}

	private int iloscMiejsc;
        private int cena;
	private List<Miejsce> miejsca;
	private ZonedDateTime dataWylotu;
        
        private static int nextID = 0;

	/**
	 * 
	 * @param miejsceWylotu
	 * @param celLotu
	 * @param numerBramki
	 * @param numerSamolotu
	 * @param iloscMiejsc
	 * @param dataWylotu
         * @param cena
	 */
	public Lot(String miejsceWylotu, String celLotu, int numerBramki, int numerSamolotu, int iloscMiejsc, ZonedDateTime dataWylotu) {
                this.ID = nextID;
                nextID++;
		this.miejsceWylotu = miejsceWylotu;
                this.celLotu = celLotu;
                this.numerBramki = numerBramki;
                this.numerSamolotu = numerSamolotu;
                this.opoznienie = 0;
                this.miejsca = new ArrayList<>();
                WyznaczMiejsca(iloscMiejsc,cena);
                this.dataWylotu = dataWylotu;
	}
        
        	public int getID() {
		return this.ID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getMiejsceWylotu() {
		return this.miejsceWylotu;
	}

	/**
	 * 
	 * @param miejsceWylotu
	 */
	public void setMiejsceWylotu(String miejsceWylotu) {
		this.miejsceWylotu = miejsceWylotu;
	}

	public String getCelLotu() {
		return this.celLotu;
	}

	/**
	 * 
	 * @param celLotu
	 */
	public void setCelLotu(String celLotu) {
		this.celLotu = celLotu;
	}

	public int getNumerBramki() {
		return this.numerBramki;
	}

	/**
	 * 
	 * @param numerBramki
	 */
	public void setNumerBramki(int numerBramki) {
		this.numerBramki = numerBramki;
	}

	public int getNumerSamolotu() {
		return this.numerSamolotu;
	}

	/**
	 * 
	 * @param numerSamolotu
	 */
	public void setNumerSamolotu(int numerSamolotu) {
		this.numerSamolotu = numerSamolotu;
	}

	public int getOpoznienie() {
		return this.opoznienie;
	}

	/**
	 * 
	 * @param opoznienie
	 */
	public void setOpoznienie(int opoznienie) {
		this.opoznienie = opoznienie;
	}

        public ZonedDateTime getDataWylotu() {
            return this.dataWylotu;
        }

	/**
	 * 
	 * @param dataWylotu
	 */
	public void setDataWylotu(ZonedDateTime dataWylotu) {
		this.dataWylotu = dataWylotu;
	}

	public List<Miejsce> PokazWolneMiejsca() {
            List<Miejsce> wolne = new ArrayList<>();
            for(Miejsce m : miejsca){
                if(!m.getZajete()){
                    wolne.add(m);
                }
            }
            if(wolne.isEmpty()){
                return null;
            }
            else{
                return wolne;
            }
	}

	/**
	 * 
	 * @param iloscMiejsc
	 */
	private void WyznaczMiejsca(int iloscMiejsc, int cena) {
            Miejsce m;
            for(int i = 1; i <= iloscMiejsc; i++) {
                if(i % 2 == 0) {
                    m = new Miejsce(i, true,cena);
                    miejsca.add(m);
                }
                else{
                    m = new Miejsce(i, false,cena);
                    miejsca.add(m);
                }
            }
	}
        
        public boolean porownajLoty(String miejsceWylotu, String celLotu, LocalDate data){
            if(this.miejsceWylotu.equals(miejsceWylotu) && this.celLotu.equals(celLotu) && data.equals(dataWylotu.toLocalDate())){
               return true;
            }
            return false;
        }

}