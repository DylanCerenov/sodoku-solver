import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Sodoku Solver");
        /*
        - Every square has to contain a single number
        - Only the numbers from 1 through to 9 can be used
        - Each 3×3 box can only contain each number from 1 to 9 once
        - Each vertical column can only contain each number from 1 to 9 once
        - Each horizontal row can only contain each number from 1 to 9 once
         */

        System.out.println("Solve Easy:");
        Sodoku s = new Sodoku(new File("src/inputEasySodoku.txt"));
        System.out.println(s.toString(s.solveRandomBruteForce()));

        System.out.println("Solve Straightforward Puzzle:");
        Sodoku so = new Sodoku(new File("src/input.txt"));
        System.out.println(so.toString(so.solve()));

        System.out.println("Solve Finished Sodoku");
        Sodoku ex = new Sodoku(new File("src/inputExampleSolution.txt"));
        System.out.println(ex.toString(ex.solveRandomBruteForce()));

        System.out.println("Solve Hard Sodoku:");
        Sodoku ha = new Sodoku(new File("src/inputHard.txt"));
        System.out.println(ha.toString(ha.solve()));
    }
}
