package Model;

import Exceptions.AnimalsVisitsException;

public interface AnimalsVisits {
	//interface
	public void visitcount(Person p) throws AnimalsVisitsException ; //throws AnimalsVisitsException;
	public boolean hasVistedAnimal(Person p);

}
