#include <string>
#include "Raiz.hpp"
#include "Tronco.hpp"

using namespace std;

class ArvoreComposta {
    private:
            string sSpecie;
            Tronco* tTronco;
            Raiz* rRaiz;

    public:
       ArvoreComposta(string sSpecie) {
        /*Como o tronco e a raiz s�o responsabilidade exclusiva de cada instancia
         de �rvore Composta, eles n�o poderiam ser passados para outras instancias
         de �rvore Composta caso uma dada instancia fosse deletada - Composi��o*/
        this->sSpecie = sSpecie;
        this->tTronco = new Tronco();
        this->rRaiz = new Raiz();
       };
       ~ArvoreComposta(){
           delete tTronco;
           delete rRaiz;              
       };
};
