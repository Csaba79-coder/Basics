import java.util.Scanner;

public class PrimeOrNot_0508 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("---------Extra 3--------------");
        System.out.println("------------------------------\n");


        // természetes számok a nem negatív egész számok!
        // prim számok kizárólag természetes egész számok lehetnek, legkisebb a 2!!!
        // pl: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
        // 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
        // önmagával és egyel osztható számok a prim számok!!!
        // ezért oszthatóságot vizsgálok!!!

        System.out.println(Integer.MAX_VALUE); // for testing the max value
        // mindig teszteljük a szélsőséges értéket!


        Integer numPrimeOrNot = Integer.MAX_VALUE;

        long runTimeStart = System.nanoTime();


//        System.out.println("Enter any number:");
//        int numPrimeOrNot = scanner.nextInt();
//        scanner.close();

        boolean isPrime = true;

        if (numPrimeOrNot < 2) {
            isPrime = false;
        }
        for (int i = 2; i <= numPrimeOrNot / 2; ++i) {
            // condition for nonprime number
            if (numPrimeOrNot % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(numPrimeOrNot + " is a prime number.");
        else
            System.out.println(numPrimeOrNot + " is not a prime number.");

        long runTimeEnd = System.nanoTime();

        long runTime = (runTimeEnd - runTimeStart);

        System.out.println("The program runtime in Nanosec: " + runTime);

        // solution with while and Math.square !!!
    }
}
