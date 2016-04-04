########################################################################################################################
########################################### created on : april 04 2016  ################################################
########################################### Author: AashishMahajan      ################################################
############################### Document: To implement the code and start the execution#################################
########################################################################################################################

1. Code worked and designed in Mac
2. Worked in IntelliJ, Please import the war file.
3. edit configuration : vm-option: -Xmx4096m -Xms2048m -XX:-UseGCOverheadLimit
4. Code begin when we run Welcome.java
5. Code ask for to choose for console   1. Consoleinput
                                        2. FileInput

NOTE: No tournament for less than 2 teams

   ConsoleInput :
########################################################################################################################
6. if Selected enter 1. then executes Console, Give input. A tournament would be generated and stored in file location
   as : /Users/Desktop/filenameOutput.txt
   If we have to change the name of OutputFile we change it in Algorithm.java in writeNow() for varriable file.
7. it would repeatedly ask for input until 0 entered for exit the process.
   if multiple input were given before giving 0, the tournament for every input gets appeneded in the output file.

########################################################################################################################

   FileInput :
########################################################################################################################
8. the current fileInput path is : /Users/Desktop/filename.txt , the example input the file has
   ex : 10 5 20 7 21        space seprated value

9. For all the inputs the file output would be created on /Users/Desktop/Output.txt. for all the tournament for
   space seprated value gets generated and gets appeneded in the file.


##############################################  README ENDS HERE  ######################################################
