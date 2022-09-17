import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scnr = new Scanner(System.in);
        try{
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        try{
        System.out.println(num1/num2);
        }
        catch (ArithmeticException ae) {
        System.out.println(ae);
        }
        }
        catch (InputMismatchException ime) {
        System.out.println("java.util.InputMismatchException");
        }
        }//end of main
}//end of class
