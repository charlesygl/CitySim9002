/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;
/**
 *
 * @author Gaole
 */
public class ProfessorTest {
    
    @Test
    public void testProfessor(){
        String professorLocations[] = {"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown"};
        Professor p = new Professor(1);
       
        assertTrue(p.likeOrDislike(professorLocations, "The Point"));
        assertTrue(p.likeOrDislike(professorLocations, "Downtown"));
        assertTrue(p.likeOrDislike(professorLocations, "Squirrel Hill"));
        assertTrue(p.likeOrDislike(professorLocations, "The Cathedral of Learning"));
    }
    
}
