/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3HW;
import java.util.Scanner;
/**
 *
 * @author Lisa
 */
public class Scholarship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gpa;
        int numberOfExtraActivities;
        int numberOfServiceActivities;
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your GPA?");
        gpa = input.nextDouble();
        
        System.out.println("How many Extra Curricular Activies are you doing?");
        numberOfExtraActivities = input.nextInt();
        
        System.out.println("How many Service Activities are you doing?");
        numberOfServiceActivities = input.nextInt();
        
        if (gpa>=3.8 && numberOfExtraActivities>=1 && numberOfServiceActivities>=1)
        System.out.println("You are a scholarship candidate!");
        
        else if ((gpa<=3.8 || gpa>=3.4) && numberOfExtraActivities>=3 && numberOfServiceActivities>=3)
        System.out.println("You are a scholarship candidate!");
        
        else if ((gpa<=3.4 || gpa>=3.0) && numberOfExtraActivities>=2 && numberOfServiceActivities>=3)
        System.out.println("You are a scholarship candidate!");
       
        else
            System.out.println("You are not a candidate.");
                
    }
}
    

