import java.util.ArrayList;

public class Persons {
	
//Attributes
public String name;
public String DOB;
public  String occupation;
public int salary;
ArrayList<Animal>pets1 = new ArrayList<Animal>();
public String all;

//Constructors
public Persons(String name, String DOB, String occupation, int salary) 
{
	this.name = name;
	this.DOB = DOB;
	this.occupation = occupation;
	this.salary = salary;
	

	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDOB() {
	return DOB;
}

public void setDOB(String dOB) {
	DOB = dOB;
}

public  String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getPets() {
	String petString = "";
	for(int i = 0; i<pets1.size(); i++){
		petString+=pets1.get(i).getSpecies();
		if(i != pets1.size()-1){
			petString+= " , ";	
		}
		else{
			petString+= ".";
		}

		
	}
	return petString;
	}
	

public void setPets(Animal pets) {
	pets1.add(new Animal(pets.getName(),pets.getSpecies()));
}

public String getAll() {
	all = this.name+" - "+this.DOB+" - "+this.occupation+" - £"+this.salary + " - "+getPets();
	return all;
}
	

//Methods




}
