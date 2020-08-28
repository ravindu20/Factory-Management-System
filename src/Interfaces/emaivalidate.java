package Interfaces;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishlanka
 */
import javax.swing.JOptionPane;
public class emaivalidate {
       public boolean validateEmail(String input) {
        if (input.endsWith(".com") && countCharacter(input, '@') == 1) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Invalid E-mail", "Error", 0);
       
        return false;
    }
    private int countCharacter(String text, char key){
        int count = 0;
        char c;
        
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            if (c == key) {
                count++;
            }
        }
        return count;
    }
  
    
}
    

