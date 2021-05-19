import java.util.Scanner;


public class Exercise_0505 {
    public static void main(String[] args) {
//        int n = 0;
//        n -= (n % 2 > 0) ? 1 + 2 * n : n - 3;
//        System.out.println(n -= (n % 2 > 0) ? 1 + 2 * n : n - 3);

        /*
        int x = 1;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
        System.out.println(--x);

         */

        String xxx = "Csaba";
        System.out.println(xxx + " Soma");
        System.out.println(xxx);


        System.out.println("Exercise 1:");
        System.out.println("1/1:");

        int j = 5, i = 10;

        j += j * 2 == i ? j : i % 3;

        System.out.println(j);

        boolean b = false, c = true, d = true;
        boolean a = b || c ? ! ( b || c && d ) : c && ! d;
        System.out.println(a);


        /*
        System.out.println("Excercise 3:");
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b= sc.nextFloat();
        System.out.print("Enter third number: ");
        float c= sc.nextFloat();
        double d = (a + b + c) / 3;
        System.out.println("Total= " + d);
         */



        /*
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName.toUpperCase());  // Output user input
         */
    }
}
