package factory;

import crossover.CrossOver;
import crossover.TreeCrossOver;
import mutation.ChangeNode;
import mutation.Mutation;
import replacement.Replacement;
import replacement.ReplacementRandom;
import selection.RWSelection;
import selection.Selection;

/**Tree Encoding factory concrete class - Extends OperatorFactory Abstract class - every chromosome is a tree of some objects, such as functions or commands in programming language
 * @see OperatorFactory
 */

public class TreeEncodingFactory extends OperatorFactory{
	
	/**TreeEncoding class constructor
	*/
	public TreeEncodingFactory()
	{
		System.out.println("Constructor:TreeEncodingFactory");
	}

	/**Method to create the correct selection type based on the encoding */
	public Selection createSelection()
	{
		System.out.println("Create Selection");
	     return new RWSelection();
	}
	
	/**Method to create the correct crossover type based on the encoding */
	public  CrossOver createCrossOver()
	{
		System.out.println("Create CrossOver");
		return new TreeCrossOver();
	}
	
	/**Method to create the correct Mutation type based on the encoding */
	public Mutation createMutation()
	{
		System.out.println("CreateMutation");
		return new ChangeNode();
	}
	
	/**Method to create the correct Replacement type based on the encoding */
	public Replacement createReplacement()
	{
		System.out.println("CreateReplacement ");
		return new ReplacementRandom();
	}
	
}