/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextrecognizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lahiru
 */
public class FileReaderCSV {
  
    public String filePath;
    ArrayList<String[]> data = new ArrayList();
    
    public ArrayList<String[]> readCSV() 
    {
        if(!filePath.isEmpty())
        {
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";

            try {
                    br = new BufferedReader(new FileReader(filePath));
                    while ((line = br.readLine()) != null) 
                    {
                        String[] temp = line.split(cvsSplitBy);
                        data.add(temp);
                    }
                    return data;
                } 
            catch (Exception e) {return null;}
        }
        else return null;
    }
}


