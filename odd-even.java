// check whether the given solution is even or an odd number 

import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n % 2!= 0){        // logic behind the number is odd , logic for even is (n % 2 == 0)
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}