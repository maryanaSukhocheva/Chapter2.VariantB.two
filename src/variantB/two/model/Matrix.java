package variantB.two.model;

import variantB.two.action.Create;
/*
 * Sozdanie matricy
 */
public class Matrix {
    private int arrayMatrix[][];    
    private int rowMatrix;      
    private int columnMatrix;  
    
    /*
     * Constructor
     */
    public Matrix(int row, int column){
        arrayMatrix = new int[row][column];
       arrayMatrix = new int[row][column]; 
       rowMatrix = row;      
        columnMatrix = column;
        
        Create arr  = new Create(row,column);
        arrayMatrix=arr.getArray();

    }
 
    // ----------------------------------------
  

   
   public int getRows() {
        return rowMatrix;
    }
/*   public void setRows(int row) {
       this.rowMatrix = row;    }*/

   // ----------------------------------------
  public void setMatrix(int[][] mat){
        arrayMatrix = mat;
    };

   public int getColumns() {
      return columnMatrix;
   }
/*
 public void setColumns(int col) {
       this.columnMatrix = col;    }*/

   // ----------------------------------------
  public int getElement(int row, int column) {
      return arrayMatrix[row][column];
   }

   // ----------------------------------------
    public  void setElement(int row, int column, int value) {
      arrayMatrix[row][column] = value;
   }
/*
   // ---------------------------------------
   double[] row(int index) {
      return massiv[index];
   }

   // ----------------------------------------
   double[] column(int index) {
      double[] temp = new double[this.n];
      for (int i = 0; i < index; i++)
         massiv[i][index] = temp[i];
      return temp;
   }
}
*/

   
}
