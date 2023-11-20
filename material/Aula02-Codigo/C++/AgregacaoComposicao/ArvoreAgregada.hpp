#include <string>
#include "Raiz.hpp"
#include "Tronco.hpp"

using namespace std;

class ArvoreAgregada {
    private:
            string sSpecie;
            Tronco* tTronco;
            Raiz* rRaiz;

    public:
       ArvoreAgregada(string sSpecie, Tronco* tTronco, Raiz* rRaiz) {
        /*Aqui, o tronco e a ra�z da �rvore Agregada s�o passados como par�metros
          j� instanciados para uma dada inst�ncia de �rvore Agregada; se uma dada
          inst�ncia for deletada, o tronco e a ra�z podem ser atribu�dos a outra
          �rvore Agregada.*/
        this->sSpecie = sSpecie;
        this->tTronco = tTronco;
        this->rRaiz = rRaiz;
    };
};
