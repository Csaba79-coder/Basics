import java.util.Scanner;

public class ScannerNotToGetStuckData {

    public static Scanner scanner;


    public static void main(String[] args) {

        scanner = getScanner();


//        System.out.println("use this one to void to get stuck datas!");
//        Scanner scanner = new Scanner(System.in);
//
//        int i = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Creating method from scanning!");
    }
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
