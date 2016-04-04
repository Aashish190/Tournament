package aashish.root.pack; /**
 * Created by aashish on 3/22/16.
 * project for the tournament problem of foundation of algorithm
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner.*;

public class Welcome {
    public static void main(String[] args) throws FileNotFoundException {
        FileInput fInput;
        ConsoleInput consoleInput;
        System.out.println("aashish.root.pack.Welcome to tournament");
        System.out.println(" please choose from the following."+
                  " \n " + " 1. Console Input."+
                  " \n " + " 2. Input File.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextByte();
        while(1==1){
            if(input ==1){
                consoleInput = new ConsoleInput();
                break;
            }else if(input ==2){
                fInput =new FileInput();
                break;
            }else{
                System.out.println("Wrong input. Please give a valid input");
                input =sc.nextByte();
            }
        }
        System.out.println("\nThanks");
    }
}
