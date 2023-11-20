package bridge;

/**
 *
 * @author Junio
 */
public class Main {

    public static void main(String[] args) {
        /*Circle, CircleFunction*/
        Circle cMeuCirculo = new Circle(10);
        cMeuCirculo.CalculeAlgumaCoisaAMeuRespeito(new CircleFunctionArea());
        
        System.out.println(
            cMeuCirculo.CalculeAlgumaCoisaAMeuRespeito(new CirclePerimeter())
        );
        
        
        Circle cMeuCirculo2 = new Circle(20);
        
        System.out.println(
        cMeuCirculo2.CalculeAlgumaCoisaAMeuRespeito(new CircleFunctionArea())
            );
        System.out.println(
            cMeuCirculo2.CalculeAlgumaCoisaAMeuRespeito(new CirclePerimeter())
        );        
    }
}
