#ifndef aviao_file
#define aviao_file

#include <string>

using namespace std;

class Aviao{
      private:
             int iCodigo;
             string sDestino;              
      public:            
            Aviao(int iCodigo);
            string Voa();            
            void setsDestino(string sDestino);
            /*No c�digo C++ n�o temos Aviao usando Passageiro como no exemplo
              Java, isso pois C++ n�o permite (diretamente) refer�ncias cruzadas
              (cross include). No caso, n�o � poss�vel que Aviao inclua Passageiro
              e Passageiro inclua Aviao; aqui temos apenas Passageiro incluindo Aviao*/
};
#endif
