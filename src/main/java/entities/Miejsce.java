package entities;

public class Miejsce {

	private int numer;
	private boolean przyOknie;
	private boolean zajete = false;
        private int cena;

	/**
	 * 
         * @param numer
	 * @param przyOknie
	 */
	public Miejsce(int numer, boolean przyOknie, int cena) {
		this.numer = numer;
                this.przyOknie = przyOknie;
                this.cena = cena;
	}

        public void setCena(int cena){
            this.cena = cena;
        }
        
        public int getCena(){
            return this.cena;
        }
        
	public boolean getPrzyOknie() {
		return this.przyOknie;
	}

	/**
	 * 
	 * @param przyOknie
	 */
	public void setPrzyOknie(boolean przyOknie) {
		this.przyOknie = przyOknie;
	}

	public boolean getZajete() {
		return this.zajete;
	}

	/**
	 * 
	 * @param zajete
	 */
	public void setZajete(boolean zajete) {
		this.zajete = zajete;
	}

	public int getNumer() {
		return this.numer;
	}
        
        /**
         * 
         * @param numer
         */
        
        public void setNumer(int numer) {
                this.numer = numer;
        }

}