#ifndef CONTACORRENTE_H
#define CONTACORRENTE_H

class ContaCorrente
{
	public:
		ContaCorrente(float fUmSaldoInicial);
		void sacar(float fUmValorDeSaque);
		void depositar(float fUmValorDeDeposito);
		void setValorLimite(float fUmValorLimite);
	private:
		float fSaldo;
		float fCreditoLimite;
};

#endif
