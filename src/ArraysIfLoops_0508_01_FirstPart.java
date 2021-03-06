import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ArraysIfLoops_0508_01_FirstPart {

    public static void main(String[] args) {


        byte[] bytes = {10, 33, -2, 0, 56, -42, 99, -73, 60};
        char[] chars = {'A', '*', 'c', 'd', 'E', ' '};
        int[] ints = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
        double[] doubles = {3.14, -765.99, 52.4986, -10.3333337, 834.0965};
        String[] strings = {"alma", "málna", "barack", "szilva"};


        System.out.println("------------------------------");
        System.out.println("------------1st---------------");
        System.out.println("------------------------------\n");


        int[] lengthOfArrays = new int[5];

        lengthOfArrays[0] = bytes.length;
        lengthOfArrays[1] = chars.length;
        lengthOfArrays[2] = ints.length;
        lengthOfArrays[3] = doubles.length;
        lengthOfArrays[4] = strings.length;

        int maximum = lengthOfArrays[0];
        int indexLongest = 0;

        for (int i = 0; i < lengthOfArrays.length; i++) {
            if (maximum < lengthOfArrays[i]) {
                maximum = lengthOfArrays[i];
                indexLongest = i;
            }
        }

        if (indexLongest == 0) {
            System.out.println("It is a byte data type!");
        } else if (indexLongest == 1) {
            System.out.println("It is a char data type!");
        } else if (indexLongest == 2) {
            System.out.println("It is an int data type!");
        } else if (indexLongest == 3) {
            System.out.println("It is a double type!");
        } else if (indexLongest == 4) {
            System.out.println("It is a String data type!");
        } else {
            System.out.println("Index out of range!");

        }

        System.out.println("The number of the longest array is: " + (indexLongest + 1));

//        It is an int data type!


        System.out.println("------------------------------");
        System.out.println("------------2nd---------------");
        System.out.println("------------------------------\n");


        int sumBytes = 0;

        for (byte num : bytes) {
            sumBytes = sumBytes + num;
        }
        System.out.println("The sum of the bytes: " + sumBytes);


        String sumCharsToString = "";

        for (char aChar : chars) {
            sumCharsToString = sumCharsToString + aChar;
        }
        System.out.println("The sum of the chars: " + sumCharsToString + " after chars concatenate");


        int sumInts = 0;

        for (int num : ints) {
            sumInts = sumInts + num;
        }
        System.out.println("The sum of the ints: " + sumInts);


        double sumDoubles = 0;

        for (double num : doubles) {
            sumDoubles = sumDoubles + num;
        }
        System.out.println("The sum of the doubles: " + sumDoubles);


        String sumStrings = "";

        for (String string : strings) {
            sumStrings = sumStrings + string;
        }
        System.out.println("The sum of the chars: " + sumStrings + " after chars concatenate");


//        The sum of the bytes: 141
//        The sum of the chars: A*cdE  after chars concatenate
//        The sum of the ints: 8610918
//        The sum of the doubles: 113.41176629999995
//        The sum of the chars: almamálnabarackszilva after chars concatenate


        System.out.println("------------------------------");
        System.out.println("------------3rd---------------");
        System.out.println("------------------------------\n");


        byte firstNumBytes = bytes[0];
        byte lastNumBytes = bytes[bytes.length - 1];
        System.out.println("The first num of the bytes array is: " + firstNumBytes);
        System.out.println("The last num of the bytes array is: " + lastNumBytes);


        char firstCharChars = chars[0];
        char lastCharChars = chars[chars.length - 1];
        System.out.println("The first char of the chars array is: " + firstCharChars);
        System.out.println("The last char of the chars array is: " + lastCharChars);


        int firstNumInts = ints[0];
        int lastNumInts = ints[ints.length - 1];
        System.out.println("The first num of the ints array is: " + firstNumInts);
        System.out.println("The last num of the ints array is: " + lastNumInts);


        double firstNumDoubles = doubles[0];
        double lastNumDoubles = doubles[doubles.length - 1];
        System.out.println("The first num of the doubles array is: " + firstNumDoubles);
        System.out.println("The last num of the doubles array is: " + lastNumDoubles);


        String firstStringStrings = strings[0];
        String lastStringStrings = strings[strings.length - 1];
        System.out.println("The first string of the strings array is: " + firstStringStrings);
        System.out.println("The last string of the strings array is: " + lastStringStrings);


//        The first num of the bytes array is 10
//        The last num of the bytes array is 60
//        The first char of the chars array is A
//        The last char of the chars array is (space!!!)
//        The first num of the ints array is 27
//        The last num of the ints array is 876
//        The first num of the doubles array is: 3.14
//        The last num of the doubles array is: 834.0965
//        The first string of the strings array is: alma
//        The last string of the strings array is: szilva


        System.out.println("------------------------------");
        System.out.println("------------4th---------------");
        System.out.println("------------------------------\n");


        int negCounter = 0;

        for (byte aByte : bytes) {
            if (aByte < 0) {
                negCounter++;
            }
        }
        System.out.println("There is/are " + negCounter + " piece(s) of negative number in the bytes' array!");

        negCounter = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                negCounter++;
            }
        }
        System.out.println("There is/are " + negCounter + " piece(s) of negative number in the ints' array!");

        negCounter = 0;

        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] < 0) {
                negCounter++;
            }
        }
        System.out.println("There is/are " + negCounter + " piece(s) of negative number in the doubles' array!");

