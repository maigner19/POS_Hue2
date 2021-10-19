/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu2;

import java.io.File;
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

        setOddEvenTester((number) -> {
            return number % 2 == 0;
        });

        setPrimeTester((number) -> {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        });

        setPalindromeTester((number) -> {
            String variable = String.valueOf(number);
            StringBuffer reversed = new StringBuffer(variable).reverse();

            return reversed.toString().equals(variable);
        });
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
        this.oddTester.testNumber(0);
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
                    if (oddTester.testNumber(number[1])) {
                        System.out.println("EVEN");
                    } else {
                        System.out.println("ODD");
                    }
                    break;
                case 2:
                    if (primeTester.testNumber(number[1])) {
                        System.out.println("PRIME");
                    } else {
                        System.out.println("NO PRIME");
                    }
                    break;
                case 3:
                    if (palindromeTester.testNumber(number[1])) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NO PALINDROME");
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
