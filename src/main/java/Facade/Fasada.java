package Facade;

import Client.KontoKlienta;
import Employee.KontoPracownika;
import entities.*;

import java.util.List;
import java.util.ArrayList;
import java.time.*;

public class Fasada {

	private List<KontoPracownika> kontaPracownikow;
	private List<KontoKlienta> kontaKlientow;
	List<Lot> Loty;

	/**
	 * 
	 * @param args
	 */
	public void main(String[] args) {
            //TODO - interfejs programu
	}

	/**
	 * 
	 * @param login
	 * @param haslo
	 */
	private boolean LogowaniePracownika(String login, String haslo, String parwidloweHaslo) {
		if(haslo.equals(parwidloweHaslo)) return true;
		return false;

	}

	/**
	 * 
	 * @param login
	 * @param haslo
	 */
	private boolean LogowanieKlienta(String login, String haslo, String correctPassw) {
		if (haslo.equals(correctPassw)) return true;
		return false;
            /*boolean loginExists = false;
			boolean reply = false;
			boolean makeAcc = false;
			KontoKlienta konto = null;
			for(int i=0;i<kontaKlientow.size();i++){
				konto = kontaKlientow.get(i);
				if(konto.getLogin().equals(login)){
					loginExists = true;
				}
				if(loginExists)
					break;
			}
			if(haslo.equals(konto.getHaslo())){
				reply = true;
			}
			if(reply){
				//zalogowanie przez okno graficzne
				return konto;
			}else {
				//komunikat o błędnym haśle w oknie graficznym
			}
			if(!loginExists){
				//komunikat o utworzeniu konta w oknie graficznym
				//wprowadzenie wyboru do okna
				if(makeAcc){
					//pobranie informacji z okna i utworzenie konta
				}
			}
			return null;*/
	}

	/**
	 * 
	 * @param ID
	 */
	public Lot SzukajLotu(int ID) {
            for(Lot lot : Loty){
                if(lot.getID() == ID)
                {
                    return lot;
                }
            }
            return null;
	}

	/**
	 * 
	 * @param miejsceWylotu
	 * @param celLotu
	 * @param data
	 */
	public List<Lot> SzukajLotow(String miejsceWylotu, String celLotu, LocalDate data) {
            List<Lot> znalezione = new ArrayList<>();
            for(Lot lot : Loty){
                if(lot.porownajLoty(miejsceWylotu, celLotu, data)){
                    znalezione.add(lot);
                }
            }
            if(znalezione.isEmpty()){
                return null;
            }
            else{
                return znalezione;
            }
	}

	public void ModifikujLot(int ID, int opoznienie, int nr_bramki, int numer_samolotu, int ilosc_miejsc) {
            Lot lot = SzukajLotu(ID);
			if(lot!=null){
				int seatCnt = lot.getIloscMiejsc();
				if(seatCnt<=ilosc_miejsc){
					lot.setOpoznienie(opoznienie);
					lot.setNumerBramki(nr_bramki);
					lot.setNumerSamolotu(numer_samolotu);
					lot.setIloscMiejsc(ilosc_miejsc);
				}
			}
	}

	/**
	 * 
	 * @param miejsceWylotu
	 * @param celLotu
	 * @param numerBramki
	 * @param numerSamolotu
	 * @param iloscMiejsc
	 * @param dataWylotu
	 */
	public Lot UtworzLot(String miejsceWylotu, String celLotu, int numerBramki, int numerSamolotu, int iloscMiejsc, ZonedDateTime dataWylotu) {
            Lot lot = new Lot(miejsceWylotu, celLotu, numerBramki, numerSamolotu, iloscMiejsc, dataWylotu);
            Loty.add(lot);
			return lot;
	}

	/**
	 * 
	 * @param ID
	 */
	public boolean UsunLot(int ID) {
            Lot lot = SzukajLotu(ID);
			if(lot!=null){
				Loty.remove(lot);
				return true;
			}else{
				return false;
			}
	}

	public List<Rezerwacja> WyswietlRezerwacje() {
            // TODO - implement Fasada.WyswietlRezerwacje
            throw new UnsupportedOperationException();
	}

        
	public Rezerwacja RezerwujLot(KontoKlienta konto, String miejsceWylotu, String celLotu, LocalDate data, Lot wybranyLot, List<Miejsce> wybraneMiejsca) {


		if(wybraneMiejsca!=null){
			int IDwybranegoLotu = wybranyLot.getID();
			Rezerwacja rezerwacja = new Rezerwacja(IDwybranegoLotu,wybraneMiejsca);
			konto.dodajRezerwacje(rezerwacja);
			return rezerwacja;
		}else return null;
	}
        
        public List<Miejsce> wybierzMiejsca(List<Miejsce> dostepneMiejsca){
            List<Miejsce> wybrane = new ArrayList<>();
            return wybrane;
        }

	public boolean UsunRezerwacje(KontoKlienta konto, int ID) {
            for(Rezerwacja r : konto.getListaRezerwacji()){
                if(r.getIDLotu() == ID){
                    if(!konto.usunRezerwacje(r)){
                        //informacja o błędzie
			return false;
                    }else{
			return true;
					}

                }
            }
            //informacja o braku rezerwacji
		return false;
	}
        public int obliczKoszt(List<Miejsce> miejsca){
            int koszt = 0;
            for(Miejsce miejsce : miejsca){
                koszt += miejsce.getCena();
            }
            return koszt;
        }


}