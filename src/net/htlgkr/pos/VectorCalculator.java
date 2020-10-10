/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.pos;

/**
 *
 * @author lgittmaier18
 */
public class VectorCalculator extends AbstractCalculator{

    public VectorCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiplay, Number.CalculationOperation divide) {
        super(add, subtract, multiplay, divide);
    }

    @Override
    public Number add(Number a, Number b) {
       return new Number(a.getA() + b.getA(), a.getB() + b.getB());
    }

    @Override
    public Number subtract(Number a, Number b) {
        return new Number(a.getA() - b.getA(), a.getB() - b.getB());
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number num1 = new Number(a.getA() * b.getA(), 0.0);
        Number num2 = new Number(a.getB() * b.getB(), 0.0);
        return new Number(num1 + 0.0, num2+ 0.0);
    }

    @Override
    public Number divide(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
