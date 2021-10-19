/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class NumberTester {

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        int testfälle = 0;
        Scanner file = null;
        try {
            file = new Scanner(new File(fileName));
            testfälle = Integer.parseInt(file.nextLine());
            System.out.println("Testfälle: " + testfälle);
        } catch (Exception e) {
        }

        Integer[][] numbers = new Integer[testfälle][2];
        String[] splitted = new String[2];
        for (int i = 0; i < testfälle; i++) {
            splitted = file.nextLine().split(" ");
            numbers[i][0] = Integer.parseInt(splitted[0]);
            numbers[i][1] = Integer.parseInt(splitted[1]);
        }

        for (Integer[] number : numbers) {
            switch (number[0]) {
                case 1:
                    System.out.println(oddTester.testNumber(number[1]));
                    break;
                case 2:
                    System.out.println(primeTester.testNumber(number[1]));
                    break;
                case 3:
                    System.out.println(palindromeTester.testNumber(number[1]));
                    break;
            }
        }

    }
}
