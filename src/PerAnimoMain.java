import java.io.BufferedReader;
import java.io.FileReader;
public class PerAnimoMain {
	
	
public static void main(String[] args) throws Exception
{	
String s = ObjectReader.reading();
ObjectReader.assigning(s);
ObjectReader.assigningPets("Elliott", "Cosmo");
ObjectReader.assigningPets("Elliott", "Bob");
ObjectReader.assigningPets("Gareth", "Bob");
ObjectReader.assigningPets("Gareth", "Sir Meowsalot");
//ObjectReader.assigningPets("Dev", );
ObjectReader.getByPerson("Elliott");
ObjectReader.getByPerson("Devdetta");
//ObjectReader.getBySpecies("Cat");
	
	
}
} 
