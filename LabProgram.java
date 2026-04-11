import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
     if (n == 0){
       return 0;
     }else if (n < 0){
       return -1;
   }else if (n == 1){
       return 1;
   }

     int currentvar;
     int nextvar = 1;
     int pastvar = 0;
     for (int i=2; i <= n; ++i){
       currentvar = nextvar + pastvar;
       pastvar = nextvar;
       nextvar = currentvar;
     }
     return currentvar;
   }
         
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
