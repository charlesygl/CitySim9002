/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import Visitors.Visitors;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;

/**
 *
 * @author Gaole
 */
public class VistorsTest {
    
    
    @Test
    public void testVisitor(){
        String locations[] = {"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "left the city"};
        Visitors v = new Visitors();
        assertTrue(v.likeOrDislike(locations, "The Point"));
        assertTrue(v.likeOrDislike(locations, "Downtown"));
        assertTrue(v.likeOrDislike(locations, "Squirrel Hill"));
        assertTrue(v.likeOrDislike(locations, "What"));
    }
    
}
