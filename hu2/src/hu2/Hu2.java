/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu2;

/**
 *
 * @author Michael
 */
public class Hu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberTester tester = new NumberTester("numbers.csv");
        tester.testFile();
    }

}
