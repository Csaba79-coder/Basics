import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class OneDimensionArrayHW_0507 {
    public static void main(String [] args){


        System.out.println("------------------------------");
        System.out.println("------------1st---------------");
        System.out.println("------------------------------\n");


        int[] ints = new int[2];
        float[] floats = new float[2];
        boolean[] booleans = new boolean[2];
        char[] chars = new char[2];
        String[] strings = new String[2];
        Integer[] integers = new Integer[2];

        System.out.println("First int prime value: " + ints[0] + " Last int value: " + ints[1]);
        System.out.println("First float value: " + floats[0] + " Last float value: " + floats[1]);
        System.out.println("First boolean value: " + booleans[0] + " Last boolean value: " + booleans[1]);
        System.out.println("First char value: " + chars[0] + " Last char value: " + chars[1]);
        System.out.println("First String value: " + strings[0] + " Last String value: " + strings[1]);
        System.out.println("First Integer object value: " + integers[0] + " Last Integer value: " + integers[1]);


        System.out.println("------------------------------");
        System.out.println("------------2nd---------------");
        System.out.println("------------------------------\n");

        ints[0] = 1;
        floats[0] = 1.0F;
        booleans[0] = true;
        chars[0] = 'd';
        strings[0] = "Csaba";
        integers[0] = 1;

        System.out.println("First int prime value: " + ints[0] + " Last int value: " + ints[1]);
        System.out.println("First float value: " + floats[0] + " Last float value: " + floats[1]);
        System.out.println("First boolean value: " + booleans[0] + " Last boolean value: " + booleans[1]);
        System.out.println("First char value: " + chars[0] + " Last char value: " + chars[1]);
        System.out.println("First String value: " + strings[0] + " Last String value: " + strings[1]);
        System.out.println("First Integer object value: " + integers[0] + " Last Integer value: " + integers[1]);


        System.out.println("------------------------------");
        System.out.println("------------3rd---------------");
        System.out.println("------------------------------\n");


        int i = 0;
        int min = 1;
        int max = 100;

        Random random = new Random();
        int[] randomNums = new int[5];
        for (i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt((max - min) + min);
            System.out.println(randomNums[i]);
        }


        System.out.println("-----------After increasing --------------");
        randomNums[0]++;

        for (i = 0; i < randomNums.length; i++) {
            System.out.println(randomNums[i]);
        }

//        int intRandom = random.nextInt();
//        System.out.println(intRandom);

        System.out.println("------------------------------");
        System.out.println("------------4th---------------");
        System.out.println("------------------------------\n");


        Scanner scan = new Scanner(System.in);
        Integer[] userInputs = new Integer[5];
        int j = 0;

        for (j = 0; j < userInputs.length; j++) {
            System.out.println("Please enter a number: ");
            userInputs[j] = scan.nextInt();
        }
        for (j = 0; j < userInputs.length; j++) {
            System.out.println(userInputs[j]);
        }

        System.out.println("Which number would you like to switch from 1-" + j + ": ");
        int numberToSwitch = scan.nextInt();
        System.out.println("What is your new number?");
        userInputs[numberToSwitch - 1] = scan.nextInt();

//        j = 0;
//        for (j = 0; j < userInputs.length; j++)
//        {
//            System.out.println("New array: ");
//            System.out.println(userInputs[j]);
//        }
//        System.out.println("Array in one line like in Python:");
        System.out.println(Arrays.toString(userInputs));
//        System.out.println("Array (also randomNums) in one line like in Python:");
//        System.out.println(Arrays.toString(randomNums));


        System.out.println("------------------------------");
        System.out.println("------------5th---------------");
        System.out.println("------------------------------\n");


        int randInt = random.nextInt(userInputs.length);
        System.out.println("The choosen number's index is: " + randInt);
        System.out.println("The choosen number the " + (randInt + 1) + " element of the array");
        System.out.println("The choosen number's value is: " + userInputs[randInt]);


        System.out.println("------------------------------");
        System.out.println("------------6th---------------");
        System.out.println("------------------------------\n");

        int sum = 0;
        int k = 0;
        for (k = 0; k < userInputs.length; k++) {
            sum += userInputs[k];
        }
        System.out.println("The sum of the array is: " + sum);


        System.out.println("------------------------------");
        System.out.println("-----------Extra--------------");
        System.out.println("------------------------------\n");


        System.out.println("Chess board (a little hardcoding)\n");

        // size 8 x 8
        // white - 0
        // black - X

        String brdStr = "";
        brdStr += "  A B C D E F G H\n";
        for (int row = 1; row < 9; row++) {
            brdStr += row + "";
            for (int col = 0; col < 8; col++) {
                brdStr += " .";
            }
            brdStr += "\n"; // line break
        }
        System.out.println(brdStr);


        System.out.println("\nChessboard with Pseudo code (or more hardcoding!) :)\n");
        System.out.println("Being result oriented :)");
        System.out.println("Find out how I built up the chessboard itself!\n");
        String chessBoardPseudo = "";

        chessBoardPseudo = "  A B C D E F G H\n";
        chessBoardPseudo += "1 W B W B W B W B\n";
        chessBoardPseudo += "2 B W B W B W B W\n";
        chessBoardPseudo += "3 W B W B W B W B\n";
        chessBoardPseudo += "4 B W B W B W B W\n";
        chessBoardPseudo += "5 W B W B W B W B\n";
        chessBoardPseudo += "6 B W B W B W B W\n";
        chessBoardPseudo += "7 W B W B W B W B\n";
        chessBoardPseudo += "8 B W B W B W B W\n";

        System.out.println(chessBoardPseudo);


        System.out.println("\nTo be continue ...");
        System.out.println("... in a new file");


        // Random
    }
}




