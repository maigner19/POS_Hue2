/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3;

import java.util.ArrayList;
import java.util.Comparator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class WeaponTest {
    
    public WeaponTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generateWeapons method, of class Weapon.
     */
    @Test
    public void testGenerateWeapons() {
        System.out.println("generateWeapons");
        ArrayList<Weapon> expResult = null;
        ArrayList<Weapon> result = Weapon.generateWeapons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortDamage method, of class Weapon.
     */
    
    @Test
    public void testSortDamage() {
        System.out.println("sortDamage");
        ArrayList<Weapon> weapon = Weapon.generateWeapons();
        
        ArrayList<Weapon> expResult = Weapon.generateWeapons();
        
        expResult.sort((o1, o2) -> {
            return o1.getDamage() - o2.getDamage();
        });
        ArrayList<Weapon> result = Weapon.sortDamage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDamage method, of class Weapon.
     */
    @Test
    public void testGetDamage() {
        System.out.println("getDamage");
        Weapon instance = null;
        int expResult = 0;
        int result = instance.getDamage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDamage method, of class Weapon.
     */
    @Test
    public void testSetDamage() {
        System.out.println("setDamage");
        int damage = 0;
        Weapon instance = null;
        instance.setDamage(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Weapon.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Weapon instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Weapon.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Weapon instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCombatType method, of class Weapon.
     */
    @Test
    public void testGetCombatType() {
        System.out.println("getCombatType");
        Weapon instance = null;
        Weapon.CombatType expResult = null;
        Weapon.CombatType result = instance.getCombatType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCombatType method, of class Weapon.
     */
    @Test
    public void testSetCombatType() {
        System.out.println("setCombatType");
        Weapon.CombatType combatType = null;
        Weapon instance = null;
        instance.setCombatType(combatType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDamageType method, of class Weapon.
     */
    @Test
    public void testGetDamageType() {
        System.out.println("getDamageType");
        Weapon instance = null;
        Weapon.DamageType expResult = null;
        Weapon.DamageType result = instance.getDamageType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDamageType method, of class Weapon.
     */
    @Test
    public void testSetDamageType() {
        System.out.println("setDamageType");
        Weapon.DamageType damageType = null;
        Weapon instance = null;
        instance.setDamageType(damageType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Weapon.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Weapon instance = null;
        int expResult = 0;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Weapon.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        int speed = 0;
        Weapon instance = null;
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStrenght method, of class Weapon.
     */
    @Test
    public void testGetStrenght() {
        System.out.println("getStrenght");
        Weapon instance = null;
        int expResult = 0;
        int result = instance.getStrenght();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStrenght method, of class Weapon.
     */
    @Test
    public void testSetStrenght() {
        System.out.println("setStrenght");
        int strenght = 0;
        Weapon instance = null;
        instance.setStrenght(strenght);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Weapon.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Weapon instance = null;
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Weapon.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        Weapon instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortAlphabe method, of class Weapon.
     */
    @Test
    public void testSortAlphabe() {
        System.out.println("sortAlphabe");
        ArrayList<Weapon> weapon = Weapon.generateWeapons();
        
        ArrayList<Weapon> expResult = Weapon.generateWeapons();
        
        expResult.sort((o1, o2) -> {
            if(o1.getCombatType().toString().compareTo(o2.getCombatType().toString()) != 0){
                return o1.getCombatType().toString().compareTo(o2.getCombatType().toString());
            }
            if((o1.getDamageType().toString().compareTo(o2.getDamageType().toString())) != 0){
                return o1.getDamageType().toString().compareTo(o2.getDamageType().toString());
            }
            else{
                return o1.getName().compareTo(o2.getName());
            }
        });
        ArrayList<Weapon> result = Weapon.sortDamage();
        assertEquals(expResult, result);
    }
    
}
