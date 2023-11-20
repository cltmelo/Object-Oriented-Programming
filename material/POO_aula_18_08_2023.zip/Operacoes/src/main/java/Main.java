/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 5832884
 */
public class Main {
    public static void main(String[] args){
        //Operacao o = new Operacao(4.4f,7.2f);
        //o.operar();
        //System.out.println("--------------------------");
        
        Adicao a = new Adicao(5.3f, 6.3f, "junio");
        a.setOperador1(6);
        a.setOperador2(4);
        System.out.println("Resultado da adicao: "+a.operar());
        a.descrevaAAdicao();
        System.out.println("--------------------------");        
        Subtracao s = new Subtracao(5.3f, 6.3f);
        s.setOperador1(6);
        s.setOperador2(4);
        System.out.println("Resultado da Subtracao: "+s.operar());
        s.oQueEASubtracao();
        System.out.println("--------------------------");            
        System.out.println("--------------------------");        
        Produto p = new Produto(5.3f, 6.3f);
        p.setOperador1(6);
        p.setOperador2(4);
        System.out.println("Resultado da Produto: "+p.operar());
        System.out.println("--------------------------");          
        System.out.println("--------------------------");  
        p.porqueUsarOProduto();
        Coeficiente c = new Coeficiente(5.3f, 6.3f);
        c.setOperador1(6);
        c.setOperador2(4);
        System.out.println("Resultado da Coeficiente: "+c.operar());
        c.comoUsarOCoeficiente();
        System.out.println("--------------------------");            
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("--------------------------");        
        Operacao[] os = new Operacao[4];
        os[0] = a;
        os[1] = s;
        os[2] = p;
        os[3] = c;
        for(int i = 0; i < os.length; i++)
            System.out.println(os[i].operar());
        
    }
}
