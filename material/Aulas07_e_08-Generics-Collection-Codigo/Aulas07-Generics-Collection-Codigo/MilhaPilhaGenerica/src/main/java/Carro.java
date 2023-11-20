/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class Carro {
    private String sFabricante;
    private String sModelo;
    private int iAno;

    public Carro(String sFabricante, String sModelo, int iAno) {
        this.sFabricante = sFabricante;
        this.sModelo = sModelo;
        this.iAno = iAno;
    }
    public String toString(){
        return "Carro " + sFabricante + ", modelo " + sModelo + " ano " + iAno;
    }
}
