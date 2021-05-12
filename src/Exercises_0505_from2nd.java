import java.util.Scanner;

public class Exercises_0505_from2nd {
    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("-------------2nd--------------");
        System.out.println("------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the first whole number: ");
        int a = sc.nextInt();
        System.out.println("Please give the second whole number: ");
        int b = sc.nextInt();

        // % without using modulo operator
        System.out.println(a - b * (a / b));


        System.out.println("------------------------------");
        System.out.println("-------------3rd--------------");
        System.out.println("------------------------------");

        System.out.print("Enter first number: ");
        float x = sc.nextFloat();
        System.out.print("Enter second number: ");
        float y = sc.nextFloat();
        System.out.print("Enter third number: ");
        float z = sc.nextFloat();
        double v = (x + y + z) / 3;
        System.out.println("Total= " + v);


        System.out.println("------------------------------");
        System.out.println("-------------4th--------------");
        System.out.println("------------------------------");

        System.out.print("Please enter user name: ");
        String userName = sc.next();
        // capitalize first letter
        System.out.println("Hello " + userName.substring(0, 1).toUpperCase() + userName.substring(1) + "!");


        System.out.println("------------------------------");
        System.out.println("-------------5th--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a number (first): ");
        float firstNum = sc.nextFloat();
        System.out.println("Please give a number (second): ");
        float secondNum = sc.nextFloat();
        System.out.println("Sum of the numbers (total): " + (firstNum + secondNum));
        System.out.println("Difference of the numbers: " + (firstNum - secondNum));
        System.out.println("Multiplication of the numbers: " + (firstNum * secondNum));
        System.out.println("Quotient of the numbers: " + (firstNum / secondNum));


        System.out.println("------------------------------");
        System.out.println("-------------6th--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a char (first char): ");
        String firstChar = sc.next();
        System.out.println("Please give a char (second char): ");
        String secondChar = sc.next();
        System.out.println("Char concatenate: " + firstChar + secondChar);


        System.out.println("------------------------------");
        System.out.println("-------------7th--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a number: ");
        float num = sc.nextFloat();
        System.out.println(num > 0 ? "true" : "false");


        System.out.println("------------------------------");
        System.out.println("-------------8th--------------");
        System.out.println("------------Math--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a number (first): ");
        float firstNumber = sc.nextFloat();
        System.out.println("Please give a number (second): ");
        float secondNumber = sc.nextFloat();
        System.out.println(firstNumber >= secondNumber ? firstNumber : secondNumber);


        System.out.println("------------------------------");
        System.out.println("-------------9th--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a number: ");
        float randomNumber = sc.nextFloat();
        System.out.println("Square number: " + (randomNumber * randomNumber));


        System.out.println("------------------------------");
        System.out.println("------------10th--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a number (base): ");
        double baseNum = sc.nextDouble();
        System.out.println("Please give a number (exponent): ");
        double exponentNum = sc.nextDouble();
        System.out.println(baseNum + " raising to the power of " + exponentNum +": " + Math.pow(baseNum, exponentNum));


        System.out.println("------------------------------");
        System.out.println("------------11th--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a number (finding square root): ");
        double squareRootNum = sc.nextDouble();
        System.out.println("The square root is: " + Math.sqrt(squareRootNum));


        System.out.println("------------------------------");
        System.out.println("------------12th--------------");
        System.out.println("------------------------------");

        int min = 0;
        int max = 9;

