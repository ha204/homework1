
public class Animal {
	
	//Attributes
public String name;
public String species;
public String all;

//Constructors
public Animal(String name, String species){
	this.name = name;
	this.species = species;
}

//Methods
	
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSpecies() {
	return species;
}

public void setSpecies(String species) {
	this.species = species;
}

public String getAll() {
	all = this.name+" - "+this.species;
	return this.all;
}




}
