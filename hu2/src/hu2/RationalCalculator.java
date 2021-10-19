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
public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);

    }

    @Override
    public Number add(Number a, Number b) {
        return add(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide(a, b);
    }

}
