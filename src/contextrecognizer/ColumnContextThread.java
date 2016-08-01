/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextrecognizer;

/**
 *
 * @author lahiru
 */
public class ColumnContextThread implements Runnable{
Column col;
String[] DataToProcess;

public ColumnContextThread(Column col,String[] data){this.col = col;this.DataToProcess=data;}
    
    @Override
    public void run() {
        System.out.println("Hello from the other side "+DataToProcess[0]);
    }
    
}
