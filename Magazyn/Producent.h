/*
 * Producent.h
 *
 *  Created on: 10 kwi 2016
 *      Author: Kuba
 */

#ifndef PRODUCENT_H_
#define PRODUCENT_H_

#include "Observer.h"

class Producent: public Observer {
public:
	Producent();
	virtual ~Producent();
};

#endif /* PRODUCENT_H_ */
