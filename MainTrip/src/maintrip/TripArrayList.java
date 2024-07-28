
package maintrip;


import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Scanner;
/**
 *
 * @author TEBALELO MADUMETSA
 */
public class TripArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
    public void mRunMethod()
    {
        
        ArrayList<Trip> tripList = new ArrayList<>();

     Scanner sc = new Scanner(System.in);
     final String QUIT = "EXIT";
     String tripNum = "";
     int guests;
     int a;
   
        while(!tripNum.equals(QUIT))
        {
           System.out.println("Enter trip number or "  + QUIT + " to quit >> ");
          
           tripNum = sc.nextLine();
           
           if(!tripNum.isBlank() || !tripNum.isEmpty())
           {
               if(!tripNum.equals(QUIT))
               {
                   System.out.println("Enter number of guests >>");
                    guests = sc.nextInt();

               if(guests != 0 || guests >= 1)
               {
                   tripList.add(new Trip(tripNum, guests));
                     tripNum = "";
                     guests = 0;
                               
               }  
           }
               
           }
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Before Sort:");
        
        for (Trip tripList1 : tripList) {
            System.out.println(tripList1.toString());
        }
        
        System.out.println("After Sort:");
        Collections.sort(tripList);
        
        for (Trip tripList1 : tripList) {
            System.out.println(tripList1.toString());
        }
//        System.out.println("List before Sort:");
     }
    
}
