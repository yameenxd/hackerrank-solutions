/*In this challenge, you must read an integer, a double, and a String from stdin, 
then print the values according to the instructions in the Output Format section below.*/

import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        System.out.println("String: " +c);
        System.out.println("Double: " +b);
        System.out.println("Int: " +a);
        scan.close();
    }
}
/*WHY DO WE USE TWO TIMES sacn.nextLine() After nextInt() and nextDouble(),
 you press Enter. The number(s) are read correctly.
BUT the newline character (\n) from pressing Enter is still sitting in the 
input buffer.
When you call nextLine(), it reads that leftover newline instead of waiting for actual text.
Result → c becomes an empty string.
TO FIX THE PROBLEM :
To handle this, you use scan.nextLine() twice:
First scan.nextLine(); → consumes the leftover newline.
Second String c = scan.nextLine(); → actually reads the next line of user input.*/
