import java.util.Scanner;

public class LabProgram {

   public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
     int count = 0;
     for (int i=0; i < listSize; ++i){
       if (word.list[i].equalsIgnoreCase(currword)){
         count ++;
       }
     }
     return count;
   }
  
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
     int numWords = scnr.nextInt();

     String [] wordsList = new String[numWords];
     for (i = 0; i < numWords; ++i){
       wordsList[i] = scnr.next();
     }
     for (i=0; i<numWords; ++i){
       int amount = getWordFrequency(wordsList, numWords, wordsList[i]);
       System.out.println(wordsList[i] + " " + frequency);
     }
   }
}
      
