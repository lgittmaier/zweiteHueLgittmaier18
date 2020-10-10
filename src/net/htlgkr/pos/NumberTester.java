/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.pos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 *
 * @author lgittmaier18
 */
public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String fileName;
    
    
    public static void main(String[] args) throws FileNotFoundException{
        NumberTester nt = new NumberTester("data.txt");
        nt.testFile();
    }
    
    public NumberTester(String fileName){
        this.fileName = fileName;
    }
    
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    } 
    
    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile() throws FileNotFoundException {
        String[] line = new String[3];
        int num1 =0;
        int num2 =0;
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(this.fileName));
            int lines = Integer.parseInt(br.readLine());
            for(int i = 0; i<lines; i++){
                line = br.readLine().split(" ");
                num1 = Integer.parseInt(line[0]);
                num2 = Integer.parseInt(line[1]);
                
                switch(num1) {
                    case 1: 
                        setOddEvenTester((o) -> o %2 == 0);
                        if(oddTester.testNumber(num2)) {
                            System.out.println("PRIME");
                        }else{
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 2:
                        setPrimeTester((p) -> this.isPrime(p));
                        break;
                    case 3:
                        setPalindromeTester((pal) -> {
                            return pal == IntStream.iterate(pal, f -> f/10)
                                    .map(m -> m%10)
                                    .limit(String.valueOf(pal).length())
                                    .reduce(0, (a, b) -> a = a* 10 +b);
                                    
                        });
                        if(this.palindromeTester.testNumber(num2)) {
                            System.out.println("PALINDROME");
                            
                        }else {
                            System.out.println("NO PALINDROME");
                        }
                        break;
                    
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private boolean isPrime(int p) {
        boolean prime = true;
        
        if(p <= 1) {
            prime = false;
        }else{
            for(int i = 2; i <= p /2; i++){
                if((p%i) == 0){
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
        
       

    
    
    public interface NumberTest{
        boolean testNumber(int number);
    }
}
