/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class MilhaPilhaGenerica {

    public static void main(String[] args) {
        try{
            MinhaPilha<Carro> mp = new MinhaPilha<Carro>(5);
            //MinhaPilha<Carro> mp = new MinhaPilha<Carro>(Carro.class, 5);
            mp.push(new Carro("Chevrolet","Celta",2000));
            mp.push(new Carro("Ford","EcoSport",2005));
            mp.push(new Carro("Volkswagen","Fusca",1980));
            mp.push(new Carro("Nissan","Kicks",2015));
            mp.push(new Carro("BMW","X1",2020));
            
            //Causa excecao de pilha cheia
            //mp.push(new Carro("Toyota","Corola",2022));
            while(!mp.estaVazia()){
                System.out.println(mp.pop());
            }
            //Causa excecao de pilha vazia
            System.out.println(mp.pop());
            System.out.println("Proxima linha");
        }catch(PilhaCheiaException e){
            System.out.println(e.getMessage());
            System.out.println("Tente aumentar a capacidade da pilha");
        }catch(PilhaVaziaException e){
            System.out.println(e.getMessage());
            System.out.println("Tente inserir alguma coisa na pilha");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Outro erro ocorreu, verifique seu codigo");
        }finally{
            System.out.println("-------------------");
            System.out.println("Programa encerrado.");
        }
    }
}
