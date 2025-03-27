import java.io.*; 

public class PracticeProblem {

	public static String readFile(String filename) {
    try {    
		StringBuilder fileContent = new StringBuilder();
        FileReader fr = new FileReader(filename);
        int character;
        while ((character = fr.read()) != -1) {
            fileContent.append((char) character);
        }
        fr.close();
        return fileContent.toString();
	}
	catch (IOException e) {
System.out.println(e);
return "oops";
	}
    }

    public static String backwardsReadFile(String filename) {
		try { 
		StringBuilder fileContent = new StringBuilder();
        FileReader fr = new FileReader(filename);
        int character;
        while ((character = fr.read()) != -1) {
            fileContent.insert(0, (char) character);  
        }
        fr.close();
        return fileContent.toString();
    } catch (IOException e) {
		System.out.println(e);
		return "oops";
		}
}

}
