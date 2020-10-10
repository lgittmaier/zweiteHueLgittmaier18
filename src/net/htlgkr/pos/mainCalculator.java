/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.pos;

/**
 *
 * @author User
 */
public class mainCalculator {
    public static void main(String[] args){
        RationalCalculator rc = new RationalCalculator((Number a, Number b) ->{
            
            Number num1 = new Number(a.getA() * b.getB(), a.getB() * b.getB());
            Number num2 = new Number( b.getA() * a.getB(), a .getB() * b.getB());
            return new Number(num1.getA() + num2.getA(), num1.getB() + num2.getB());
            
        }, (Number a, Number b) -> {
            
            Number num1 = new Number(a.getA() * b.getB(), a.getB() * b.getB());
            Number num2 = new Number( b.getA() * a.getB(), a .getB() * b.getB());
            return new Number(num1.getA() - num2.getA(), num1.getB() - num2.getB());
            
        },(Number a, Number b) -> {
            Number num1 = new Number(a.getA() * b.getB(), a.getB() * b.getB());
            return num1;
        
        },(Number a, Number b) -> {
             return new Number(a.getA() / b.getB(), a.getB()/ b.getA());
        });
        
        VectorCalculator vc = new VectorCalculator((Number a, Number b) -> {
             return new Number(a.getA() + b.getA(), a.getB() + b.getB());
            
        },(Number a, Number b) -> {
            return new Number(a.getA() - b.getA(), a.getB() - b.getB());
        },
        )
            
                
          }


}
  
