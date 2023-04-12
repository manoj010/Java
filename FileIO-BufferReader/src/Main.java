import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write("This is a test.\n");
        fileWriter.write("This is a test.\n");
        fileWriter.write("This is a test.\n");
        fileWriter.write("This is a test.\n");
        fileWriter.write("This is a test.\n");
        fileWriter.close();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = bufferedReader.readLine();
            while (string != null) {
                System.out.println(string);
                string = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}