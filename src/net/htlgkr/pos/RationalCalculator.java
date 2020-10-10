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
public class RationalCalculator extends AbstractCalculator{

    public RationalCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiplay, Number.CalculationOperation divide) {
        super(add, subtract, multiplay, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number num1 = new Number(a.getA() * b.getB(), a.getB() * b.getB());
        Number num2 = new Number( b.getA() * a.getB(), a .getB() * b.getB());
        return new Number(num1.getA() + num2.getA(), num1.getB() + num2.getB());
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number num1 = new Number(a.getA() * b.getB(), a.getB() * b.getB());
        Number num2 = new Number( b.getA() * a.getB(), a .getB() * b.getB());
        return new Number(num1.getA() - num2.getA(), num1.getB() - num2.getB());
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number num1 = new Number(a.getA() * b.getB(), a.getB() * b.getB());
        return num1;
       
    }

    @Override
    public Number divide(Number a, Number b) {
        return new Number(a.getA() / b.getB(), a.getB()/ b.getA());
    }
    
}
