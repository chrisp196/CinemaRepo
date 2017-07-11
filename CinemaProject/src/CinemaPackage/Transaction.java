/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CinemaPackage;

import java.text.NumberFormat;
import java.util.Calendar;

/**
 *
 * @author Chris
 */
public class Transaction extends Tickets
{
    private double discountPrice;
    
    public Transaction(double stdrdPrice, double oapPrice, double studentPrice, double childPrice, double discountPrice)
    {
        super(stdrdPrice,oapPrice,studentPrice,childPrice);
        if(isDiscountActive())
        {
        setDiscountPrice(discountPrice);
        calculateDiscountedPrices();
        }
        viewPrices();
        
    }
    
    
    public void setDiscountPrice(double newDiscountPrice)
    {
        discountPrice = newDiscountPrice;
    }
   
    public boolean isDiscountActive()
    {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        //is today wednesday? (can change WEDNESDAY to current day for testing discount functionality)
        if (day == Calendar.WEDNESDAY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void calculateDiscountedPrices()
    {
        setStdrdPrice(getStdrdPrice() - discountPrice);
        setOapPrice(getOapPrice() - discountPrice);
        setStudentPrice(getStudentPrice() - discountPrice);
        setChildPrice(getChildPrice() - discountPrice);
        
    }
    public void viewPrices()
    {
        System.out.println("Standard Ticket Price is " + NumberFormat.getCurrencyInstance().format(getStdrdPrice()) +"\nOAP Ticket Price is " + NumberFormat.getCurrencyInstance().format(getOapPrice()) + "\nStudent Ticket Price is " + NumberFormat.getCurrencyInstance().format(getStudentPrice()) + "\nChild Ticket Price is " + NumberFormat.getCurrencyInstance().format(getChildPrice()));
    }
    
}
