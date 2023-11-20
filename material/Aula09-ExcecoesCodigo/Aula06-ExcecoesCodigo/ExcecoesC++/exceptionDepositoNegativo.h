#ifndef EXCEPTIONDEPOSITONEGATIVO_H
#define EXCEPTIONDEPOSITONEGATIVO_H
#include <exception>

class exceptionDepositoNegativo : public std::exception{
	public:
		exceptionDepositoNegativo();
		const char* what();
};

#endif
