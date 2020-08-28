/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gajeendra
 */
public class Validations {
     private Pattern regexPattern;
    private Matcher regMatcher;

    public String validateEmailAddress(String emailAddress) {

        regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()) {
            return "Valid Email Address";
        } else {
            return "Invalid Email Address";
        }
    }

    public String validateMobileNumber(String mobileNumber) {
        regexPattern = Pattern.compile("^\\+[0-9]{2,3}+-[0-9]{10}$");
        regMatcher   = regexPattern.matcher(mobileNumber);
        if(regMatcher.matches()) {
            return "Valid Mobile Number";
        } else {
            return "Invalid Mobile Number";
        }
    }

    public static void main(String[] args) {

        String emailAddress = "suryaprakash.pisay@gmail.com";
        String mobileNumber = "+91-9986571622";
        Validations validations = new Validations();
        System.out.println(validations.validateEmailAddress(emailAddress));
        System.out.println(validations.validateMobileNumber(mobileNumber));
    }
}
