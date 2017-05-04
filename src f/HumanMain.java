import java.util.ArrayList;

public class HumanMain {
public static void main(String[] args) throws Exception{
	writer myWriter = new writer();
	
	
	
	
	//Creating Humans
	Human human1 = new Human("Gon", "Hunter", 14);
	Human human2 = new Human("Killua", "Asassin", 14);
	Human human3 = new Human("Natsu", "Wizard", 17);
	Human human4 = new Human("Ichigo", "Soul Reaper", 17);
	Human human5 = new Human("Dende", "Guardian", 15);
	
	//Adding Humans into an ArrayList
	ArrayList<Human> humans = new ArrayList<Human>();
	humans.add(human1);
	humans.add(human2);
	humans.add(human3);
	humans.add(human4);
	humans.add(human5);
	//Printing each human
	for(int i =0; i<humans.size(); i++){
		System.out.println(humans.get(i).getAll());
	}
	
	myWriter.writing(humans);
	myWriter.reading1();
	myWriter.saving("C:\\Users\\Administrator\\Desktop\\write.txt");
	}
}
