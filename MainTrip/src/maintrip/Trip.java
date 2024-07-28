/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintrip;

/**
 *
 * @author TEBALELO MADUMETSA
 */
public class Trip implements Comparable<Trip> {
    
    
    private String tripNumber;
    private int guests;
    private double pricePerGuest;
    private double priceForTrip;
    
    
    private final static double HIGH_GUEST_PRICE = 550.00;
    private final static double LOW_GUEST_PRICE = 500.00;
    private final static int LARGE_TRIP = 51;
    
    private final static int TRIP_NUM_LENGTH = 4;
     
   
    
    public Trip()
    {
        this("T000", 0);
    }

    public Trip(String tripNumber, int guests) {
        this.tripNumber = tripNumber;
        this.guests = guests;
        
        setTripNumber(tripNumber);
        setGuests(guests);
    }
   
  
    @Override
    public int compareTo(Trip e)
    {
      int result;
      if(priceForTrip == e.getPriceForTrip())
          result = 0;
      else
          if(priceForTrip > e.getPriceForTrip())
              result = 1;
      else
              result = -1;
      
      return result;
    }
    
    public String toString()
    {
        return "#" + tripNumber +"  Guests: " + guests +"  Price R" + priceForTrip
                ;
    }
    
    public void setTripNumber(String num)
    {
        if(num.length() != TRIP_NUM_LENGTH ||
           !Character.isLetter(num.charAt(0))||
           !Character.isDigit(num.charAt(1))||
           !Character.isDigit(num.charAt(2))||
           !Character.isDigit(num.charAt(3)))
            tripNumber = "T000";
        else
            tripNumber = num.toUpperCase();
            
    }
    
    public void setGuests(int gsts)
    {
        guests = gsts;
        if(isLargeTrip())
        {
            pricePerGuest = HIGH_GUEST_PRICE;
            priceForTrip = guests * pricePerGuest;
        }
        else
        {
         pricePerGuest = LOW_GUEST_PRICE;
         priceForTrip = guests * LOW_GUEST_PRICE;
        }
    }
 
    public String getTrpNumber()
    {
        return tripNumber;
    }
    
    public int getGuests()
    {
        return guests;
    }
    
    public double getPriceForTrip()
    {
        return priceForTrip;
    }
    
//    public double getPriceForGuest()
//    {
//       return pricePerGuest; 
//    }
//    
    public boolean isLargeTrip()       
    {
       boolean isLarge;
       
       if(guests < LARGE_TRIP)
       {
           isLarge = false;
       }
       else
       {
           isLarge = true;
       }
       return isLarge;
    }
    
}
