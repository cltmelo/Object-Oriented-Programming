/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class UsosSobreescrita {
    public static void main(String[] args) {
        Aeronave[] aes = new Aeronave[3];
        aes[0] = new AviaoDePassageiros();
        aes[1] = new AviaoDePassageirosDeLuxo();
        aes[2] = new AviaoDePassageirosSupersonico();
        for(Aeronave a : aes)
            a.voa();
    }
}
