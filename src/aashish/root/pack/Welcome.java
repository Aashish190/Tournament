package aashish.root.pack; /**
 * Created by aashish on 3/22/16.
 * project for the tournament problem of foundation of algorithm
 */
import java.util.Scanner;
import java.util.Scanner.*;

public class Welcome {
    public static void main(String[] args) {
        FileInput fInput;
        ConsoleInput consoleInput;
        System.out.println("aashish.root.pack.Welcome to tournament");
        System.out.println(" please choose from the following."+
                  " \n " + " 1. Console Input."+
                  " \n " + " 2. Input File.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextByte();
        System.out.println(input);
        if(input ==1){
            consoleInput = new ConsoleInput("PathPAssed");
        }else if(input ==2){
            fInput =new FileInput("PathPassed ");
        }else{
            System.out.print("Wrong input. thanks");
            input =sc.nextByte();
        }
    }
}
