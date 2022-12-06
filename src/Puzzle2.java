import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Puzzle2.txt"));
        int score = 0;

        // A : Rock , B : Paper, C : Scissor
        // X : Lose , Y : Draw , Z : Win
        // 1 for Rock, 2 for Paper, and 3 for Scissors
        // 0 if you lost, 3 if the round was a draw, and 6 if you won

        while(in.hasNext()){
            String s = in.nextLine();
            String[] x = s.split(" ");

            if(x[0].equals("A") && x[1].equals("X")){
                score += 3;
            }
            if(x[0].equals("A") && x[1].equals("Y")){
                score += 4;
            }
            if(x[0].equals("A") && x[1].equals("Z")){
                score += 8;
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
                score += 2;
            }
            if(x[0].equals("C") && x[1].equals("Y")){
                score += 6;
            }
            if(x[0].equals("C") && x[1].equals("Z")){
                score += 7;
            }


        }
        System.out.println(score);
    }
}
