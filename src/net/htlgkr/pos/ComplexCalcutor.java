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
public class ComplexCalcutor extends AbstractCalculator{

    public ComplexCalcutor(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation multiplay, Number.CalculationOperation divide) {
        super(add, subtract, multiplay, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        
        
        throw new UnsupportedOperationException();
    }

    @Override
    public Number subtract(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number multiply(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number divide(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
