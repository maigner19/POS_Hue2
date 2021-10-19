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
public class ComplexCalculator extends AbstractCalculator {

    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
        double i = Math.sqrt(-1);
        add = (x, y) -> {
            Number res = new Number();
            res.setA((x.getA() + y.getA()) + (x.getA() + y.getA()) * i);
            res.setB((x.getA() + y.getA()) + (x.getA() + y.getA()) * i);
            return res;
        };
        subtract = (x, y) -> {
            Number res = new Number();
            res.setA((x.getA() - y.getA()) + (x.getA() - y.getA()) * i);
            res.setB((x.getA() - y.getA()) + (x.getA() - y.getA()) * i);
            return res;
        };
        multiply = (x, y) -> {
            Number res = new Number();
            res.setA((x.getA() - y.getA()) + (x.getB() + y.getB()) * i);
            res.setB((x.getA() - y.getA()) + (x.getB() + y.getB()) * i);
            return res;
        };
        divide = (x, y) -> {
            Number res = new Number();
            res.setA(((x.getA() + x.getB() * i) * (y.getA() - y.getB() * i)) / ((y.getA() + y.getB() * i) * (y.getA() - y.getB() * i)));
            res.setB(((x.getA() + x.getB() * i) * (y.getA() - y.getB() * i)) / ((y.getA() + y.getB() * i) * (y.getA() - y.getB() * i)));
            return res;
        };
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
