/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu2;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class HalloJavamitForEach {

    ArrayList<String> list = new ArrayList<>();

    public HalloJavamitForEach(ArrayList<String> list) {
        this.list = list;
    }

    public void showList() {
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("ForEach--------------------------------------------");

        list.forEach((t) -> {
            System.out.println(t);
        });
    }
}
