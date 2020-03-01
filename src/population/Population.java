package population;

import java.util.*;

/**
 * This is a singleton class which defines the population in which the GAAlgorithm is implemented.
 * There only can be one instance the population class.
 * This class represents a group of individuals or chromosomes which will be evolved using the operations
 * selection,crossover and mutation.
 */
public class Population {
	
	private static Population mInstance = null;	
	private int popSize = 10;
	private int numGenes = 10;
	private int generation = 0;
	private List<Chromosome<Integer>> chroms=new ArrayList<Chromosome<Integer>>(popSize);
	private Chromosome<Integer> chFittest;
	private int fittestIndex=0,leastfittestIndex=0;
	private int totalFitness =0;
	
	
	private Population()
	{
		//System.out.println("Constructor : Population");
		
	}
	
	/**	 getInstance will instantiate the object of Population class if not 
         * created already or return the single instance created this is 
         * an Implementation of a singleton class
         * @return mInstance the instance of population
         */
	public static Population getInstance() {
		if (mInstance == null) {
			mInstance = new Population();
		}
		return mInstance;
	}
        /**
         * calculateFitness calculates the fitness of the individual.
         * @param ch chromosome passed to calculate fitness
         */
	public void calculateFitness(Chromosome<Integer> ch) {
		int fitness=0;
		List<Integer> genes =ch.getGenes();
		Iterator<Integer> i= genes.iterator();
		while (i.hasNext()) {
			fitness=fitness+i.next().intValue();
		}
		ch.setFitness(fitness);
	}
        /**
         * createPopulation creates the initial population which
         * Selection operation will be done upon.
         */
	public void createPopulation()
	{
		Random randomNumber = new Random();  
		for(int i=0;i<popSize;i++) {
			
			/*Create the list of genes*/
			List<Integer> list = new ArrayList<Integer>(numGenes);
			Integer num;
			for(int j=0;j<numGenes;j++) {
				num=randomNumber.nextInt(2);
				list.add(num);
			}
			Chromosome<Integer> ch=new Chromosome<Integer>(list,numGenes);
			calculateFitness(ch);
			totalFitness += ch.getFitness();  
			chroms.add(ch);
		}
		/*To find the fittest choromosome and update it in 'chFittest' variable*/
		getFittestChromosome();
		
	}

	/**
	 * Getter method to get the chromosomes
	 * @return chromosome list
     */
	public List<Chromosome<Integer>> getChromosomes() {
		return chroms;
	}
	/**
         * Getter method to get the totalfitness.
         * @return int 
         */
	public int getTotalFitness() {
		return totalFitness;
	}
	
	/**Getter method to get the population size
	 * @return size of the population*/
	public int getPopulationSize() {
		return popSize;
	}
	/**
         * Method to return the index of the fittest chromosome.
         * @return fittest chromosome
         */
	public Chromosome<Integer> getFittestChromosome()
	{
		int maxfit=Integer.MIN_VALUE;
		ListIterator<Chromosome<Integer>> iterator = chroms.listIterator();
		Chromosome<Integer> temp;
		int tempIndex;
		while (iterator.hasNext()) {
			tempIndex = iterator.nextIndex();
			temp = iterator.next();
			if(maxfit < temp.getFitness()){
				maxfit = temp.getFitness();
				leastfittestIndex =tempIndex;
				chFittest = temp;
			}
		}
		return chFittest;
	}
        /**
         * getter method to return the fittest index.
         * @return int 
         */
	public int getFittest()
	{
		return fittestIndex;
		
	}
	/**
         * Method to return the index of the least fittest chromosome
         * @return int
         */
	public int getLeastFittest()
	{
		int minfit=Integer.MAX_VALUE;
		ListIterator<Chromosome<Integer>> iterator = chroms.listIterator();
		Chromosome<Integer> temp;
		int tempIndex;
		while (iterator.hasNext()) {	//reusing existing libraries - Collections (Iterators) and their operations
			tempIndex = iterator.nextIndex(); 
			temp = iterator.next();
			if(minfit > temp.getFitness()){
				minfit = temp.getFitness();
				leastfittestIndex =tempIndex;	
			}
		}
		
		return leastfittestIndex;
	}
        /**
         * Method to update the Generation count.
         */
	public void updateGeneration()
	{
		generation++;
	}
        /**
         * Getter method to get the generation count
         * @return int 
         */
	public int getGeneration() {
		return generation;
	}
        /**
         * Method to print the chromosomes in the population.
         */
	public void print() {
		Iterator<Chromosome<Integer>> iterator = chroms.iterator();
		Chromosome<Integer> chrom;
		List<Integer> genes;
		Iterator<Integer> i;
		while (iterator.hasNext()) {
			chrom = iterator.next();
			genes=chrom.getGenes();
			i=genes.iterator();
			while(i.hasNext()) {
				System.out.print((i.next()).intValue());
			}
	    		
			System.out.println("");
		}
		
	}
}
