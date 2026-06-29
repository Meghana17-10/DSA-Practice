/*write a program to read a sentence and find the sum of digits in each string if String contains 't' or 'T'.
if no digits are found print 0

for example:
input =
Tw1nkl3 to1 add4
output =
Tw1nkl3(4)
to1(1)
add4(0)

input =
add me
output =
add(0)
me(0)
*/

import java.util.*;
class sumOfDigitsHavingT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        for(int i=0;i<s.length;i++){
            boolean containsT = false;
            int sum =0;
            for(char c : s[i].toCharArray()){ 
                if(c == 't' || c=='T') containsT = true;
                if(Character.isDigit(c)) sum+=c - '0';
    
            }
            if(containsT) System.out.println(s[i]+"("+ sum +")");
            else System.out.println(s[i]+"(0)");
        }
        
        
    }
    
}