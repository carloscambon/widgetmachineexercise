/**********************************************************************
* This source code is the property of Lloyds Banking Group PLC.
*
* All Rights Reserved.
***********************************************************************/
package com.lloydsbanking.interview;

/**
 * This class emulates the behaviour of a Steam Engine.
 * 
 * @see Engine
 * 
 * @author Carlos Cambon
 * @version 1.0
 * @since 10/03/2016
 */
public class SteamEngine extends Engine {
	private static final float WOOD_BATCH_COST = 4.35f;
	private static final float COAL_BATCH_COST = 5.65f;
	private static short BATCH_SIZE = 2;
	private static FuelType[] allowedFuels = { FuelType.WOOD, FuelType.COAL };

	/**
	 * Constructs a steam engine 
	 */
	public SteamEngine(FuelType requiredFuelType) {
		super(requiredFuelType, allowedFuels, BATCH_SIZE);
	}

	/**
	 * {@inheritDoc}
	 */
	public float getBatchCost() {
		if (fuelType == FuelType.COAL) {
			return COAL_BATCH_COST;
		} else if (fuelType == FuelType.WOOD) {
			return WOOD_BATCH_COST;
		} else {
			throw new IllegalStateException("Engine is not filled with required fuel.");
		}
	}

}
