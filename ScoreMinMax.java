import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class ScoreMinMax {

    public static void main(String[] args) throws IOException {
        
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
        System.out.println("Minimum Number is = " + FindMinNum(scores));
        System.out.println("Maximum Number is = " + FindMaxNum(scores));
        
        //Creating and writing to a text file.
        PrintWriter output = new PrintWriter("MinMax.txt");
        output.println("Scores =" +(scores));
        output.println("Min Value:" + FindMinNum(scores));
        output.println("Max Value:" + FindMaxNum(scores));
        output.close();

    }
         

    private static int FindMinNum(ArrayList<Integer> scores) {
        
             int min_num = scores.get(0);           
             for (int j = 0; j < scores.size(); j++ ) {
                 
             if (scores.get(j) < min_num) {
             min_num = scores.get(j);
                }
             }
            return min_num;
    }
    private static int FindMaxNum(ArrayList<Integer> scores) {
             int max_num = scores.get(0);

             for (int j = 0; j < scores.size(); j++ ) {

             if (scores.get(j) > max_num) {
             max_num = scores.get(j);
                }
             }
            return max_num;
    }

}