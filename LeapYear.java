/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

/**
 *
 * @author kalyani pc
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int n = 2010;
        if(n%4==0)
        {
            System.out.println(n+ " is a Leap year");
        }else
        {
            System.out.println(n+ " is not a Leap Year " );
                    
               
        }
    }
    
}