//        There is/are 3 piece(s) of negative number in the bytes' array!
//        There is/are 3 piece(s) of negative number in the ints' array!
//        There is/are 2 piece(s) of negative number in the doubles' array!


        System.out.println("------------------------------");
        System.out.println("------------5th---------------");
        System.out.println("------------------------------\n");

        // https://data-flair.training/blogs/java-character-class/


        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                counter++;
                // System.out.println(chars[i]);
            }
        }
        System.out.println("There is/are " + (chars.length - counter) + " letter(s) in chars' array that is not belongs to ASCII" +
                " capital letter(s) ABC!");

        // There is/are 4 letter(s) in chars' array that is not belongs to ASCII capital letter(s)!


        System.out.println("------------------------------");
        System.out.println("------------6th---------------");
        System.out.println("------------------------------\n");

        // 1st to check the value of maxLength!
        // 2nd check which is that long
        // creating a list, and append the word - for printing them
        // creating a list to append the index value for writting which element / which index!

        int maxLength = 0;
        String longestString = null;
        List<String> emptyList = new ArrayList<>();

        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
            if (maxLength == s.length()) {
                emptyList.add(longestString);
            }
        }
        System.out.println("The length of the longest word is: " + maxLength);
        System.out.println("The first longest word is: " + longestString);


        // BUT I want to tell all of them!

        System.out.println("I want it all!");


        int index = 0;
        List<Integer> indices = new ArrayList<Integer>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[0].length() <= strings[i].length()) {
                // System.out.println(strings[i].length());
                indices.add(strings[i].length());
                index = i;
            }
        }
        System.out.println("The list includes the length of strings: " + indices);

        System.out.println("This is the max value: " + Collections.max(indices));

        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int x : indices) {
            if (x > max) {
                max = x;
                maxCount = 1;
            } else if (x == max) {
                maxCount++;
                System.out.println(maxCount);
            }
        }

        System.out.println("Max length of strings : " + max);
        System.out.println("Peaces of max length strings: " + maxCount);

        int maxNew = indices.stream().max(Integer::compareTo).get();
        int finalMax = max;
        System.out.println("The indexes of the elements are (collected in an ArrayList): " +
                IntStream.range(0, indices.size()).filter(ix ->
                        indices.get(ix).intValue() == finalMax).boxed().collect(Collectors.toList()));
        System.out.println("The max length of the string is: " + maxNew);


        Vector<String> stringsCollection = new Vector<>(); // Vector<String> stringsCollection = new Vector<String>();

        for (int i = 0; i < strings.length; i++) {
            if (maxLength == strings[i].length()) {
                stringsCollection.add(strings[i]);
                System.out.println("The indexes of the items are as follows: " + i);
                System.out.println("The number of the elements are the following: " + (i + 1));
            }
        }
        System.out.println("All the longest strings (collected in ArrayList) are as follows: " + stringsCollection);


