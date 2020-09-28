/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.pos;

import net.htlgkr.pos.Number.CalculationOperation;

/**
 *
 * @author lgittmaier18
 */
public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;
    
    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiplay, CalculationOperation divide){
        
    }
    
    public abstract Number add(Number a, Number b);
    public abstract Number subtract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public abstract Number divide(Number a, Number b);
}
