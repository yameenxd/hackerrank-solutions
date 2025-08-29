/*Given an integer,n, print its first 10 multiples. Each multiple n x i (where 1<i<10)
 should be printed on a new line in the form: N x i = result.*/

 import java.util.*;
public class solution{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n+" x "+i+" = "+n*i); 
        }
    }
}