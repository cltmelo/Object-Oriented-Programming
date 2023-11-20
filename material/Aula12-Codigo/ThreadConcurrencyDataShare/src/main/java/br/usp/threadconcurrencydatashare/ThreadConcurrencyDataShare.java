package br.usp.threadconcurrencydatashare;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class ThreadConcurrencyDataShare {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////        
        /*Exemplo de threads que compartilham o mesmo dado*/
        
        /*Primeiro a contagem pura e simples, sem threads*/
        
        Counter cSemConcorrencia = new Counter();
        cSemConcorrencia.fazerContagem();
        cSemConcorrencia.fazerContagem();
        System.out.println("Variável i sem concorrencia: " + cSemConcorrencia.getContador());

        /*Agora, usam-se threads para evocar a contagem que passa a ser feita de 
         modo concorrente*/
        Counter c = new Counter();
        CounterThread ct1 = new CounterThread(c);
        CounterThread ct2 = new CounterThread(c);
        ct1.start();
        ct2.start();
        try {
            //Faz com que a thread main fique parada aqui, 
            //até que a thread ct1 - já em execução após start - termine
            //Do contrário, a thread main termina, encerra as threads antes que elas terminem
            ct1.join();
            //Idem
            ct2.join();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Variável i com concorrencia: " + c.getContador() + ", mas o valor esperado era " + cSemConcorrencia.getContador());
        
    }
}
