import java.util.Scanner;


public class ClosingScannerAndUsingAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What year where you born in? " ); // in this case writes the answer next to the question! not new line!
        int yearOfYourBirth = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.print("What year are we writing now? ");
        int yearCurrent = scanner.nextInt();

        System.out.println("Your age is: " + (yearCurrent - yearOfYourBirth));


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String nameOfUser = scan.nextLine();
        scan.close();

        nameOfUser = nameOfUser.substring(0, 1).toUpperCase() + nameOfUser.substring(1);

        System.out.println("User name: " + nameOfUser + "!");
        System.out.println("Welcome: " + nameOfUser);

        // do not close if you use scanner later! gives Exception / error in Running!

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Hope it is working!! Please answer (yes - y or no - n): ");
//        char c = sc.next().charAt(0);
//        System.out.println("Your answer was: " + c);
//
//        Exception in thread "main" java.util.NoSuchElementException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:937)
//        at java.base/java.util.Scanner.next(Scanner.java:1478)
//        at ClosingScannerAndUsingAgain.main(ClosingScannerAndUsingAgain.java:32)
//
//        Process finished with exit code 1
    }
}
