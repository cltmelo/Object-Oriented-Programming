#include <exception>
#include "ContaCorrente.h"
#include "exceptionDepositoNegativo.h"

ContaCorrente::ContaCorrente(float fUmSaldoInicial){
	fSaldo = fUmSaldoInicial;
	fCreditoLimite = 0;
}

void ContaCorrente::sacar(float fUmValorDeSaque){
	
}
void ContaCorrente::depositar(float fUmValorDeDeposito){
	if(fUmValorDeDeposito <= 0)
		throw exceptionDepositoNegativo();
}
void ContaCorrente::setValorLimite(float fUmValorLimite){
	
}
