/*1988write a program to print to read the year between 1900 to 1999 and print the year into words 
if any other year is given print INVALID 


input = 1980
output = ONE NINE EIGHT ZERO

input = 1900
output = ONE NINE ZERO ZERO 

input = 2003
output = INVALID 
*/

import java.util.*;
 class numToWords{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String inp = sc.next();
         int m = Integer.parseInt(inp);
         String[] words = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
         if(m<=1999 && m>=1900){
            char[] arr = inp.toCharArray();
             for(char c : arr){
                 int n = c - '0';
                 System.out.print(words[n]+" ");
             } 
         }
         else System.out.println("INVALID");
         
     }
 }