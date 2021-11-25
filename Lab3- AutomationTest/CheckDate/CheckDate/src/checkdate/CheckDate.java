/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkdate;

/**
 *
 * @author ADMIN
 */
public class CheckDate {

    public static int dayInMonth(int month, int year) {        
        int day ;
        if(year <= 1000 || year > 3000)
            return 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 31;
                break;
            case 2:                               
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day= 29;
                } else {
                    day= 28;
                }
                break;
            default:
                day = 0;
        }
        return day;
    }
    
    public static boolean checkDate(int day, int month, int year){
        boolean result;
        if(month >= 1 && month < 12){
            if(day >= 1){
                result = day <= dayInMonth(month, year);
            }else {
                result = false;
            }
        }else {
            result = false;
        }
        return result;
    }
    
}
