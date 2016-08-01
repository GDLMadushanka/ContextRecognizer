/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextrecognizer;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lahiru
 */
public class ColumnContextThread implements Runnable{
Column col;
String[] DataToProcess;
Set<Integer> set_int = new HashSet<Integer>();
Set<Float> set_float = new HashSet<Float>();
Set<String> set_string = new HashSet<String>();

public ColumnContextThread(Column col,String[] data){this.col = col;this.DataToProcess=data;}


    @Override
    public void run() {
        
        System.out.println(preProcessData());
    }
    
    public int preProcessData() // select first 100 rows and deduce the data type
   /*   1 - int
        2 - float
        3 - string
        4 - date
        -1 - error    */
    {
        int intCount =0,floatCount=0,StringCount=0,dateCount=0;
        int iterations = 100;
        if(DataToProcess.length<iterations){iterations = DataToProcess.length;}
        for (int i = 1; i < iterations; i++) { // i=1 without header
            String temp = DataToProcess[i];
            if(this.tryParseInt(temp)){set_int.add(Integer.parseInt(temp));}
            else if(this.tryParseFloat(temp)){set_float.add(Float.parseFloat(temp));}
            else set_string.add(temp);
        }
        int returnValue=0;
        // if any type contains more than half of the iterations that type is selected
        if(set_int.size()>iterations/2){returnValue=1;}
        else if(set_float.size()>iterations/2){returnValue=2;}
        else if(set_string.size()>iterations/2){returnValue=3;}
        
        return returnValue;
    }
    
    boolean tryParseInt(String value) {  
     try {  
         Integer.parseInt(value);  
         return true;  
        } catch (NumberFormatException e) {  
         return false;  
        }  
    }    
    
    boolean tryParseFloat(String value) {  
     try {  
         Float.parseFloat(value);  
         return true;  
        } catch (NumberFormatException e) {  
         return false;  
        }  
    } 
        
        
}
