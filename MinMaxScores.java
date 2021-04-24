import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class MinMaxScores {

    public static void main(String[] args) throws IOException {
        
        //Reading from a web site.
        ArrayList<Integer> scores = new ArrayList<>();
        try {
            URL url = new URL("http://enformatik.cu.edu.tr/Java-2/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            while (input.hasNextInt()) {

                scores.add(input.nextInt());
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
           

        System.out.println("Scores = " + scores);
        System.out.println("Minimum Number is = " + Findmin(scores));
        System.out.println("Maximum Number is = " + Findmax(scores));
        
        //Creating and writing to a text file.
        PrintWriter output = new PrintWriter("MinMax.txt");
        output.println("Scores =" +(scores));
        output.println("Min Value:" + Findmin(scores));
        output.println("Max Value:" + Findmax(scores));
        output.close();

    }
         

    private static int Findmin(ArrayList<Integer> scores) {
        
             int min = scores.get(0);           
             for (int j = 0; j < scores.size(); j++ ) {
                 
             if (scores.get(j) < min) {
             min = scores.get(j);
                }
             }
            return min;
    }
    private static int Findmax(ArrayList<Integer> scores) {
             int max = scores.get(0);

             for (int j = 0; j < scores.size(); j++ ) {

             if (scores.get(j) > max) {
             max = scores.get(j);
                }
             }
            return max;
    }

}