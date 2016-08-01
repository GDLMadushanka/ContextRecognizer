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
public class Column {
    public int ColumnId;
    public int NoOfDifferentValues;
    public boolean IsString;
    public boolean IsInteger;
    public boolean IsFloat;
    public boolean IsId; //unique
    public int DistributionOfData;
    public int ContextOfData;
}
