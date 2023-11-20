#include "exceptionDepositoNegativo.h"

exceptionDepositoNegativo::exceptionDepositoNegativo():std::exception(){

} 
const char* exceptionDepositoNegativo::what(){
	return "Erro: valor negativo para deposito!";
} 
