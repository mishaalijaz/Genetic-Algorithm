package factory;

import crossover.*;
import mutation.*;
import replacement.*;
import selection.*;


/**Permutation Encoding factory concrete class - Extends OperatorFactory Abstract class - Every chromosome is a string of numbers, which represents number in a sequence
 * @see OperatorFactory
 */
public class PermutationEncodingFactory extends OperatorFactory{
	
	/**Permutation Encoding class constructor
	*/
	public PermutationEncodingFactory()
	{
		//System.out.println("Constructor:PermutationEncodingFactory");
	}

	/**Method to create the correct selection type based on the encoding */
	public  Selection createSelection()
	{
		//System.out.println("Create Selection");
		return new RankSelection();
	}
	
	/**Method to create the correct crossover type based on the encoding */
	public  CrossOver createCrossOver()
	{
		//System.out.println("Create CrossOver");
		return new TwoPointCrossOver();
	}
	
	/**Method to create the correct Mutation type based on the encoding */
	public Mutation createMutation()
	{
		//System.out.println("CreateMutation ");
		return new ChangeOrder();
	}
	
	/**Method to create the correct Replacement type based on the encoding */
	public Replacement createReplacement()
	{
		//System.out.println("CreateReplacement ");
		return new ReplacementRandom();
	}
	
}