/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.pos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lgittmaier18
 */
public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String fileName;
    public NumberTester(String fileName){
        this.fileName = fileName;
    }
    
    
    
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    } 
    
    public void setPalindromeTEster(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile() throws FileNotFoundException{
        File file = new File("data");
        
        if(!file.canRead() || !file.isFile()){
            System.exit(0);
        }
        
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("data"));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                System.out.println("Gelesene Zeile: " + zeile);
            }
        } catch (IOException e) {
            e.printStackTrace(); 
    
}
    }
    
    public interface NumberTest{
        boolean testNumber(int number);
    }
}
