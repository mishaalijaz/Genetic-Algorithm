package population;

import java.util.*;
/**
 * The class chromosome is a generic class where chromosomes are created for
 * the genetic algorithm. chromosomes are the working base of the
 * genetic algorithm.
 */
public class Chromosome<T> {
	
	
	private int numGenes;
	private List<T> mGenes= new ArrayList<T>(10);
	private int fitness=0;
       
	/**
         * The public constructor Chromosome accepts list and int num as it's 
         * parameter and sets the value of genes and num to numGenes and mGenes
         * respectively.
         * @param genes gene from the chromosome
         * @param num the number of genes
         */
	public Chromosome(List <T> genes,int num) {
		          numGenes =  num;
		          mGenes = genes;
		}
		
	/**
         * The getGenes method is a parameterized method of generic List and it returns the Genes
         * from the Chromosome class.
         * @return List of genes
         */
    public List<T> getGenes()
    {
    	return mGenes;
    }
    
    /**
     * The getNumeGenes method returns the numGenes from the Chromosome class
     * @return int numGenes
     */
    public int getNumGenes()
    {
    	return numGenes;
    }
          
    /**
     * The setFitness protected method accepts int value and sets the value of fitness to
     * value. Only Population can access and modify the fitness.
     * @param value the index value
     */
    protected void setFitness(int value)
    {
    	fitness=value;
    }
    
    /**
     * The getFitness method returns the fitness value from the Chromosome class.
     * @return int fitness
     */
    public int getFitness()
    {
    	return fitness;
    }
}
