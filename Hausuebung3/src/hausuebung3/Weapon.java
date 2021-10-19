/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Michael
 */
public class Weapon {
    private String name;
    private CombatType combatType;
    private DamageType damageType;
    private int damage;
    private int speed;
    private int strenght;
    private int value;
    
    static ArrayList<Weapon> weaponList;
    
//    interface compare{
//        public int compareWeapon(Weapon weapon1, Weapon weapon2);
//    }
    
    public Weapon(String name, CombatType combatType, DamageType damageType,int damage, int speed, int strenght, int value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strenght = strenght;
        this.value = value;
    }
    
    
    
    public static ArrayList<Weapon> generateWeapons(){
         weaponList = new ArrayList<>();
        try {
            
            File file = new File("weapons.csv");
        
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            reader.readLine();
            String weaponString = "";
            while ((weaponString = reader.readLine()) != null) {
                String[] splitted = weaponString.split(";");
                weaponList.add(new Weapon(splitted[0], CombatType.valueOf(splitted[1]), DamageType.valueOf(splitted[2]), Integer.parseInt(splitted[3]), Integer.parseInt(splitted[4]), Integer.parseInt(splitted[5]), Integer.parseInt(splitted[6])));
            }
            
        } catch (Exception e) {
            System.out.println("es is hi");
        }
        
        return weaponList;
    }
    
    static Comparator<Weapon> compareDamage = (Weapon w1, Weapon w2) -> w1.getDamage() - w2.getDamage();
    
    static Comparator<Weapon> compareAlpha = (Weapon o1, Weapon o2) -> {
        if(o1.combatType.compareTo(o2.combatType) != 0){
                return o1.combatType.compareTo(o2.combatType);
            }
            if((o1.damageType.toString().compareTo(o2.damageType.toString())) != 0){
                return o1.damageType.toString().compareTo(o2.damageType.toString());
            }
            else{
                return o1.name.compareTo(o2.name);
            }
    };
    
    public static ArrayList<Weapon> sortDamage(){
        ArrayList<Weapon> sorted = weaponList;
        
        sorted.sort(compareDamage);
        return sorted;
    }

    @Override
    public String toString() {
        return name +";"+ combatType +";"+ damageType +";"+ damage +";"+ speed +";"+ strenght +";"+ value ;
    }            
        
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    
    
    public enum CombatType{
        MELEE,
        RANGED,
        NONE;
    }
    public enum DamageType{
        SLASHING,
        MISSILE,
        BLUNT,
        NONE,
        PIERCING;
    }
    
    public  class compareDamage implements Comparator<Weapon>{
        @Override
        public  int compare(Weapon o1, Weapon o2){
            return o1.getDamage() - o2.getDamage();
        }
    }

}
