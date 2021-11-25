
package com.fu.date;


public class CheckDate {
    
    public static boolean CheckDate(String day, String month, String year)
    {
        if(day.isEmpty() || month.isEmpty() || year.isEmpty())
            throw new NullPointerException("Day or Month or Year is not empty");
          
        
        if( Integer.parseInt(day) > 31 || Integer.parseInt(day) < 1  ||
               Integer.parseInt(month) >12 || Integer.parseInt(month) < 1 
                || Integer.parseInt(year) <1000 || Integer.parseInt(year) > 3000)
           return false;
        else if( (Integer.parseInt(month) == 4 || Integer.parseInt(month) == 6 || Integer.parseInt(month) == 9
                || Integer.parseInt(month) == 11)  &&  (Integer.parseInt(day) <= 30))
            return true;
        
       else if( (Integer.parseInt(month) == 1 || Integer.parseInt(month) == 3 || Integer.parseInt(month) == 5
                || Integer.parseInt(month) ==7 || Integer.parseInt(month) == 8 || Integer.parseInt(month) == 10
                || Integer.parseInt(month) == 12) && (Integer.parseInt(day) <= 31))
            return true;
       
       else if (Integer.parseInt(month) == 2 && Integer.parseInt(year) % 4 == 0  && Integer.parseInt(day) <= 29  )
            return true;
       else if (Integer.parseInt(month) == 2 && Integer.parseInt(year) % 4 != 0  && Integer.parseInt(day) <= 28  )
            return true;
                
        return false;
    }
}
