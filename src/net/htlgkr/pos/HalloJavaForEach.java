/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.pos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author lgittmaier18
 */
public class HalloJavaForEach {
    List<String> list = new ArrayList<String>();
    
    public void ok(){
        for (String string : list) {
            System.out.println(string);
        }
        list.forEach((String s) -> System.out.println(s));
        Consumer<String> consumer = (String s) -> System.out.println(s);
        
    }
    
    
}
