/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entities;

import java.time.LocalDate;
import java.time.ZonedDateTime;
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
public class LotTest {
    
    public LotTest() {
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
     * Test of getIloscMiejsc method, of class Lot.
     */
    @Test
    public void testGetIloscMiejsc() {
        System.out.println("getIloscMiejsc");
        Lot instance = null;
        int expResult = 0;
        int result = instance.getIloscMiejsc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIloscMiejsc method, of class Lot.
     */
    @Test
    public void testSetIloscMiejsc() {
        System.out.println("setIloscMiejsc");
        int iloscMiejsc = 0;
        Lot instance = null;
        instance.setIloscMiejsc(iloscMiejsc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Lot.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Lot instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Lot.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Lot instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiejsceWylotu method, of class Lot.
     */
    @Test
    public void testGetMiejsceWylotu() {
        System.out.println("getMiejsceWylotu");
        Lot instance = null;
        String expResult = "";
        String result = instance.getMiejsceWylotu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiejsceWylotu method, of class Lot.
     */
    @Test
    public void testSetMiejsceWylotu() {
        System.out.println("setMiejsceWylotu");
        String miejsceWylotu = "";
        Lot instance = null;
        instance.setMiejsceWylotu(miejsceWylotu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelLotu method, of class Lot.
     */
    @Test
    public void testGetCelLotu() {
        System.out.println("getCelLotu");
        Lot instance = null;
        String expResult = "";
        String result = instance.getCelLotu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCelLotu method, of class Lot.
     */
    @Test
    public void testSetCelLotu() {
        System.out.println("setCelLotu");
        String celLotu = "";
        Lot instance = null;
        instance.setCelLotu(celLotu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumerBramki method, of class Lot.
     */
    @Test
    public void testGetNumerBramki() {
        System.out.println("getNumerBramki");
        Lot instance = null;
        int expResult = 0;
        int result = instance.getNumerBramki();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumerBramki method, of class Lot.
     */
    @Test
    public void testSetNumerBramki() {
        System.out.println("setNumerBramki");
        int numerBramki = 0;
        Lot instance = null;
        instance.setNumerBramki(numerBramki);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumerSamolotu method, of class Lot.
     */
    @Test
    public void testGetNumerSamolotu() {
        System.out.println("getNumerSamolotu");
        Lot instance = null;
        int expResult = 0;
        int result = instance.getNumerSamolotu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumerSamolotu method, of class Lot.
     */
    @Test
    public void testSetNumerSamolotu() {
        System.out.println("setNumerSamolotu");
        int numerSamolotu = 0;
        Lot instance = null;
        instance.setNumerSamolotu(numerSamolotu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpoznienie method, of class Lot.
     */
    @Test
    public void testGetOpoznienie() {
        System.out.println("getOpoznienie");
        Lot instance = null;
        int expResult = 0;
        int result = instance.getOpoznienie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpoznienie method, of class Lot.
     */
    @Test
    public void testSetOpoznienie() {
        System.out.println("setOpoznienie");
        int opoznienie = 0;
        Lot instance = null;
        instance.setOpoznienie(opoznienie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataWylotu method, of class Lot.
     */
    @Test
    public void testGetDataWylotu() {
        System.out.println("getDataWylotu");
        Lot instance = null;
        ZonedDateTime expResult = null;
        ZonedDateTime result = instance.getDataWylotu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataWylotu method, of class Lot.
     */
    @Test
    public void testSetDataWylotu() {
        System.out.println("setDataWylotu");
        ZonedDateTime dataWylotu = ZonedDateTime.now();
        
        Lot instance = new Lot("a","a",1,1,1,dataWylotu);
        ZonedDateTime dataPoAktualizacji = ZonedDateTime.now();
        instance.setDataWylotu(dataPoAktualizacji);
        assertEquals(instance.getDataWylotu(),dataPoAktualizacji);
        
    }

    /**
     * Test of PokazWolneMiejsca method, of class Lot.
     */
    @Test
    public void testPokazWolneMiejsca() {
        System.out.println("PokazWolneMiejsca");
        Lot instance = null;
        List<Miejsce> expResult = null;
        List<Miejsce> result = instance.PokazWolneMiejsca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of porownajLoty method, of class Lot.
     */
    @Test
    public void testPorownajLoty() {
        System.out.println("porownajLoty");
        String miejsceWylotu = "";
        String celLotu = "";
        LocalDate data = null;
        Lot instance = null;
        boolean expResult = false;
        boolean result = instance.porownajLoty(miejsceWylotu, celLotu, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
