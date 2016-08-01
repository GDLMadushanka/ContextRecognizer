/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextrecognizer;

import java.util.ArrayList;

/**
 *
 * @author lahiru
 */
public class ContextIdentifier{
    public ArrayList<String[]> data;
    int ThreadCount=0; // equals to num columns
    int NumRows =0;
    private Table tbl = new Table();
   
    
    public void Initialize(ArrayList<String[]> data)
    {
        this.data = data;
        ThreadCount = data.get(0).length;
        NumRows = data.size();
        tbl.Data = new Column[ThreadCount];
        for (int i = 0; i < ThreadCount; i++) {
            tbl.Data[i] = new Column();
            ColumnContextThread thread = new ColumnContextThread(tbl.Data[i],data.get(i));
            thread.run();
        }
    }
}
