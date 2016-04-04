/**
 * Created by aashish on 3/22/16.
 * get number of teams
 *  check if number of teams is power of 2 or not
 *  if power of 2 then would run for n-1 loop
 *  else would run for n loops
 */
package aashish.root.pack;

import java.io.*;
import java.util.*;

public class Algorithm {
    HashMap<Integer,LinkedList<Integer>> teamMatches = new LinkedHashMap<Integer,LinkedList<Integer>>();
    static int[] teamPlays;
    private int numberOfTeam;
    private String argumentFrom;

    public String getArgumentFrom() {
        return argumentFrom;
    }

    public void setArgumentFrom(String argumentFrom) {
        this.argumentFrom = argumentFrom;
    }

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public void setNumberOfTeam(int numberOfTeam)
    {
        this.numberOfTeam = numberOfTeam;
    }

    public void TournamentSequence() throws FileNotFoundException {
        teamPlays= new int[numberOfTeam];
        for (int i=1; i <=numberOfTeam;i++) {
            teamPlays[i-1]=i;
            teamMatches.put(i,null);
        }
        if(numberOfTeam % 2 == 0){
            evenMethod();
        }else{
            oddMethod();
        }
    }

    public void evenMethod() throws FileNotFoundException {
        String process="EvenTeam";
        for(int i =1 ; i <= numberOfTeam-1; i++) {
            for (int j = 1; j <= (numberOfTeam / 2); j++) {
                int teamA = teamPlays[j - 1];
                int teamB = teamPlays[numberOfTeam - 1 - j + 1];
                LinkedList<Integer> l = new LinkedList<>();
                l = teamMatches.get(teamA);
                if(l != null){
                    l.add(teamB);
                    teamMatches.put(teamA, l);
                }else{
                    LinkedList<Integer> nl = new LinkedList<>();
                    nl.add(teamB);
                    teamMatches.put(teamA, nl);
                }l= teamMatches.get(teamB);
                if(l != null){
                    l.add(teamA);
                    teamMatches.put(teamB, l);
                }else{
                    LinkedList<Integer> nl = new LinkedList<>();
                    nl.add(teamA);
                    teamMatches.put(teamB, nl);
                }
            }
            int position = teamPlays.length - 1;
            int tempPlayershift = teamPlays[position];
            System.arraycopy(teamPlays, 1, teamPlays, 2, teamPlays.length - 2);
            teamPlays[1] = tempPlayershift;
        }
        createString();
    }

    public void oddMethod() throws FileNotFoundException {
        String process = "OddTeam";
        for(int outer =1; outer <= numberOfTeam ; outer++){
            for (int inner =1; inner <= (numberOfTeam+1)/2;inner++ ){
                int teamA = teamPlays[inner - 1];
                int teamB = teamPlays[numberOfTeam - 1 - inner + 1];
                LinkedList<Integer> l = new LinkedList<>();
                l = teamMatches.get(teamA);
                if(teamA != teamB) {
                    if (l != null) {
                        l.add(teamB);
                        teamMatches.put(teamA, l);
                    } else {
                        LinkedList<Integer> nl = new LinkedList<>();
                        nl.add(teamB);
                        teamMatches.put(teamA, nl);
                    }
                    l = teamMatches.get(teamB);
                    if (l != null) {
                        l.add(teamA);
                        teamMatches.put(teamB, l);
                    } else {
                        LinkedList<Integer> nl = new LinkedList<>();
                        nl.add(teamA);
                        teamMatches.put(teamB, nl);
                    }
                }else{
                    if(l!=null){
                        l.add(-2);
                        teamMatches.put(teamA,l);
                    }else{
                        LinkedList<Integer> nl = new LinkedList<>();
                        nl.add(-2);
                        teamMatches.put(teamA,nl);
                    }
                }
            }
            int position = teamPlays.length - 1;
            int tempPlayershift = teamPlays[position];
            System.arraycopy(teamPlays, 1, teamPlays, 2, teamPlays.length - 2);
            teamPlays[1] = tempPlayershift;
        }
        createString();
    }

    public void createString() throws FileNotFoundException {
        String s = new String();
        String output = null;
        for (int i = 1; i <= numberOfTeam - 1; i++) {
            s = i + ":";
            for (int key : teamMatches.keySet()) {
                if (key < numberOfTeam) {
                    s += teamMatches.get(key).get(i - 1).toString() + ":";
                } else {
                    s += teamMatches.get(key).get(i - 1).toString() + "\n";
                }
            }
            s = s.replaceAll("-2", "-");
            output = writeNow(s);
        }
//        System.out.print(output);
        if (argumentFrom == "ConsoleInput") {
            ConsoleInput ci = new ConsoleInput();
        }else{
            FileInput fi= new FileInput();
        }
    }

    public String writeNow(String s) {
        try {

            File file = new File("/Users/aashish/Desktop/filenameOutput.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            out.write(s);
            out.close();

        } catch (IOException e) {
            System.out.print("The text file for tournament not generated. Process failed");
            e.printStackTrace();
        }
    return "The text file for tournament has been generated with name filename.txt";
    }
}