//        The first longest word is: barack
//        The indexes of the elements are: [2, 3]
//        All the longest strings (collected in ArrayList) are as follows: [barack, szilva]
//        The indexes of the items are as follows: 2
//        The number of the elements are the following: 3
//        The indexes of the items are as follows: 3
//        The number of the elements are the following: 4


        System.out.println("------------------------------");
        System.out.println("------------7th---------------");
        System.out.println("------------------------------\n");



        double[][] firstTwoDimensionMatrixOfMyLife = new double[3][];

        // just for try and to know how it works and operates!

        firstTwoDimensionMatrixOfMyLife[0] = new double[]{10, 33, -2, 0, 56, -42, 99, -73, 60};
        firstTwoDimensionMatrixOfMyLife[1] = new double[]{27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
        firstTwoDimensionMatrixOfMyLife[2] = new double[]{3.14, -765.99, 52.4986, -10.3333337, 834.0965};

        System.out.println("This is my first new Two dimension of Array: " + Arrays.deepToString(firstTwoDimensionMatrixOfMyLife));

        System.out.println("Another solution with for loop:");



//        first make new int arrays than collect them into a new!
//        int[] doubleToInt = new int[5];
//        for (int i = 0; i < doubles.length; i++) {
//            doubleToInt[i] = (int) doubles[i];


        int[] doubleToInt = new int[doubles.length];
        for (int i = 0; i < doubles.length; i++) {
            doubleToInt[i] = (int) doubles[i];
        }
        System.out.println("The array (with double items) in int data type: " + Arrays.toString(doubleToInt));

       int[] byteToInt = new int[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            byteToInt[i] = (int) bytes[i];
        }
        System.out.println("The array (with byte items) in int data type: " + Arrays.toString(byteToInt));

        int[] maxLengthOfArrays = new int[3];

        maxLengthOfArrays[0] = byteToInt.length;
        maxLengthOfArrays[1] = doubleToInt.length;
        maxLengthOfArrays[2] = ints.length;

        int maxOfArrays = maxLengthOfArrays[0];

        for (int i = 0; i < maxLengthOfArrays.length; i++) {
            if (maxOfArrays < maxLengthOfArrays[i]) {
                maxOfArrays = maxLengthOfArrays[i];
                System.out.println(maxLengthOfArrays[i]);
            }
        }
        System.out.println("This is the max length of the new int type arrays (3 of them): " + maxOfArrays);


        int n = maxOfArrays;

        int[][] twoDimensionArray = new int[3][n];

        for (int i = 0; i < byteToInt.length; i++) {
            twoDimensionArray[0][i] = byteToInt[i];
                }
        for (int i = 0; i < ints.length; i++) {
            twoDimensionArray[1][i] = ints[i];
        }
        for (int i = 0; i < doubleToInt.length; i++) {
            twoDimensionArray[2][i] = doubleToInt[i];
        }
        System.out.println("With stupid format: " +Arrays.toString(twoDimensionArray));
        System.out.println(twoDimensionArray[0][0]);
        System.out.println(twoDimensionArray[0][4]);


        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray[i].length; j++) {
                System.out.println("Elements by elements (arrays) in int: " + twoDimensionArray[i][j]);
            }
        }

        System.out.println("\nThe same but converted to double: \n");

        double[] intToDouble = new double[ints.length];
        double[] byteToDouble = new double[bytes.length];


        for (int i = 0; i < ints.length; i++) {
            intToDouble[i] = (double) ints[i];
        }
        for (int i = 0; i < bytes.length; i++) {
            byteToDouble[i] = (double) bytes[i];
        }

        double[][] matrix = {byteToDouble, intToDouble, doubles};

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.println("Arrays elements in double: " + matrix[i][j]);
            }
        }

        System.out.println("------------------------------");
        System.out.println("------------8th---------------");
        System.out.println("------------------------------\n");


        System.out.println("Sum of rows or sum of columns are the two different way to tell sum of all elements :)");
        System.out.println("Can summarize with a for loop in a for loop (iterating through all elements!");

        double  sumMatrix = 0;
        double counterMatrix = 0;
        for (double[] arr : matrix) {
            for (double i : arr) {
                sumMatrix += i;
                counterMatrix ++;
            }
        }

        System.out.println("The sum of all elements of the matrix in double: " + sumMatrix);
        System.out.println("The average is: " + (sumMatrix / counterMatrix) + " (the value is in double)");


//        The sum of all elements of the matrix in double: 8611172.4117663
//        The average is: 331198.9389140885 (the value is in double)


        System.out.println("------------------------------");
        System.out.println("------------9th---------------");
        System.out.println("------------------------------\n");


        // check first the 9th out than the 10th (10th is the 2 dimension)

        int counterStrings = 0;

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                counterStrings++;
            }
        }
        System.out.println("The sum of chars in strings' array: " + counterStrings);


        int k = 0;
        char[] charsFromStrOne = new char[counterStrings];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                charsFromStrOne[k++] = strings[i].charAt(j);
            }
        }
        System.out.println(Arrays.toString(charsFromStrOne));

        System.out.println("------------------------------");
        System.out.println("-----------10th---------------");
        System.out.println("------------------------------\n");


        char[][] charsFromStringsTwo = new char[strings.length][];
        charsFromStringsTwo[0] = new char[4];

        for (int i = 0; i < strings.length; i++) { // enter the two dimension of array! - first dimension
            charsFromStringsTwo[i] = new char[strings[i].length()]; // creating the empty array for the words!
            for (int j = 0; j < strings[i].length(); j++) { // enter the 2nd dimension
                charsFromStringsTwo[i][j] = strings[i].charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(charsFromStringsTwo));
    }
}