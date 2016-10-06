/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

/**
 *
 * @author Gaole
 */
public class BusinessPerson extends Visitors{
    
    private String BusinessLocations[] = {"Squirrel Hill", "Downtown"};
    public BusinessPerson(int i){
        super.changeLocate(BusinessLocations);
        super.goToLocations(i, BusinessLocations);
    }
}
