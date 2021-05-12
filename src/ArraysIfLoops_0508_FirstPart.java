import java.util.Scanner;


public class ArraysIfLoops_0508_FirstPart {
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


        int[] lengthOfArrays = new int[5];

        lengthOfArrays[0] = bytes.length;
        lengthOfArrays[1] = chars.length;
        lengthOfArrays[2] = ints.length;
        lengthOfArrays[3] = doubles.length;
        lengthOfArrays[4] = strings.length;

        int maximum = lengthOfArrays[0];
        int indexLongest = 0;

        for (int i = 0; i < lengthOfArrays.length; i++)
        {
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

        for (byte num  : bytes){
            sumBytes = sumBytes + num;
        }
        System.out.println("The sum of the bytes: " + sumBytes);


        String sumCharsToString = "";

        for (int i = 0; i < chars.length; i++) {
            sumCharsToString = sumCharsToString + chars[i];
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

        for (int i = 0; i < strings.length; i++) {
            sumStrings = sumStrings + strings[i];
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
        byte lastNumBytes = bytes[bytes.length- 1];
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


    }
}
