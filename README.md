# GeneticAlgorithm
A Java implementation of Genetic Algorithms applying Object Oriented principles.

##How to run the GAAlgorithm:
The GAAlgorithm is implemented using the Eclipse IDE. The Class GAAlgorithm has the 'main'method. To run right click on the file GAAlgorithm.java and select Run As -> Java Application.

##Implementation Details:
The algorithm is implemented using Binary Encoding. In this implementation the Chromosome class has a list of binary values 0's and 1's using random number generator. Each chromosome has genes, each holding a binary value. The solution will be achieved when all the values in the chormosome are 1's. There are 10 initial Chromosomes each with 10 genes holding a binary value 0 or 1 (1-bit each). So, the chromosome is 10-bit long. The fitness of individual chromosome is calculated by counting the number of genes with a value of 1's in the chromosome. The chromosome with the most number of 1’s is deemed the fittest. 

We have implemented GA with Binary Encoding as a proof of concept for the solution as per the assignment requirements, but it can be extended for other types of encodings as well. We have provided the framework, only concrete implementations need to be added for each of the encodings.

The solution will be reached when a child with all 1’s in the genes is found. 

###Singleton Pattern:
The class Population is defined as a singleton class since the evolution happens in this specific population through generations.

###Strategy Pattern Implementation:
Strategy pattern is used in this implementation to create correct operators corresponding to each encoding of the chromosome.
 
###Selection:
The algorithm uses the selection method Roulette Wheel Selection to select the parent chromosomes from the population.The implementation uses strategy pattern to implement the selection. This is  implemented in the package 'selection' in GAAlgorithm. There is abstract class Selection which declares the abstract method select. The concrete classes RWSelection,RankSelection and StudyStateSelection can implement the select() method.GAAlgorithm creates the object of Selection based on the programming requirement.In this implementation RWSelection is used.

###CrossOver:
The algorithm uses the cross over method Single Point Cross Over to perform cross over of the parent chromosomes.The implementation uses strategy pattern to implement the CrossOver.This is implemented in the package 'crossover' in GAAlgorithm. The abstract class CrossOver declares the abstract method corssover().The concrete classes SinglePointCrossOver,TwoPointCrossOver and TreeCrossOver implements the crossover() method. GAAlgorithm creates the object of CrossOver based on the programming requirement.In this implementation SinglePointCrossOver is used.

###Mutation:
The algorithm uses the mutation method Bit Inversion to perform mutation of the child chromosomes.The implementation uses strategy pattern to implement the Mutation.This is  implemented in the package 'mutation' in GAAlgorithm. The abstract class Mutation declares the abstract method mutation().The concrete classes BitInversion,ChangeOrder,ChangeNode and AddOrSubtract implements the mutation() method. GAAlgorithm creates the object of Mutation based on the programming requirement.In this implementation BitInversion is used since binary encoding is used.
 
###Abstract factory implementation:
This is implements in package 'factory' in GAAlgorithm. The abstract factory pattern is used by the GAAlgorithm to create the approproate Selection, CrossOver,Mutation and Replacement objects based on the chromosome type. The abstract factory class OperatorFactory defines abstract methods createSelection(), createCrossOver(),createMutation() and createReplacement() to create different operator objects. The concrete factory class for binary encoding BinaryEncodingFactory implements the abstract methods to create RWSelection,SinglePointCrossOver,BitInversion and ReplaceLeastFittest. Similarly the concrete factory class for permutation encoding PermutationEncodingFactory implements  the abstract methods to create RankSelection,TwoPointCrossOver,ChangeOrder and ReplacementRandom. Similar way TreeEncodingFactory and ValueEncodingFactory create suitable operators corresponding to Tree encoding and Value Encoding of chromosomes.

##References:
https://www.obitko.com/tutorials/genetic-algorithms/
https://www.23andme.com/en-eu/gen101/genes/
https://towardsdatascience.com/introduction-to-genetic-algorithms-including-example-code-e396e98d8bf3
https://docs.oracle.com/javase/tutorial/collections/index.html
https://docs.oracle.com/javase/tutorial/java/generics/index.html
