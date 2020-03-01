package ga;

/**
 * Implementation of Genetic Algorithms in Java
 * @see<a href="http://www.obitko.com/tutorials/genetic-algorithms/">Reference: Genetic Algorithms Introduction
 * @author Sandhya Sebastian
 * @author Mishaal Ijaz
 * @author Yeabsira Mintesnot Abegaz
*/

import crossover.CrossOver;
import factory.BinaryEncodingFactory;
import factory.OperatorFactory;
import mutation.Mutation;
import population.Chromosome;
import population.Population;
import replacement.Replacement;
import selection.Selection;

/**
 * This class GAAlgorithm is the starting point of the GAAlgorithm implementation.
 * It has the main method which will initiate the algorithm.
 */
public class GAAlgorithm {
	
	private Population mPopulation;	
	private Selection selection;
	private CrossOver crossover;
	private Mutation mutation;
	private Replacement replacement;
	GAAlgorithm(Population population )
	{
	     //System.out.println("Constructor : GAAlgorithm");
	     mPopulation = population;   
	}
	
	/** 
	 * Setter method to dynamically select the type of SELECTION method for choosing the top 2 fittest chromosomes for making them the parents
	 * @param s the dynamically selected method
	 * */
	public void setSelection(Selection s){
		selection = s;
	}
	
	/** 
	 * Setter method to dynamically select the type of CROSSOVER method 
	 * @param c the dynamically selected method
	 * */
	public void setCrossOver(CrossOver c) {
		crossover = c;
	}
	
	/** 
	 * Setter method to dynamically select the type of MUTATION method 
	 * @param m the dynamically selected method
	 * */
	public void setMutation(Mutation m) {
		mutation = m;
	}
	
	/** 
	 * Setter method to dynamically select the type of REPLACEMENT method 
	 * @param r the dynamically selected method
	 * */
	public void setReplacement(Replacement r) {
		replacement = r;
	}
	
	/** 
	 * Method to create a generation of population
	 * */
	public void evolve()
	{
		Chromosome<Integer> parent1,parent2,child;
		System.out.println("Evolve the population");
		
		mPopulation.createPopulation();
		mPopulation.print();
				
		Chromosome<Integer> chroms=mPopulation.getFittestChromosome();
		int fitness=chroms.getFitness();
		int numGenes=chroms.getNumGenes();
		
		
	    while(fitness < numGenes)
		{
			//System.out.println("Selection");
			System.out.println("Generation is : "+ mPopulation.getGeneration()+ " Fitness is : "+ fitness);
			do {
				
				/*Select parent 1*/
				parent1=selection.select(mPopulation);
				
				
				/*Select parent 2*/
				parent2=selection.select(mPopulation);
							
			}while(parent1==parent2); /*To avoid selecting same parent*/
			
			/*Perform Cross over*/
			//System.out.println("Cross Over");
			child=crossover.crossover(parent1,parent2);
			
			/*Perform Mutation*/
			child= mutation.mutation(child);
			
			/*Replace the child in the population*/			
			replacement.replace(mPopulation,child);
			
			/*Update the generation*/
			mPopulation.updateGeneration();
			
			/*Get the fittest and fitness of the fittest after this iteration*/
			chroms = mPopulation.getFittestChromosome();
			fitness=chroms.getFitness();
			mPopulation.print();
		}
	    
	    System.out.println("Final Population : ");
	    mPopulation.print();
		System.out.println("Solution reached in generation : " + mPopulation.getGeneration());
		System.out.println("Fitness : " + mPopulation.getFittestChromosome().getFitness());
		System.out.println("Genes : ");
		System.out.println(chroms.getGenes());
		
	}
	
	/**The Java main() method is the entry point into the application. It creates BinaryEncoding Factory object to create the operators.
	 @param args accepts only String arguments
	 */
	public static void main(String args[])
	{
		System.out.println("Initiating the GA algorithm");
		
		/**Initiate the initial population */
		GAAlgorithm ga = new GAAlgorithm(Population.getInstance());
		
		/**Create the operator factory and create the selection,crossover and mutation*/
		OperatorFactory o=new BinaryEncodingFactory();
		ga.setSelection(o.createSelection());
		ga.setCrossOver(o.createCrossOver());
		ga.setMutation(o.createMutation());
		ga.setReplacement(o.createReplacement());
		ga.evolve();

	}
}
