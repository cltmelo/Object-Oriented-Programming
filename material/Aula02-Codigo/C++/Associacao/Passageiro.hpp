#ifndef pass_file
#define pass_file

#include <math.h>
#include <string>
#include "Aviao.hpp"

using namespace std;

class Passageiro{
      private:
             string sNome;
             string sLocal;              
      public:            
            Passageiro(string sNome, string sLocal);
            string getsLocal();
            string getsNome();        
            void setsLocal(string sLocal);
            void setsNome(string sNome);
            
            /*Aqui Passageiro usa Aviao, mas n�o � composto de Aviao,
              portanto h� uma associa��o - indicado por uma flecha saindo de
              Aviao e chegando em Passageiro*/
            void Viaja(Aviao* umAviao);
            
            /*Aqui Passageiro usa math.h, mas n�o � composto de math.h,
              portanto h� uma associa��o - indicado por uma flecha saindo de
              math.h e chegando em Passageiro*/
            float CalculaQuadradoDeCabeca(int iNum);
};
#endif
