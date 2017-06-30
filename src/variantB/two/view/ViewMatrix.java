package variantB.two.view;
import variantB.two.model.Matrix;
/**
 *
 * @author user
 */
public class ViewMatrix {

     /*
     * Статический метод, для отрисовки матрицы
     */

    public static String showMatrix(Matrix matr){
        String PrintM = "Matrix:\n"; 

        for (int i = 0; i < matr.getRows(); i++){
            for (int j = 0; j < matr.getColumns(); j++){
                  PrintM += String.valueOf(matr.getElement(i, j)) + " ";
            }
            PrintM += "\n";
        }
        return PrintM;   
    }
}
