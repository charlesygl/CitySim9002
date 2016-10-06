/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Domain.Validator;
import Visitors.*;
import java.util.Random;

/**
 *
 * @author AsphaltPanthers
 */
public class CitySim9002 {
    public static String errorMessage = "Please enter one integer argument, seed";
    
    public static void main(String[] args) {
        if (new Validator().validateArguments(args)) {
            int seed = Integer.parseInt(args[0]);
            System.out.println("Welcome to CitySim! Your seed is " + seed);
            for(int i = 1; i < 6; i++){
                Random rn = new Random();
                int rnForVis = rn.nextInt(4); // student, business, professor, blogger
                if (rnForVis == 0){
                    System.out.println("Visitor " + i + " is a Student.");
                    Student stu = new Student(i);
                } else if (rnForVis == 1){
                    System.out.println("Visitor " + i + " is a BusinessPerson.");
                    BusinessPerson bsp = new BusinessPerson(i);
                } else if (rnForVis == 2){
                    System.out.println("Visitor " + i + " is a Professor.");
                    Professor pro = new Professor(i);
                } else if (rnForVis == 3){
                    System.out.println("Visitor " + i + " is a Blogger.");
                    Blogger blg = new Blogger(i);
                }
            }
        }
        else {
            System.out.println(errorMessage);
        }
    }
}
