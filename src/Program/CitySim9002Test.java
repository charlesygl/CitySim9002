/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Visitors.Student;
import Visitors.Visitors;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Gaole
 */
public class CitySim9002Test {
    
    @Mock
    CitySim9002 c = Mockito.mock(CitySim9002.class);
    
    @Before
    public void setUp() throws Exception {
	MockitoAnnotations.initMocks(c);		
    }
    
    @After
	public void tearDown() throws Exception {
    }
        
    @Test
    public void locationsTest(){
        Visitors v = Mockito.mock(Student.class);
        String studentLocations[] = {"Squirrel Hill", "Downtown", "The Point"};
        String loc = "Downtown";
        Mockito.when(v.likeOrDislike(studentLocations, loc)).thenReturn(true);
        
    }
    
}
