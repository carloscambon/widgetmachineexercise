/**********************************************************************
 * This source code is the property of Lloyds Banking Group PLC.
 *
 * All Rights Reserved.
 ***********************************************************************/
package com.lloydsbanking.interview;

/**
 * This class emulates the behaviour of a Widget Machine for the production of widgets
 * using an engine.
 * 
 * @author Carlos Cambon
 * @version 1.0
 * @since 10/03/2016
 */
public class WidgetMachine {
    private Engine engine;
    
    /**
     * Constructs the Widget Machine with a specific engine
     * @param engine
     */
    public WidgetMachine (Engine engine) {
    	this.engine = engine;
    }

    /**
     * Produces the desired quantity of widgets and returns the cost for that
     * @param quantity
     * @return cost of the production of widgets required
     */
    public float produceWidgets(int quantity) {
        engine.start();
        float cost = 0;

        if (engine.isRunning()) {
            cost = produce(quantity);
        }

        engine.stop();

        return cost;
    }

    // Returns the cost of producing the quantity of widgets passed in
    private float produce(int quantity) {
    	
        int batchCount = (int) Math.ceil((float)quantity / engine.getBatchSize());
        return (batchCount * engine.getBatchCost());
        
    }

}
