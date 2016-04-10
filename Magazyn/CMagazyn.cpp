/*
 * CMagazyn.cpp
 *
 *  Created on: 10 kwi 2016
 *      Author: Kuba
 */

#include "CMagazyn.h"

CMagazyn::CMagazyn() {
	state = 0;

}

CMagazyn::~CMagazyn() {
	// TODO Auto-generated destructor stub
}


int CMagazyn::getState() {
	return state;
}

void CMagazyn::setState(int s){state = s;}
int CMagazyn::sellProduct(int p){ return products[p];}
void CMagazyn::addProduct(int p){ products.push_back(p);}
