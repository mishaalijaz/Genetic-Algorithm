package factory;

import crossover.*;
import mutation.*;
import replacement.*;
import selection.*;

/**Binary encoding factory concrete class - Extends OperatorFactory Abstract class - Every chromosome is a string of bits, 0 or 1.
 * @see OperatorFactory
 * */
public class BinaryEncodingFactory extends OperatorFactory{
	
	/**Binary Encoding class constructor
	*/
	public BinaryEncodingFactory()
	{
		//System.out.println("Constructor:BinaryEncodingFactory");
	}

	/**Method to create the correct concrete selection class based on the respective encoding
	 * @return object of concrete Selection class */
	public  Selection createSelection()
	{
		//System.out.println("create selection");
		return new RWSelection();
	}
	
	/**Method to create the correct concrete crossOver method based on the respective encoding
	 * @return object of concrete crossOver class */
	public  CrossOver createCrossOver()
	{
		//System.out.println("create crossover");
		return new SinglePointCrossOver();
	}
	
	/**Method to choose the correct Mutation method based on the respective encoding 
	 * @return object of concrete Mutation class*/
	public Mutation createMutation()
	{
		//System.out.println("create mutation");
		return new BitInversion();
	}
	
	/**Method to choose the correct Replacement method based on the respective encoding
	 * @return object of concrete Replacement class */
	public Replacement createReplacement()
	{
		//System.out.println("CreateReplacement ");
		return new ReplacementLeastFittest();
		//return new ReplacementRandom();
	}
	
}