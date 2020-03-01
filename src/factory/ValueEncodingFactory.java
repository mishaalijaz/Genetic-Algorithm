package factory;

import crossover.*;
import mutation.*;
import replacement.*;
import selection.*;

/**Value Encoding factory concrete class - Extends OperatorFactory Abstract class - every chromosome is a string of some values. Values can be anything connected to problem, form numbers, real numbers or chars to some complicated objects.
 * @see OperatorFactory
 */
public class ValueEncodingFactory extends OperatorFactory{
	
	/**Value Encoding class constructor
	*/
	public ValueEncodingFactory()
	{
		//System.out.println("Constructor:ValueEncodingFactory");
	}

	/**Method to create the selection type based on the encoding
	 * @return a specific type of selection method based on the encoding*/
	public  Selection createSelection()
	{
		//System.out.println("Create CrossOver");
		return new StudystateSelection();
	}
	
	public  CrossOver createCrossOver()
	{
		//System.out.println("Create CrossOver");
		return new SinglePointCrossOver();
	}
	public Mutation createMutation()
	{
		//System.out.println("CreateMutation");
		return new AddOrSubtract();
	}
	public Replacement createReplacement()
	{
		//System.out.println("CreateReplacement ");
		return new ReplacementLeastFittest();
	}
	
}