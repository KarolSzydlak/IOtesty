package Employee;

public class KontoPracownika {

	private String login;
	private String haslo;
	private String imie;
	private String nazwisko;

	public String getLogin() {
		return this.login;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return this.haslo;
	}

	/**
	 * 
	 * @param haslo
	 */
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
        
        public String getImie() {
            return this.imie;
        }
        
        /**
         * 
         * @param imie
         */
        public void setImie(String imie) {
            this.imie = imie;
        }
        
        public String getNazwisko() {
            return this.nazwisko;
        }
        
        /**
         * 
         * @param nazwisko
         */
        public void setNazwisko(String nazwisko){
            this.nazwisko = nazwisko;
        }

}