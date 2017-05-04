import java.util.ArrayList;
import java.io.*;

public class writer {
	
public static void writing(ArrayList humans) throws Exception{
	String filename = "C:\\Users\\Administrator\\Desktop\\write.txt";
	FileWriter fileWriter = new FileWriter(filename);
	BufferedWriter writer = new BufferedWriter(fileWriter);
	String line = "";
/*while((line = humans.get(i).getAll())!=null){
		
	}*/
	
	for(int i = 0; i<humans.size(); i++){
		if((line = ((Human) humans.get(i)).getAll())!=null){
			writer.write(line+"\r\n"+"&"+"\r\n");
			
			
		}
	}
		//writer.write(HumanMain.humans.get(i).getAll());
		
		/*BufferedWriter bfwOut = new BufferedWriter(new FileWriter(outFile));
		String line = "";
		while ((line = bfrIn.readLine()) != null) {
			bfwOut.write(line + "\n");*/
			writer.close();
			fileWriter.close();	
}
public static void reading1() throws Exception{
	String filename = "C:\\Users\\Administrator\\Desktop\\write.txt";
	FileReader fileReader = new FileReader(filename);
	BufferedReader reader = new BufferedReader(fileReader);
	String text = "";
	String line = reader.readLine();
	while (line != null) {
		text = text + line;
		line = reader.readLine();
	}
	System.out.println(text);
}

public static void saving(String text){
	//storing bandhay in array list
	String[] bandhay = text.split("&");
	//storing bandhay attributes
	String[] bandhayAttributes = new String[6];
	for(int i=0; i<5; i++){
	bandhayAttributes = bandhay[i].split("-");
	}
	for(int i = 0; i<6; i++){
	System.out.println(bandhayAttributes[i]);
	}

}








}

	

