/*
 * Magazyn.cpp
 *
 *  Created on: 10 kwi 2016
 *      Author: Kuba
 */

#include <iostream>
#include "CMagazyn.h"

using namespace std;

int main() {
	CMagazyn* g = CMagazyn::getInstance();
	for (int i = 0; i < 30; i++) {
		g->addProduct(i);
	}
	for (int i = 0; i < 30; i++) {
		cout<<g->sellProduct(i);
	}
	return 0;
}

