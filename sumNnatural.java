//PRINT THE SUM OF N NATURAL NUMBERS BY USING JAVA CODE 
import java.util.*;
public class solution{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("insert the n numbers to be added:"+n);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + i;
        }
        System.out.println("soultion of n natural numbers:"+sum);
    }
}