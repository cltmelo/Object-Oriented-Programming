
/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class SomaGenerica {

    public static void main(String[] args) {
        try {
            Somador<Integer> intSomador = new Somador<Integer>(8, 7);
            Integer somaDeInteiros = intSomador.somaGenerica();
            System.out.println("Soma de inteiros: " + somaDeInteiros);
            int iSomaTipadaInt = intSomador.somaTipadaInt();
            System.out.println("Soma de inteiros: " + iSomaTipadaInt);
            
            Somador<Double> doubleSomador = new Somador<Double>(5.98, 7.13);
            Double somaDeDoubles = doubleSomador.somaGenerica();
            System.out.println("Soma de doubles: " + somaDeDoubles);
            double iSomaTipadaDouble = doubleSomador.somaTipadaDouble();
            System.out.println("Soma de doubles: " + iSomaTipadaDouble);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
