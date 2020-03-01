
package replacement;

import population.Chromosome;
import population.Population;

/**
 * This Abstract class is responsible for replacing the offspring with one chromosome in the population.
 * This is an abstract class which is inherited by ReplacementLeastFittest and ReplacementRandom classes.
 * 
 */
public abstract class Replacement   {
       
	public Replacement() {
		//System.out.println("Constructor:Replacement");
	}
        /**
        * Abstract method which will be overridden by the extending subclass.
        * @param population the population in which the rank selection will be performed on.
        * @param child child to replace a chromosome from the population 
        */
    public abstract void replace(Population population,Chromosome child) ;
}
