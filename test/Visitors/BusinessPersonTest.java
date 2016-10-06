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
public class BusinessPersonTest {
    
    @Test
    public void testBusinessPerson(){
        String BusinessLocations[] = {"Squirrel Hill", "Downtown"};
        BusinessPerson b = new BusinessPerson(1);
        assertTrue(b.likeOrDislike(BusinessLocations, "Downtown"));
        assertTrue(b.likeOrDislike(BusinessLocations, "Squirrel Hill"));
    }
}
