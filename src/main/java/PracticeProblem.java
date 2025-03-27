import java.io.*; 

public class PracticeProblem {

	public static String readFile(String filename) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        FileReader fr = new FileReader(filename);
        int character;
        while ((character = fr.read()) != -1) {
            fileContent.append((char) character);
        }
        fr.close();
        return fileContent.toString();
    }

    public static String backwardsReadFile(String filename) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        FileReader fr = new FileReader(filename);
        int character;
        while ((character = fr.read()) != -1) {
            fileContent.insert(0, (char) character);  
        }
        fr.close();
        return fileContent.toString();
    }

}
