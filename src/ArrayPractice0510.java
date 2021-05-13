import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ArrayPractice0510 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        byte[] bytes = {10, 33, -2, 0, 56, -42, 99, -73, 60};
        char[] chars = {'A', '*', 'c', 'd', 'E', ' '};
        int[] ints = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
        double[] doubles = {3.14, -765.99, 52.4986, -10.3333337, 834.0965};
        String[] strings = {"alma", "málna", "barack", "szilva"};


        System.out.println("------------------------------");
        System.out.println("------------1st---------------");
        System.out.println("------------------------------\n");

        System.out.println("Which above mentioned array is the longest? \n");

        int[] lengthOfArrays = new int[5];

        lengthOfArrays[0] = bytes.length;
        lengthOfArrays[1] = chars.length;
        lengthOfArrays[2] = ints.length;
        lengthOfArrays[3] = doubles.length;
        lengthOfArrays[4] = strings.length;

        System.out.println("First array's length: " + bytes.length);
        System.out.println("Second array's length: " + chars.length);
        System.out.println("Third array's length: " + ints.length);
        System.out.println("Fourth array's length: " + doubles.length);
        System.out.println("Fifth array's length: " + strings.length + "\n");

        int min = Arrays.stream(lengthOfArrays).min().getAsInt();
        int max = Arrays.stream(lengthOfArrays).max().getAsInt();
        System.out.println("The shortest array has " + min + " element short");
        System.out.println("The longest array has " + max + " element long");

        int index;

        for (index = 0; index < lengthOfArrays.length; index++) {
            System.out.println("Indices: " + index);
            System.out.println("Current value: " + lengthOfArrays[index]);

            // a harmadik tömb a második indexen, ami 12 elem hosszú
        }

        int maximum = lengthOfArrays[0];
        int indexLongest = 0;

        for (int i = 0; i < lengthOfArrays.length; i++) {
            if (maximum < lengthOfArrays[i]) {
                maximum = lengthOfArrays[i];
                indexLongest = i;
            }
        }
        System.out.println("The longest array's index: " + indexLongest);
        System.out.println("Wrong concatenate!!! As follows: " + indexLongest + 1);
        System.out.println("The number of the longest array is: " + (indexLongest + 1));

        for (char c : chars) {
            System.out.println(c);
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[++i]);
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i++]);
        }

        String sumCharsToString = "";

        for (int i = 0; i < chars.length; i++) {
            System.out.println(sumCharsToString + chars[i]);
            sumCharsToString = sumCharsToString + chars[i];
        }
        System.out.println(sumCharsToString);

        System.out.println("Counting chars in chars' array! \n");
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                counter++;
                System.out.println(chars[i]);
            }
        }
        System.out.println("There is/are " + (chars.length - counter) + " letter(s) in chars' array that is not belongs to ASCII" +
                " capital letter(s) ABC!");


        counter = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                counter++;
                System.out.println(chars[i]);
            }

        }

        // gives back the first longest word of the array!

        int maxLength = 0;
        String longestString = null;

        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        System.out.println("The length of the longest word is: " + maxLength);
        System.out.println("The first longest word is: " + longestString);

        // how to create an empty list for Integers:

        //Create an empty List.
        List<Integer> myList = new ArrayList<Integer>();

        System.out.println("Created empty immutable List: " + myList);

        myList.add(1);
        myList.add(2);

        System.out.println("Added 2 elements to the list!" + myList);


        maxLength = 0;
        longestString = null;
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
        System.out.println(emptyList);


        // BUT I want to tell all of them!

        System.out.println("I want it all!");

        index = 0;
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

        max = Integer.MIN_VALUE;
        int maxCount = 0;
        int indexesArrayList;

        for (int x : indices) {
            if (x > max) {
                max = x;
                maxCount = 1;
            } else if (x == max) {
                maxCount++;
                System.out.println(maxCount);
            }
        }

        System.out.println("Max value : " + max);
        System.out.println("Max Count : " + maxCount);
        System.out.println(indices);


        System.out.println("Max value : " + max);
        System.out.println("Max Count : " + maxCount);

        int maxNew = indices.stream().max(Integer::compareTo).get();
        int finalMax = max;
        System.out.println("The indexes of the elements are: " + IntStream.range(0, indices.size()).filter(ix ->
                indices.get(ix).intValue() == finalMax).boxed().collect(Collectors.toList()));
        System.out.println("The max length of the string is: " + maxNew);


        Vector<String> stringsCollection = new Vector<String>();

        for (int i = 0; i < strings.length; i++) {
            if (maxLength == strings[i].length()) {
                stringsCollection.add(strings[i]);
                System.out.println("The indexes of the items are as follows: " +i);
                System.out.println("The number of the elements are the following: " + (i+1));
            }
        }
        System.out.println("All the longest strings (collected in ArrayList) are as follows: " + stringsCollection);
//        String stringNoCollection = stringsCollection.toString();
//        System.out.println(stringNoCollection); // this did not operated had the same output!

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



    }
}

