package aashish.root.pack;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by aashish on 3/22/16.
 */
public class ConsoleInput {
    protected String Argument="ConsoleInput";
    public ConsoleInput() throws FileNotFoundException {
        System.out.println("Please Enter the number of team, enter 0 when want to exit.");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int in= Integer.parseInt(s);
        if(in==0){
            System.out.println("File Exit. thanks");
        }
        else if(in <2){
            System.out.println("Please enter a number more then 2");
            in = sc.nextByte();
        }else{
            Algorithm algorithm = new Algorithm();
            algorithm.setNumberOfTeam(in);
            algorithm.setArgumentFrom(Argument);
            algorithm.TournamentSequence();
        }
    }
}
