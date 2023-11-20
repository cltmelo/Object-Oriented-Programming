package br.usp.scc0604.main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.usp.scc0604.Animal;
import br.usp.scc0604.Terrestres.Mamifero;
import br.usp.scc0604.Aquaticos.Peixe;

/**
 *
 * @author Junio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Animal("Cachorro");     
        System.out.println(a1.getsNome());
        
        Mamifero t1 = new Mamifero("Macaco", 4);
        System.out.println(t1.getsNome());
        
        Peixe aq1 = new Peixe("Dourado",3);
        System.out.println(aq1.getsNome());

        System.out.println("-----------------------");
        Animal[] animais = new Animal[3];
        animais[0] = a1;
        animais[1] = t1;
        animais[2] = aq1;
        for(int i = 0; i < 3; i++)
            System.out.println(animais[i].getsNome());
        
        /*dynamic biding*/
        
        //animais[2].getMinsDeFolego();
        
        /*
        
        Animal a3 = new Mamifero("Cavalo",4);
        System.out.println(a3.getsNome());
               
        Mamifero t2 = (Mamifero)a3;  
        System.out.println(t2.getiNrPatas());
        
        Peixe aq1 = new Peixe("Dourado",3);
        System.out.println("Folego do " + aq1.getsNome() + " é de " + aq1.getMinsDeFolego() + " minutos");
        
        Cachorro c1 = new Cachorro("Lesse",4,"Labrador");
        System.out.println(c1.getsRaca());

        */
        
        
        /*Animal meuAnimal = new Animal("Michelangelo");
        Mamifero umTerrestre = new Mamifero("Donatelo",4);
       
        
        
        
        
        
        
        Cachorro umCao = new Cachorro("Dog",4);
        System.out.println(umCao.getsNome() + " - " + umCao.getiNrPatas());

        Lambari umPeixe = new Lambari("Nemo",10);
        System.out.println(umPeixe.getsNome() + " - " + umPeixe.getMinsDeFolego());
       */
    }

}
