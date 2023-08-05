package JavaProgram.TUC_Arrays;

import java.util.Scanner;

/*
You are given a function -
int checkPassword(char[] ch, int n, min);
The function will accept a string and its length n and another argument which denotes minimum length of the password.
You are supposed to print valid, if the passwords meets criteria given below or invalid if the password doesn't meet the criteria
mention below -
1. At least min characters
2. At least one numeric digit
3. At least one Capital letter
4. Must not have + or ' ' space
5. Starting character must not be a number

*/
public class CheckPassword {
//    static boolean checkPassword(char [] ch, int n, int min){      [String is considered as a array ]

    static boolean checkPassword(String ch, int n, int min){
        //At least min character
        if(n<min)
            return false;
        //Starting letter must not be a number
      if(ch.charAt(0)-'0'>=0 && ch.charAt(0)-'0'<=9) return false;

//we take these variable for validate the condition at least one character and number is present in the password-
int a = 0,capital = 0, number = 0;

//While loop help us to iterate all elements present in String.
 while (a<n){
//Must not have + or ' ' space
    if(ch.charAt(a) == ' ' || ch.charAt(a) == '+') return false;

    // Capital letter
    if(ch.charAt(a)>=65 && ch.charAt(a)<=90) capital++;

    else if (ch.charAt(a)-'0'>=0 && ch.charAt(a)-'0'<=9) {
        number++;
    }
    a++;
}
       return capital>0 && number>0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       char [] st = {'J','h','3','2'};
        String st = sc.next();
        int len = st.length();
        int min = 5;
        if(checkPassword(st, len, min)){
            System.out.println("Valid");
        }
        else System.out.println("Invalid");
    }
}

   /* According to the javadoc a Scanner does not seem to be intended for reading single characters.
        You attach a Scanner to an InputStream (or something else) and it parses the input for you.
        It also can strip of unwanted characters. So you can read numbers, lines, etc. easily.
        When you need only the characters from your input, use a InputStreamReader for example.

        The reason is that the Scanner class is designed for reading in whitespace-separated tokens.
         It's a convenience class that wraps an underlying input stream.
          Before scanner all you could do was read in single bytes, and that's a big pain if you want to read words or lines.
           With Scanner you pass in System.in, and it does a number of read() operations to tokenize the input for you.
            Reading a single character is a more basic operation.
        */