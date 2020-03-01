package selection;
/**Method to do selection from the population*/
import population.Chromosome;
import population.Population;

/**Abstract class Selection. This has the methods for common selection methods.Subclasses implement the same. */
 public abstract class Selection {
	
	public Selection()
	{
		//System.out.println("Constructor:Selection");
	}
       
	/**
         * Abstract method to be overridden by a concrete class.
         * @param population the population in which different type of selection will be performed on.
         * @return Chromosome 
         */
	public abstract Chromosome select(Population population);
	
	
}
