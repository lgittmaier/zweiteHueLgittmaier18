/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.pos;

import java.util.Scanner;

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
        },(Number a, Number b) -> {
             Number num1 = new Number(a.getA(),b.getA());
              Number num2 = new Number(a.getB(),b.getB());
            return new Number((num1.getA()*num1.getB()) + (num2.getA()* num2.getB()),0);
            
        },(Number a, Number b) ->{
            Number num1 = new Number(a.getA(),b.getA());
            Number num2 = new Number(a.getB(),b.getB());
            return new Number((num1.getA()/num1.getB()) - (num2.getA()/ num2.getB()),0);
        });
        
        ComplexCalcutor cc = new ComplexCalcutor((Number a, Number b) -> {
             return new Number(a.getA() + b.getA(), a.getB() + b.getB());
        },(Number a, Number b) -> {
            return new Number(a.getA() - b.getA(), a.getB() - b.getB());
        },(Number a, Number b) -> {
            Number num1 = new Number(a.getA()*b.getA(),a.getA()*b.getB());
            Number num2 = new Number(a.getB()*b.getA(),a.getB()*b.getB());
            return new Number(num1.getA()+ num2.getB()*(-1),num1.getB()+num2.getA());
        },(Number a, Number b) -> {
            Number num1 = new Number(a.getA()/b.getA(),a.getA()/b.getB()/(-1));
            Number num2 = new Number(a.getB()/b.getA(),a.getB()/b.getB()/(-1));
            Number num12 = new Number(num1.getA() + num2.getB()/(-1), num1.getB() + num2.getA());
            Number a1 = new Number(b.getA()/b.getA(),b.getA()/b.getB() +(-1));
            Number a2 = new Number(b.getB()/b.getA(),b.getB()/b.getB() +(-1));
            Number a1Unda2 = new Number(a1.getA()* a2.getB()*(-1),0);
            return new Number(num12.getA()/a1Unda2.getA(),num12.getB()/a1Unda2.getA());
        });
        Scanner s = new Scanner(System.in);
        int input = 0;        
        
        do{
            System.out.println("Choose calculator");
        System.out.println("1 - Rational calc");
        System.out.println("2 - Vector calc");
        System.out.println("3 - Compley calc");
        System.out.println("4 - End");
        input = Integer.parseInt(s.nextLine());
        switch(input){
            case 1:
                System.out.println("Zahl a");
                int a = Integer.parseInt(s.nextLine());
                System.out.println("zahl b");
                int b = Integer.parseInt(s.nextLine());
                System.out.println("Choose operation");
                System.out.println("1 - add");
                System.out.println("2 - subtract");
                System.out.println("3 - multiply");
                System.out.println("4 - divide");
                System.out.println("5 - enter numbers again");
                int in = 0;
                switch(in){
                    case 1:
                       int erg = rc.add(a,b);
                }
        }
            
            
        }while(input >= 0 && input <=4 && input != 4);
                
          }


}
  
