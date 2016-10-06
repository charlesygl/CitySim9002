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
public class Professor extends Visitors {
    private String professorLocations[] = {"The Cathedral of Learning","Squirrel Hill","The Point","Downtown"};
    public Professor(int i){
        super.changeLocate(professorLocations);
        super.goToLocations(i,professorLocations);
    }
}
