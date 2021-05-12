import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice0510 {
    public static void main (String[] args) {


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

        for (int i = 0; i < lengthOfArrays.length; i++)
        {
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

    }
}
