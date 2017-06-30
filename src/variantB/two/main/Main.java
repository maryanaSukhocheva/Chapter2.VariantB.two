package variantB.two.main;
import variantB.two.view.ViewMatrix;
import variantB.two.model.Matrix;

public class Main {
    
    public static void main(String[] args) {
     
        Matrix matr=new Matrix(2,2);
        System.out.println(ViewMatrix.showMatrix(matr));
      
    }
}
