/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CinemaPackage;

import java.text.NumberFormat;

/**
 *
 * @author Chris
 */
public class Calculations extends Tickets{
    private int stdrd,oap,student,child;
    
    
    //override if first parameter is boolean.
    public Calculations(int stdrd, int oap, int student, int child, double stdrdPrice, double oapPrice, double studentPrice, double childPrice)
    {
        super(stdrdPrice,oapPrice,studentPrice,childPrice);
        setQuantities(stdrd,oap,student,child);
        System.out.println("The total cost of tickets for this movie is: " + NumberFormat.getCurrencyInstance().format(calculateFinal()));     
    }
    public Calculations(boolean restricted, int stdrd, int oap, int student, int child, double stdrdPrice, double oapPrice, double studentPrice, double childPrice)
    {
        super(stdrdPrice,oapPrice,studentPrice,childPrice);
        setQuantities(stdrd,oap,student,child);
        if(isAgeRestricted())
        {
        System.out.println("Children are unable to watch this movie.");
        }
        else 
        {
            System.out.println("The total cost of tickets for this movie is: " + NumberFormat.getCurrencyInstance().format(calculateFinal()));
        }
    }
    
    public void setQuantities(int newStdrd, int newOap, int newStudent, int newChild)
    {
        stdrd = newStdrd;
        oap = newOap;
        student = newStudent;
        child = newChild;
    }
    
   
    
    public boolean isAgeRestricted()
    {
        if(child > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double calculateFinal()
    {
        
        double finalPrice =  (stdrd * getStdrdPrice())+ (oap * getOapPrice()) + (student * getStudentPrice()) + (child * getChildPrice()); 
        return finalPrice;
    }
    
    /* old solution
    public double calculateFinal(double discountPrice)
    {
        double discount = (stdrd + oap + student + child) * discountPrice;
        double finalPrice = (stdrd * getStdrdPrice()) + (oap + getOapPrice()) + (student + getStudentPrice()) + (child + getChildPrice());
        finalPrice -= discount;
        return finalPrice;
    }
    */
    
}
