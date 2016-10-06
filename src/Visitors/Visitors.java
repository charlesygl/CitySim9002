/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Gaole
 */
public class Visitors {
    
    private String[] locate;

    public void goToLocations(int visNum, String[] loc){
        
        loc = locate;
        int x = visNum;
        String locations[] = {"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "left the city"};
        
        Random rn = new Random();
        int rn1 = rn.nextInt(4);
        System.out.println("Visitor " + x + " is going to " + locations[rn1] + "!");
            if(likeOrDislike(loc,locations[rn1])){
                System.out.println("Visitor " + x + " did like " + locations[rn1] + ".");
            } else {
                System.out.println("Visitor " + x + " did not like " + locations[rn1] + ".");
            }
            
        int rn2 = rn.nextInt(5);
        while (rn2 != 4){
            System.out.println("Visitor " + x + " is going to " + locations[rn2] + "!");
            if(likeOrDislike(loc,locations[rn2])){
                System.out.println("Visitor " + x + " did like " + locations[rn2] + ".");
            } else {
                System.out.println("Visitor " + x + " did not like " + locations[rn2] + ".");
            }
            rn2 = rn.nextInt(5);
        }
        if(rn2 == 4){
            System.out.println("Vistor " + x + " has left the city.");
            System.out.println("***");
        } 
    }
    
    public void changeLocate(String[] locateString){
        locate = locateString;
    }
    
    public boolean likeOrDislike(String[] a, String b){
        String[] aa = a;
        String bb = b;
        if(Arrays.asList(aa).contains(bb)){
            return true;
        } else {
            return false;
        }
    }


}
