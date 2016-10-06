/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


import org.junit.Assert;

/**
 *
 * @author AsphaltPanthers
 */
public class Validator {
    public boolean validateArguments(String[] args) {
        return validateNumberOfArguments(args) && validateArgumentIsZeroOrNot(args);
    }
    
    public boolean validateNumberOfArguments(String[] args) {
        return args.length == 1;
    }
    
    public boolean validateArgumentType(String[] args) {
        try {
            Integer.parseInt(args[0]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean validateArgumentIsZeroOrNot(String[] args){
        boolean argumentIsNumber = validateArgumentType(args);
        if(argumentIsNumber){
            int argNum = Integer.parseInt(args[0]);
            if(argNum == 0){
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    

    
}
