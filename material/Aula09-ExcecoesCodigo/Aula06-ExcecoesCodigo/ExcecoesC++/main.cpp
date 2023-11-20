#include <iostream>
#include "ContaCorrente.h"
#include "exceptionDepositoNegativo.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	ContaCorrente *c = new ContaCorrente(1000);
	try{
		
		c->depositar(-10);
		
	}catch(...){
		
		std::cout << "Nao sei o que houve";
		
	}
	return 0;
}
