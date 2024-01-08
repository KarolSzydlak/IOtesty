/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Facade;

import Client.KontoKlienta;
import entities.Lot;
import entities.Miejsce;
import entities.Rezerwacja;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author karol
 */
public class FasadaTest {
    
    public FasadaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Fasada.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fasada instance = new Fasada();
        instance.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SzukajLotu method, of class Fasada.
     */
    @Test
    public void testSzukajLotu() {
        System.out.println("SzukajLotu");
        int ID = 0;
        Fasada instance = new Fasada();
        Lot expResult = null;
        Lot result = instance.SzukajLotu(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SzukajLotow method, of class Fasada.
     */
    @Test
    public void testSzukajLotow() {
        System.out.println("SzukajLotow");
        String miejsceWylotu = "";
        String celLotu = "";
        LocalDate data = null;
        Fasada instance = new Fasada();
        List<Lot> expResult = null;
        List<Lot> result = instance.SzukajLotow(miejsceWylotu, celLotu, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModifikujLot method, of class Fasada.
     */
    @Test
    public void testModifikujLot() {
        System.out.println("ModifikujLot");
        int ID = 0;
        int opoznienie = 0;
        int nr_bramki = 0;
        int numer_samolotu = 0;
        int ilosc_miejsc = 0;
        Fasada instance = new Fasada();
        instance.ModifikujLot(ID, opoznienie, nr_bramki, numer_samolotu, ilosc_miejsc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UtworzLot method, of class Fasada.
     */
    @Test
    public void testUtworzLot() {
        System.out.println("UtworzLot");
        String miejsceWylotu = "Warszawa";
        String celLotu = "Madryt";
        int numerBramki = 12;
        int numerSamolotu = 130;
        int iloscMiejsc = 200;
        ZonedDateTime dataWylotu = ZonedDateTime.now();
        Lot lot = new Lot(miejsceWylotu,celLotu,numerBramki,numerSamolotu,iloscMiejsc,dataWylotu);
        Fasada instance = new Fasada();
        instance.Loty = new ArrayList<Lot>();
        int expSize =1;
        Lot expResult = lot;
        Lot result = instance.UtworzLot(miejsceWylotu, celLotu, numerBramki, numerSamolotu, iloscMiejsc, dataWylotu);
        assertEquals(expResult.getMiejsceWylotu(), result.getMiejsceWylotu());
        assertEquals(expResult.getCelLotu(), result.getCelLotu());
        assertEquals(expResult.getNumerBramki(), result.getNumerBramki());
        assertEquals(expResult.getNumerSamolotu(), result.getNumerSamolotu());
        assertEquals(expResult.getIloscMiejsc(), result.getIloscMiejsc());
        assertEquals(expResult.getDataWylotu(), result.getDataWylotu());
        assertEquals(expSize,instance.Loty.size());
        
    }

    /**
     * Test of UsunLot method, of class Fasada.
     */
    @Test
    public void testUsunLot() {
        System.out.println("UsunLot");
        int ID = 0;
        Fasada instance = new Fasada();
        boolean expResult = false;
        boolean result = instance.UsunLot(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WyswietlRezerwacje method, of class Fasada.
     */
    @Test
    public void testWyswietlRezerwacje() {
        System.out.println("WyswietlRezerwacje");
        Fasada instance = new Fasada();
        List<Rezerwacja> expResult = null;
        List<Rezerwacja> result = instance.WyswietlRezerwacje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RezerwujLot method, of class Fasada.
     */
    @Test
    public void testRezerwujLot() {
        System.out.println("RezerwujLot");
        KontoKlienta konto = null;
        String miejsceWylotu = "";
        String celLotu = "";
        LocalDate data = null;
        Lot wybranyLot = null;
        List<Miejsce> wybraneMiejsca = null;
        Fasada instance = new Fasada();
        Rezerwacja expResult = null;
        Rezerwacja result = instance.RezerwujLot(konto, miejsceWylotu, celLotu, data, wybranyLot, wybraneMiejsca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wybierzMiejsca method, of class Fasada.
     */
    @Test
    public void testWybierzMiejsca() {
        System.out.println("wybierzMiejsca");
        List<Miejsce> dostepneMiejsca = null;
        Fasada instance = new Fasada();
        List<Miejsce> expResult = null;
        List<Miejsce> result = instance.wybierzMiejsca(dostepneMiejsca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UsunRezerwacje method, of class Fasada.
     */
    @Test
    public void testUsunRezerwacje() {
        System.out.println("UsunRezerwacje");
        KontoKlienta konto = null;
        int ID = 0;
        Fasada instance = new Fasada();
        boolean expResult = false;
        boolean result = instance.UsunRezerwacje(konto, ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obliczKoszt method, of class Fasada.
     */
    @Test
    public void testObliczKoszt() {
        System.out.println("obliczKoszt");
        Miejsce miejsce = new Miejsce(10,false,100);
        List<Miejsce> miejsca = new ArrayList<Miejsce>();
        for(int i=0;i<10;i++){
            miejsca.add(miejsce);
        }
        Fasada instance = new Fasada();
        int expResult = 1000;
        int result = instance.obliczKoszt(miejsca);
        assertEquals(expResult, result);
        
    }
    
}
