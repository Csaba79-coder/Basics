
import java.util.Arrays;


public class StringsToArrayChars {

    public static void main(String[] args) {

        String s = "Ria és Tamás segít";

        for (int i=0; i < s.length(); i++) {
           // System.out.println(s.charAt(i));
        }

        char[] chars = new char[s.length()];

        for (int i=0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
            // System.out.println(chars[i]);
            // System.out.println(Arrays.toString(chars));
        }
        System.out.println(Arrays.toString(chars));


        String[] strings = {"alma", "málna", "barack", "szilva"};

        int sum = 0; // sum chars

        for (int i=0; i < strings.length; i++) {
            sum += strings[i].length();
        }
        System.out.println(sum);

        int k = 0;
        char[] charsFromStrOne = new char[sum];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                charsFromStrOne[k++] = strings[i].charAt(j);
            }

        }
        System.out.println(Arrays.toString(charsFromStrOne));

        // strings length az 4 long and I don't need the number of the column

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


