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
public class Blogger extends Visitors {
    private String bloggerLocations[] = {};
    public Blogger(int i){
        super.changeLocate(bloggerLocations);
        super.goToLocations(i, bloggerLocations);
    }
}
