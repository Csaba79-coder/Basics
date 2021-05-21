import java.util.Locale;
import java.util.Scanner;

public class ifConditionHW_0507 {
    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("------------1st---------------");
        System.out.println("------------------------------\n");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a number: ");
        int inputNum = scanner.nextInt();

        if (inputNum % 2 == 0)
            System.out.println("Entered number is even");

        else
            System.out.println("Entered number is odd");


        System.out.println("------------------------------");
        System.out.println("------------2nd---------------");
        System.out.println("------------------------------\n");


        System.out.println("Please enter your age: ");
        int inputAge = scanner.nextInt();
        if (inputAge >= 0 && inputAge <= 3) {
            System.out.println("bru-bru-bruu babuci");
        } else if (inputAge > 3 && inputAge < 13) {
            System.out.println("szióka");
        } else if (inputAge >= 13 && inputAge < 20) {
            System.out.println("csá");
        } else if (inputAge >= 20) {
            System.out.println("Jó napot kívánok.");
        } else {
            System.out.println("Hello, Marty McFly");
        }


        System.out.println("------------------------------");
        System.out.println("------------3rd---------------");
        System.out.println("------------------------------\n");


        System.out.println("Please enter a color: ");
        String colorInput = scanner.next();
        colorInput = colorInput.toUpperCase(Locale.ROOT);


        // I wanted to practice and learn switch method!!!
        // I know it is more nice using .equal() method and if statement!

        switch (colorInput) {
            case "RED":
                System.out.println("A piros tilos!");
                break;
            case "PIROS":
                System.out.println("A piros tilos!");
                break;
            case "GREEN":
                System.out.println("Szabad!");
                break;
            case "ZOLD":
                System.out.println("Szabad!");
                break;
            case "ZÖLD":
                System.out.println("Szabad!");
                break;
            default:
                System.out.println("N/A");
        }
        // System.out.println(colorInput); // to control uppercase method :)


        System.out.println("Please give me your gender: ");
        String genderInput = scanner.next();
        genderInput = genderInput.toUpperCase(Locale.ROOT);

        // I thought about making a converter :) inch cm converter :)
        System.out.println("Please give me your height (unit of measure is in cm): ");
        int heightInput = scanner.nextInt();

        if ((genderInput.equals("MAN") || genderInput.equals("MALE") || genderInput.equals("FERFI") ||
                genderInput.equals("FÉRFI")) && heightInput > 176) {
            System.out.println("Az Ön magassága az átlagnál magasabb!");
        } else if ((genderInput.equals("MAN") || genderInput.equals("MALE") || genderInput.equals("FERFI") ||
                genderInput.equals("FÉRFI")) && heightInput < 176) {
            System.out.println("Az Ön magassága az átlagnál alacsonyabb!");
        } else if ((genderInput.equals("MAN") || genderInput.equals("MALE") || genderInput.equals("FERFI") ||
                genderInput.equals("FÉRFI")) && heightInput == 176) {
            System.out.println("Az Ön magassága éppen átlagos!");
        }

        if ((genderInput.equals("WOMAN") || genderInput.equals("FEMALE") || genderInput.equals("NŐ") ||
                genderInput.equals("NO") || genderInput.equals("HÖLGY") ||
                genderInput.equals("HOLGY")) && heightInput > 164) {
            System.out.println("Az Ön magassága az átlagnál magasabb!");
        } else if ((genderInput.equals("WOMAN") || genderInput.equals("FEMALE") || genderInput.equals("NŐ") ||
                genderInput.equals("NO") || genderInput.equals("HÖLGY") ||
                genderInput.equals("HOLGY")) && heightInput < 164) {
            System.out.println("Az Ön magassága az átlagnál alacsonyabb!");
        } else if ((genderInput.equals("WOMAN") || genderInput.equals("FEMALE") || genderInput.equals("NŐ") ||
                genderInput.equals("NO") || genderInput.equals("HÖLGY") ||
                genderInput.equals("HOLGY")) && heightInput == 164) {
            System.out.println("Az Ön magassága éppen átlagos!");
        }


        System.out.println("------------------------------");
        System.out.println("------------5th---------------");
        System.out.println("------------------------------\n");

        // Pythagora's theorem
        // Pythagorean equation: a * a + b * b = c * c
        // A good example, TRY it! num1 = 5 and num2 = 12 and num3 = 13 TODO try this one as user input :)
        // A bad example, TRY it! num1 = 2 and num2 = 3 and num3 = 4 TODO try this one as user input :)

        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter the third number:");
        double num3 = scanner.nextDouble();

        if (num1 * num1 + num2 * num2 == num3 * num3) {
            System.out.println("It is possible to creat a right-angled triangle");
        } else {
            System.out.println("It is NOT possible to creat a right-angled triangle");
        }


        System.out.println("------------------------------");
        System.out.println("---------Extra 1--------------");
        System.out.println("------------------------------\n");


        // checking with if statement
        System.out.println("Checking with if statement (vowel or consonant)?!");
        System.out.println("Please give me a char (regarding ASCII - English ABC) for checking vowel or constant: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }

        // checking with switch
        System.out.println("Checking with switch (vowel or consonant)?!");

        char chSwitchLower = Character.toLowerCase(ch);

        switch (chSwitchLower) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}