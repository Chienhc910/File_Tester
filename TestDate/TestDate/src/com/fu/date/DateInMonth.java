
package com.fu.date;

public class DateInMonth {
    
    public static int checkDateInMonth(int month, int year)
    {  
       
        if(month < 1 || month > 12 || year >3000 || year < 1000)
            throw new IllegalArgumentException("Invalid Agurment "+
                    "month have to between 1  and 12  And year have to between 1000 and 3000");
        
        else  if(month == 1 || month == 3 || month == 5 || month ==7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if(month == 4 || month == 6 || month == 9  || month == 11 )
            return 30;
        else if(month == 2 &&  year % 4 == 0)
            return 29;
        else
            return 28;
     
        
        
    }

}
