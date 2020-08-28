/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Export_Import;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ravindu
 */
public class FormValidations {
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
        public boolean isNumeric(String input){
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch)) {
                JOptionPane.showMessageDialog(null,"Input only numeric Values");
                return false;
            }
        }
        return true;
    }
        public boolean isAlphaNumeric(String input){
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                JOptionPane.showMessageDialog(null,"Follow the Standard way");
                return false;
            }
        }
        return true;
    }
    
}
