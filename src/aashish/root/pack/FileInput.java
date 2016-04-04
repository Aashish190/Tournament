package aashish.root.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aashish on 3/22/16.
 */

public class FileInput {
    static int counter =0;
    protected  String Argument= "FileInput";

    public FileInput() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/aashish/Desktop/filename.txt"));
        List<Integer> input= new ArrayList<>();

        while (scanner.hasNextInt()) {
            input.add(Integer.parseInt(scanner.next()));
//            System.out.print(input.toString());
        }
        if(counter < input.size()){
            if (input.get(counter) < 2) {
                counter++;
                System.out.println("Team number less than 2, moving to next input");
                input.add(Integer.parseInt(scanner.nextLine()));

            } else {

                Algorithm algorithm = new Algorithm();
                algorithm.setNumberOfTeam(input.get(counter));
                counter++;
                algorithm.setArgumentFrom(Argument);
                algorithm.TournamentSequence();

            }
        }else{
            System.out.println("File created no more enteries in the input file. thanks");
            System.exit(0);

        }
//        System.out.print();
    }
}
