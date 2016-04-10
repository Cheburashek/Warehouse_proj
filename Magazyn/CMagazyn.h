/*
 * CMagazyn.h
 *
 *  Created on: 10 kwi 2016
 *      Author: Kuba
 */

#ifndef CMAGAZYN_H_
#define CMAGAZYN_H_
#include <vector>


class CMagazyn {
private:
	CMagazyn();
	int state;
	std::vector <int> products;
public:
	virtual ~CMagazyn();
	static CMagazyn* getInstance() {
		static CMagazyn* Instance = new CMagazyn();
		return Instance;
	}
	int getState();
	void setState(int s);
	int sellProduct(int p);
	void addProduct(int p);
};

#endif /* CMAGAZYN_H_ */
