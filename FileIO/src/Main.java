import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("Note2.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write("Hello World!\n");
        fileWriter.write("Hello World Again!");

        fileWriter.close();

        //filereader
        FileReader fileReader = new FileReader(file);
//        while(file != null) {
//            System.out.print((char)fileReader.read());
//        }

//        int character = fileReader.read();
//        while(character != -1) {
//            System.out.println((char)character);
//            character = fileReader.read();
//        }

        int newChar;
        while ((newChar = fileReader.read()) != -1) {
            System.out.print((char)newChar);
        }

        fileReader.close();

        //file.delete();
    }
}