        //Generate random int value from 0 to 9
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);


        System.out.println("------------------------------");
        System.out.println("------------13th--------------");
        System.out.println("------------------------------");

        System.out.println("Please give a number (min): ");
        int minUserInput = sc.nextInt();
        System.out.println("Please give a number (max): ");
        int maxUserInput = sc.nextInt();

        //Generate random int value from user input (min and max)
        System.out.println("Random value in int from "+minUserInput+" to "+maxUserInput+ ":");
        int random_integer = (int)Math.floor(Math.random()*(maxUserInput-minUserInput+1)+minUserInput);
        System.out.println(random_integer);


        System.out.println("-------------------------------");
        System.out.println("-------------14th--------------");
        System.out.println("------------String-------------");
        System.out.println("-------------------------------");

        System.out.println("Please give a string to count the char numbers in it: ");
        String userInputChar = sc.nextLine();
        int length = userInputChar.length(); // length() method
        System.out.println("The length of the String \""+ userInputChar +"\" is: " +length);


        System.out.println("-------------------------------");
        System.out.println("-------------15th--------------");
        System.out.println("-------------------------------");

        int notARandomNum = 20;
        String s=String.valueOf(notARandomNum);
        System.out.println(s);

        // another way:
        int int1 = 30;
        String str1 = Integer.toString(int1);
        System.out.println(str1);


        System.out.println("-------------------------------");
        System.out.println("-------------16th--------------");
        System.out.println("-------------------------------");

        System.out.println("Please give me your surname:");
        String surName = sc.next();
        System.out.println("Üdvözöllek, kedves " + surName.substring(0, 1).toUpperCase() + surName.substring(1) +
               "! Jó, hogy újra itt vagy!");


        System.out.println("-------------------------------");
        System.out.println("-------------17th--------------");
        System.out.println("-------------------------------");

        System.out.println("First input (string): ");
        String firstStringUserInput = sc.next();
        System.out.println("Second input (string): ");
        String secondStringUserInput = sc.next();
        System.out.println("The two Strings are equal: " + firstStringUserInput.equals(secondStringUserInput));


        System.out.println("-------------------------------");
        System.out.println("-------------18th--------------");
        System.out.println("-------------------------------");

        System.out.println("Please give me a text for counting the words: ");
        String userTextInput = sc.nextLine();
        String res = userTextInput.contains(" ") ? "The text is more than one word!" : "The text is not more than one word!";
        System.out.println(res);

        // another solution ... depends on what I give as if statement!
        String resNew = userTextInput.contains("") ? "The text is not more than one word!" : "The text is more than one word!";
        System.out.println(resNew);

        System.out.println("-------------------------------");
        System.out.println("-------------19th--------------");
        System.out.println("-------------------------------");

        String text = "There is nothing either good or bad, but thinking makes it so";

        int n = text.length();
        char first = text.charAt(0);
        char last = text.charAt(n - 1);

        System.out.println("First char: " + first);
        System.out.println("Last char: " + last);
        System.out.println("From William Shakespeare, Hamlet, Act II");


        System.out.println("-------------------------------");
        System.out.println("-------------20th--------------");
        System.out.println("-------------------------------");

        String textModify = "There is nothing either good or bad, but thinking makes it so";

        int firstIndex = textModify.indexOf('t');
        System.out.println("Index of the letter first 't': "+ firstIndex);
        int lastIndex = textModify.lastIndexOf('t');
        System.out.println("Index of the letter first 't': "+ lastIndex);


        System.out.println("-------------------------------");
        System.out.println("-------------21th--------------");
        System.out.println("-------------------------------");

        String date = "2021.05.05";
        String newDate = date.replaceAll("\\.", "-");          //replaces a literal . with /*/

        System.out.println(newDate);


        System.out.println("-------------------------------");
        System.out.println("-------------22th--------------");
        System.out.println("-------------------------------");

        System.out.println("Please give a number for counting the digits:");

        int countCharInNum = sc.nextInt();
        int lengthOfNum= String.valueOf(countCharInNum).length();

        System.out.println("The number is " + lengthOfNum + " digit long!");


        System.out.println("-------------------------------");
        System.out.println("-------------23th--------------");
        System.out.println("-------------------------------");

        String textFirstTenChar = "In a hole in the ground there lived a hobbit";
        System.out.println("The first 10 char of the text: " + textFirstTenChar.substring(0,10));


        System.out.println("-------------------------------");
        System.out.println("-------------24th--------------");
        System.out.println("-------------------------------");

        String arr[] = textFirstTenChar.split(" ", 2);

        String firstWord = arr[0];   // In
        String theRest = arr[1];     // a hole in the ground there lived a hobbit

        System.out.println("The first word of the text is: " + firstWord);


        System.out.println("-------------------------------");
        System.out.println("------------Extra--------------");
        System.out.println("------------Bonus--------------");
        System.out.println("-------------------------------");

        long startDate = System.nanoTime();

    }
}