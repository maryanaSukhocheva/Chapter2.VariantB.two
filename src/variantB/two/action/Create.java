
package variantB.two.action;
import java.util.Random;
//import kz.epam.matrix.model.Matrix;
/**
 *
 * @author user
 */
public class Create  {
    private int rowMatrix;
    private int columnMatrix;
   // private int arrayMatrx[][];
    private final int[][] arrayMatr;

    public Create(int row, int column ){
        arrayMatr = new int[row][column];
        rowMatrix = row;
        columnMatrix = column;
        createElements(row, column);
    }

    public int[][] getArray() {
        return arrayMatr;
    }

     // Zapolnenie

    private void createElements (int row, int column) {
      //  Random number = new Random();
        //int k=row*column;
        int n=1;
        for (int i = 0; i < rowMatrix; i++){   
            for (int j = 0; j < columnMatrix; j++){
                
                arrayMatr[i][j] = n++;
                
                        //number.nextInt(10);
            
        }
        }
    }

}
