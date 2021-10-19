/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Weapon> weapon = Weapon.generateWeapons();
        Printable printable = x -> {
            for (int i = 0; i < weapon.size(); i++) {
                System.out.println(weapon.get(i).toString());
            }
        };
        
        printable.print(weapon);
        
        Printable print = x->{
            for (Weapon wp : x) {
                System.out.println(String.format("|%20s|",wp.getName())+ String.format("%20s|",wp.getCombatType().toString())+ String.format("%20s|",wp.getDamageType().toString())+ String.format("%20d|", wp.getDamage())+ String.format("%20d|", wp.getSpeed())+ String.format("%20d|",wp.getStrenght())+String.format("%20d|",wp.getValue()));
            }
        };
        
        print.print(weapon);
    }
    
}
