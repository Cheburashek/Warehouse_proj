/*
 * Observer.h
 *
 *  Created on: 10 kwi 2016
 *      Author: Kuba
 */

#ifndef OBSERVER_H_
#define OBSERVER_H_
#include "CMagazyn.h"

class Observer {
protected:
	CMagazyn* magazyn;
public:
	Observer();
	virtual ~Observer();
	virtual void update();
};

#endif /* OBSERVER_H_ */
