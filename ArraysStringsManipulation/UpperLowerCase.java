/*Given a Sentence  , for each word If the first letter in a
string is capital letter then change the full string to capital letters,
else change the full string to small letters.


sample test case:
input = Welcome tO Opentext
output= WELECOME to OPENTEXT
*/
import java.util.*;
class UpperLowerCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        if(Character.isLowerCase(arr[0])) str = str.toLowerCase();
        if(Character.isUpperCase(arr[0])) str = str.toUpperCase();
        System.out.print(str);
    }
}
