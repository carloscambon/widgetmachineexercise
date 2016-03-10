/**********************************************************************
 * This source code is the property of Lloyds Banking Group PLC.
 *
 * All Rights Reserved.
 ***********************************************************************/
package com.lloydsbanking.interview;

public enum FuelType {
    PETROL, DIESEL, WOOD, COAL;
    
	/**
	 * @param fuelTypes array of Fuel types
	 * @return true if the enum is contained in the fuel types array
	 */
    public boolean isContainedIn (FuelType[] fuelTypes) {
    	for (FuelType fuelType : fuelTypes) {
			if (fuelType == this) {
				return true;
			}
		}
		return false;
    }
}
