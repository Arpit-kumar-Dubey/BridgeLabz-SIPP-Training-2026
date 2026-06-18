package practicesProgram;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public void readFile() throws IOException {

        FileReader fileReader = new FileReader("data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }

    public static void main(String[] args) {

        FileReaderExample obj = new FileReaderExample();

        try {
            obj.readFile();
        }
        catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}