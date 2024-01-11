package assessment;

import java.io.*;

public class TimeFormat {
	
	static void print24(String str)
	{
	   
	    int hr1 = (int)str.charAt(1) - '0';
	    int hr2 = (int)str.charAt(0) - '0';
	    int hhr = (hr2 * 10 + hr1 % 10);
	 
	    
	    if (str.charAt(8) == 'A')
	    {
	        if (hhr == 12)
	        {
	            System.out.print("00");
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	        else
	        {
	            for (int i = 0; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	    }
	 
	   
	    else   // If time is in "PM"
	    {
	        if (hhr == 12)
	        {
	            System.out.print("12");
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	        else
	        {
	            hhr = hhr + 12;
	            System.out.print(hhr);
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	    }
	}
	
	 public static void main(String[] args)
	{
	    String str = "01:05:45PM";
	    
	    print24(str);
	}
	}