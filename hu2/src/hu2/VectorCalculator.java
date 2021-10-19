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
public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);

        add = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() + y.getA());
            res.setB(x.getB() + y.getB());
            return res;
        };
        subtract = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() - y.getA());
            res.setB(x.getB() - y.getB());
            return res;
        };
        multiply = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() * y.getA());
            res.setB(x.getB() * y.getB());
            return res;
        };
        divide = (x, y) -> {
            Number res = new Number();
            res.setA(x.getA() / y.getA());
            res.setB(x.getB() / y.getB());
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
