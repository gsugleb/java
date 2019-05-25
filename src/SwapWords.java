import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SwapWords {
    public static void main(String[] args) {
        File myFile = new File("notes3.txt");
        try {
            String s = Files.readString(Paths.get("notes3.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));

            writer.write(" ");
            String newSentence;

            System.out.println(s);
            String[] sentences = s.split("(?<=[.!?])");


            for (String sentence : sentences) {
                newSentence = sentence.trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
                System.out.print(newSentence + " ");
                writer.write(newSentence+" ");
            }
 writer.write("");


writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error in file cleaning: " + e.getMessage());
        }
    }

}