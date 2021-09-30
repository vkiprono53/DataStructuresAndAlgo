import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderJava {
    public static void main(String[] args) throws IOException {

       /* System.out.println("---Beginning to write to a file----");
        String fileName = "/home/vkiprono/Desktop/Files/output.txt";
        FileWriter reader = new FileWriter(fileName);
        reader.write("Laviki \n");
        reader.write("Noella \n");
        reader.write("Roberts \n");
        reader.close();
        System.out.println("::::::End of writing:::::::::::::");
        System.out.println();
        System.out.println("-----Beginning to read from a file------");*/

        try {
            String fileName = "/home/vkiprono/Desktop/Files/output.txt";
            FileReader fileReader = new FileReader(fileName);
            char[] a = new char[2048];
            fileReader.read(a);
            for (char c : a) {
                System.out.print(c);
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        System.out.print("::::::End of Reading the file::::::::::");

    }
}
