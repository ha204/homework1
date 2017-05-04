import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ObjectReader {
	public static ArrayList<Animal> pets = new ArrayList<Animal>();
	public static ArrayList<Persons> people = new ArrayList<Persons>();

	public static String reading() throws Exception {
		FileReader file = new FileReader("C:\\Users\\Administrator\\Desktop\\ExData.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while (line != null) {
			text = text + "," + line;
			line = reader.readLine();
		}
		text = text.replace("﻿", "");
		text = text.replace("£", "");
		return text;
	}

	public static void assigning(String text) {
		// Storing Persons and Animals
		String[] both = text.split("&");
		// Storing persons
		String[] Persons = both[0].split("%");
		// Storing animals
		String[] Animal = both[1].split("%");
		// Storing each person's attributes
		String[] personsAttributes1 = Persons[0].split(",");
		String[] personsAttributes2 = Persons[1].split(",");
		String[] personsAttributes3 = Persons[2].split(",");
		// Storing each animals attributes
		String[] animalAttributes1 = Animal[0].split(",");
		String[] animalAttributes2 = Animal[1].split(",");
		String[] animalAttributes3 = Animal[2].split(",");
		String[] animalAttributes4 = Animal[3].split(",");
		String[] animalAttributes5 = Animal[4].split(",");

		// Adding person's attributes to people ArrayList
		people.add(new Persons(personsAttributes1[1], personsAttributes1[2], personsAttributes1[3],
				Integer.parseInt(personsAttributes1[4])));
		people.add(new Persons(personsAttributes2[1], personsAttributes2[2], personsAttributes2[3],
				Integer.parseInt(personsAttributes2[4])));
		people.add(new Persons(personsAttributes3[1], personsAttributes3[2], personsAttributes3[3],
				Integer.parseInt(personsAttributes3[4])));
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).getAll());
		}

		// Adding person's attributes to people ArrayList
		pets.add(new Animal(animalAttributes1[1], animalAttributes1[2]));
		pets.add(new Animal(animalAttributes2[1], animalAttributes2[2]));
		pets.add(new Animal(animalAttributes3[1], animalAttributes3[2]));
		pets.add(new Animal(animalAttributes4[1], animalAttributes4[2]));
		pets.add(new Animal(animalAttributes5[1], animalAttributes5[2]));
		for (int i = 0; i < people.size(); i++) {
			System.out.println(pets.get(i).getAll());
		}

	}

	public static void getByPerson(String personName) {
		for (Persons person : people) {
			if (person.getName().equals(personName)) {
				System.out.println(person.getAll());
			}
		}
	}

	public static void assigningPets(String name, String petName) {
		for (Persons person : people) {
		
			if (person.getName().equals(name)) 
				for (Animal animal : pets) {
					
					if (animal.getName().equals(petName)) {
						person.setPets(animal);
						System.out.println(name+ " has a "+animal.getSpecies());
					}
				}
			}
		}
	//Given a species, return the occupations that the owner(s) have.
/*	public static void getBySpecies(String species){
		for(Animal animal:pets){
			if(animal.getSpecies().equals(species)){
			for(int i = 0; i<pets.size(); i++ ){
				System.out.println(people.get(i).getOccupation());
			}
			}
		}
	}*/

	}


