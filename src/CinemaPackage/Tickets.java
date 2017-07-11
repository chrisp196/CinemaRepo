/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CinemaPackage;


/**
 *
 * @author Chris
 */

//abstract base class
public abstract class Tickets {
    private double stdrdPrice;
    private double oapPrice;
    private double studentPrice;
    private double childPrice;

    
    public Tickets(double stdrdPrice, double oapPrice, double studentPrice, double childPrice)
    {
        this.stdrdPrice = stdrdPrice;
        this.oapPrice = oapPrice;
        this.studentPrice = studentPrice;
        this.childPrice = childPrice;
    }
    //priceArray[stdrdPrice,oapPrice,studentPrice,childPrice,discountPrice,finalPrice]
    //public void setPrices(double prices[])
    //print array or list of prices
    
    
    
    public void setStdrdPrice(double newStdrdPrice)
    {
        stdrdPrice = newStdrdPrice;
    }
    
    
    public double getStdrdPrice()
    {      
        return stdrdPrice;
    }
    
    public void setOapPrice(double newOapPrice)
    {
        oapPrice = newOapPrice;
    }
    
    public double getOapPrice()
    {
        return oapPrice;
    }
    
    public void setStudentPrice(double newStudentPrice)
    {
        studentPrice = newStudentPrice;
    }
    
    public double getStudentPrice()
    {
        return studentPrice;
    }
    
    public void setChildPrice(double newChildPrice)
    {
        childPrice = newChildPrice;
    }
    
    public double getChildPrice()
    {
        return childPrice;
    }

    
}

