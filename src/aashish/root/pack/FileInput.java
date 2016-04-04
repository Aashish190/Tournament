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
    protected  String Argument= "FileInput ";
    List<Integer> input= new ArrayList<>();

    public FileInput() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/aashish/Desktop/filename.txt"));
        while (scanner.hasNextInt()) {
            input.add(Integer.parseInt(scanner.next()));
        }
        if(counter < input.size()){
            if (input.get(counter)  <1 ) {
                counter++;
                if(counter<input.size()){
                    FileInput fi= new FileInput();
                }else{
                    System.exit(1);
                }

            } else {
                Algorithm algorithm = new Algorithm();
                algorithm.setNumberOfTeam(input.get(counter));
                counter++;
                algorithm.setArgumentFrom(Argument);
                algorithm.TournamentSequence();

            }
        }else{
            System.out.println("File created no more enteries in the input file. thanks");
            System.exit(1);

        }
//

    }
}

