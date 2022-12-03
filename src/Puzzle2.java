import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Puzzle2.txt"));
        int score = 0;

        // A,X : Rock , B,Y : Paper, C,Z : Scissor

        while(in.hasNext()){
            String s = in.nextLine();
            String[] x = s.split(" ");

            if(x[0].equals("A") && x[1].equals("X")){
                score += 4;
            }
            if(x[0].equals("A") && x[1].equals("Y")){
                score += 8;
            }
            if(x[0].equals("A") && x[1].equals("Z")){
                score += 3;
            }
            if(x[0].equals("B") && x[1].equals("X")){
                score += 1;
            }
            if(x[0].equals("B") && x[1].equals("Y")){
                score += 5;
            }
            if(x[0].equals("B") && x[1].equals("Z")){
                score += 9;
            }
            if(x[0].equals("C") && x[1].equals("X")){
                score += 7;
            }
            if(x[0].equals("C") && x[1].equals("Y")){
                score += 2;
            }
            if(x[0].equals("C") && x[1].equals("Z")){
                score += 6;
            }


        }
        System.out.println(score);
    }
}
