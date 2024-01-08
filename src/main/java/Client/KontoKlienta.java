package Client;

import entities.Miejsce;
import entities.Rezerwacja;

import java.util.ArrayList;
import java.util.List;

public class KontoKlienta {

	private String login;
	private String haslo;
	private String imie;
	private String nazwisko;
	private int ID;
	private List<Rezerwacja> listaRezerwacji;
        
        KontoKlienta(String login, String haslo, String imie, String nazwisko){
            this.login = login;
            this.haslo = haslo;
            this.imie = imie;
            this.nazwisko = nazwisko;
            listaRezerwacji = new ArrayList<>();
        }

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
        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
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
        
        public List<Rezerwacja> getListaRezerwacji() {
            return this.listaRezerwacji;
        }
        
        /**
         * 
         * @param listaRezerwacji
         */
        public void setListaRezerwacji(List<Rezerwacja> listaRezerwacji) {
            this.listaRezerwacji = listaRezerwacji;
        }
        
        public void dodajRezerwacje(Rezerwacja rezerwacja){
            listaRezerwacji.add(rezerwacja);
        }
        
        public boolean usunRezerwacje(Rezerwacja rezerwacja){
            if(!listaRezerwacji.remove(rezerwacja)){
                return false;
            }
            List<Miejsce> miejsca = rezerwacja.getMiejsca();
            for(Miejsce m: miejsca){
               m.setZajete(false);
            }
            return true;
        }
}