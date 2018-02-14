import java.util.*;
import java.lang.String;

//parseint and substring in java

public class Main {
    public static void main (String arg[]) {
        System.out.println("Enter a hexadecimal number: ");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        int inputLength = input.length();

        if ((input.substring(0, 2)).equals("0x")){     //skip Ox if it has it
            input = input.substring(2,inputLength);
            inputLength-=2;
        }
        else if ((input.substring(0, 2)).equals("0X")) {
            input = input.substring(2,inputLength);
            inputLength-=2;
        }
        input = input.toUpperCase(); //changes all to upper case
        //System.out.println(input); //checked to make sure it was skipping 0x and capitalizing

        long sum = 0; //start at zero
        for (int i = 0; i <= inputLength -1; i++){ //for loop to go through string array
            char c = input.charAt(i); //goes through every character/int in string
            long x =0;

            if (c== 'A'){
                x = 10;
            }
            else if (c== 'B'){
                x=11;
            }
            else if (c== 'C'){
                x=12;
            }
            else if (c== 'D'){
                x=13;
            }else if (c== 'E'){
                x=14;
            }else if (c== 'F'){
                x=15;
            }
            else {
                String cString = "" + c; //back to string
                x = Integer.parseInt(cString); 
            }
            //System.out.println(x);
            long exp=(long)Math.pow(16,(inputLength-i-1));
            //System.out.println(exp);
            x = (long )x * exp; //multiplies every int * 16^(corresponding exponent)
            sum = sum + x;
        }
            System.out.println("Your number is " + sum + " in decimal");
    }
}