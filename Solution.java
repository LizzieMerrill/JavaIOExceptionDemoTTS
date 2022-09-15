import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    while(!StdIn.isEmpty()) {
        try {
         int num1 = StdIn.readInt();
         int num2 = br.readInt();
         if (num1 != (int)num1 || num2 != (int)num2){
             throw new InputMismatchException();
         }
         else if (num2 == 0){
             throw new ArithmeticException();
         }
         else{
             System.out.println(num1 / num2);
         }
      } catch (IOException ioe) {
         System.out.println(ioe);
      }
      catch (InputMismatchException ime) {
         System.out.println(ime);
      }
      catch (ArithmeticException ae) {
         System.out.println(ae + ": / by zero");
      }
    }
}
