package br.usp.threadconcurrencydatashare;

/**
 *
 * @author Jose F Rodrigues-Jr
 */

class Counter {

    private int iContador = 0;

    public int getContador() {
        return iContador;
    }

    /*count como um método sincronizado é suficiente para que a concorrência seja resolvida*/
    //synchronized public void fazerContagem() {     //sem problemas de concorrencia
    public void fazerContagem() {                  //com problemas de concorrencia
        /*A contagem ocorre em dois passos: 1) iContador+1; 2) iContador =
         Se a alternância entre as threads ocorrer após a operação 1, e antes da 2
         o valor que será escrito quando a thread retornar, irá sobrescrever o
         valor de i; a sobreescrita ocorre com valores menores do que o valor de i
         deveria ter (pois a segunda thread fez contagem), fazendo com que o total
         de duas contagens fique menor do que deveria*/
        for (int j = 0; j < 5000000; j++) { /*Aqui o valor máximo da contagem varia de processador para processador, quanto mais rápido, maior deve ser o número*/
            int iContadorLinha = iContador + 1;
            iContador = iContadorLinha;
        }
    }
    /*ATENCAO: o keywork synchronized não é usado na thread em si,
      mas nas classes (objetos) que serão compartilhados entre as threads*/
    
    
    synchronized public void decrementa() {  
                for (int j = 0; j < 5000000; j++) { /*Aqui o valor máximo da contagem varia de processador para processador, quanto mais rápido, maior deve ser o número*/
            int iContadorLinha = iContador - 1;
            iContador = iContadorLinha;
        }
    } 
}

