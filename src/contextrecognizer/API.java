/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextrecognizer;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lahiru
 */
public class API {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String path ="/home/lahiru/Desktop/doc1.csv";
        FileReaderCSV reader = new FileReaderCSV();
        ContextIdentifier con = new ContextIdentifier();
        
        reader.filePath = path;
        ArrayList<String[]> temp = reader.readCSV();
        con.Initialize(temp);
        //
    }
    
}
