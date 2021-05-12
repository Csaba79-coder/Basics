import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ArraysForExtraCredit_0509 {
    public static void main(String[] args) {


        Random random = new Random();

        // 0 floor means there is no floor :) TODO TODO without zero floor another solution! as required!!!

        int[] numbers = new int[10];
        //Generates 10 Random Numbers in the range 0-5
        // range(6) --> random numbers between 0-5

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(6);
            System.out.println(numbers[i]); // printing floor for checking!!!
            if (numbers[i] == 0) {
                System.out.println("This house has no floor!");
            } else if (numbers[i] % 2 == 0) {
                System.out.println("Szeretem a páros számot");
            } else {
                System.out.println("ó jaj");
            }
        }
        // System.out.println("Numbers Generated: " + Arrays.toString(numbers));

        System.out.println("\nEmeletek 1-5-ig:\n");

        int[] numbersFloor = new int[10];
        //Generates 10 Random Numbers in the range 0-5
        // floor between: 1-5 :)

        int min = 1;
        int max = 5;
        for(int i = 0; i < numbersFloor.length; i++) {
            numbersFloor[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println(numbersFloor[i]); // printing floor for checking!!!
            if (numbersFloor[i] % 2 == 0) {
                System.out.println("Szeretem a páros számot");
            } else {
                System.out.println("ó jaj");
            }
        }
    }
}
