package factory;

import crossover.CrossOver;
import mutation.Mutation;
import replacement.Replacement;
import selection.Selection;

/**Abstract class OperatorFactory. This is the super class of the concrete operator factory classes BinaryEncodingFactory,PermutationEncodingFactory,
 * ValueEncodingFactory and TreeEncodingFactory*/
public abstract class OperatorFactory {
	
	/**OperatorFactory class constructor
	*/
	public OperatorFactory()
	{
		//System.out.println("Constructor:OperatorFactory");
	}
	
	/**Abstract Method to create the correct Selection type based on the encoding */
	public abstract Selection createSelection();
	
	/**Abstract Method to create the correct CrossOver type based on the encoding */
	public abstract CrossOver createCrossOver();
	
	/**Abstract Method to create the correct Mutation type based on the encoding */
	public abstract Mutation createMutation();
	
	/**Abstract Method to create the correct Replacement type based on the encoding */
	public abstract Replacement createReplacement();
	
}