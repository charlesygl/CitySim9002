/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
/**
 *
 * @author Gaole
 */
public class BloggerTest {
    @Test
    public void testBlogger(){
        String bloggerLocations[] = {};
        Blogger b = new Blogger(1);
        assertFalse(b.likeOrDislike(bloggerLocations, ""));
    }
}
