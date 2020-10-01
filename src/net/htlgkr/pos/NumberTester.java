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
    
    
    public static void main(String[] args) throws FileNotFoundException{
        NumberTester nt = new NumberTester("data");
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
    
    public void setPalindromeTEster(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile() {
        String[] line = new String[3];
        int num1 =0;
        int num2 =0;
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int lines = Integer.parseInt(br.readLine());
            for(int i = 0; i<lines; i++){
                line = br.readLine().split(" ");
                num1 = Integer.parseInt(line[0]);
                num2 = Integer.parseInt(line[1]);
            }
        }
        
    }
        
       

    
    
    public interface NumberTest{
        boolean testNumber(int number);
    }
}
