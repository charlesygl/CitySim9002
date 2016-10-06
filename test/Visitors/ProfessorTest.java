/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
/**
 *
 * @author Gaole
 */
public class ProfessorTest {
    
    @Test
    public void testProfessor(){
        String professorLocations[] = {"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown"};
        Professor v = new Professor(1);
        assertTrue(v.likeOrDislike(professorLocations, "The Point"));
        assertTrue(v.likeOrDislike(professorLocations, "Downtown"));
        assertTrue(v.likeOrDislike(professorLocations, "Squirrel Hill"));
        assertTrue(v.likeOrDislike(professorLocations, "The Cathedral of Learning"));
    }
    
}
