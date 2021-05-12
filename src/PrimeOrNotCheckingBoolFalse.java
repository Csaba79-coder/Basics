import java.util.Scanner;

public class PrimeOrNotCheckingBoolFalse {
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

        System.out.println("Enter any number:");
        int numPrimeOrNot = scanner.nextInt();
        scanner.close();

        boolean isPrime = false;

        if (numPrimeOrNot < 2) {
            isPrime = true;
        }
        for (int i = 2; i <= numPrimeOrNot / 2; ++i) {
            // condition for nonprime number
            if (numPrimeOrNot % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(numPrimeOrNot + " is a prime number.");
        else
            System.out.println(numPrimeOrNot + " is not a prime number.");
    }
}