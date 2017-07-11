/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CinemaPackage;

import java.util.Scanner;
/**
 *
 * @author Chris
 */
public class Main 
{
    
    
    public static boolean ratedR = false;
    public static String stdrdStr,oapStr,studentStr,childStr;
    static int stdrd,oap,student,child;
    public static void main(String[] args)
    {
       //Instantiate Transaction. (derived from Tickets)
        Transaction cinemaSale = new Transaction(8,6,6,4,2);
        
         ///////////////////////////////
        ///////USER INPUT//////////////
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many tickets you wish to purchase:\nStandard:");
        stdrdStr = input.next();
        System.out.print("OAP:");
        oapStr = input.next();
        System.out.print("Student:");
        studentStr = input.next();
        System.out.print("Child: ");
        childStr = input.next();
       
        int stdrd = Integer.parseInt(stdrdStr);
        int oap = Integer.parseInt(oapStr);
        int student = Integer.parseInt(studentStr);
        int child = Integer.parseInt(childStr);
        
        ///////////////////////////////
        ///////////////////////////////
        //is the movie appropriate?
        //if rated R (18) and no children, calculated normally, if children, should be unable to purchase ticket.
        //children's tickets can be bought if movie is appropriate
        
        if(ratedR)
        {
            Calculations finalSale = new Calculations(true,stdrd,oap,student,child,cinemaSale.getStdrdPrice(),cinemaSale.getOapPrice(),cinemaSale.getStudentPrice(),cinemaSale.getChildPrice());
        }
        else
        {
            Calculations finalSale = new Calculations(stdrd,oap,student,child,cinemaSale.getStdrdPrice(),cinemaSale.getOapPrice(),cinemaSale.getStudentPrice(),cinemaSale.getChildPrice());
        }
    }
    
}

