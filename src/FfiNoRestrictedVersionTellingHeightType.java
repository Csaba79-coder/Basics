import java.util.Scanner;

public class FfiNoRestrictedVersionTellingHeightType {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a nemed! Férfi  (ffi) vagy Nő (no): ");
        String genderUserInput = scanner.nextLine();

        System.out.println("Kérlek add meg a magasságodat cm-ben: ");
        int heightUserInput = scanner.nextInt();

        if (genderUserInput.equals("ffi") && heightUserInput > 176) {
            System.out.println("Az Ön magassága az átlagnál magasabb!");
        } else if (genderUserInput.equals("ffi") && heightUserInput < 176) {
            System.out.println("Az Ön magassága az átlagnál alacsonyabb!");
        } else if (genderUserInput.equals("ffi") && heightUserInput == 176){
            System.out.println("Az Ön magassága éppen átlagos!");
        }
        if (genderUserInput.equals("no") && heightUserInput > 164) {
            System.out.println("Az Ön magassága az átlagnál magasabb!");
        } else if (genderUserInput.equals("no") && heightUserInput < 164) {
            System.out.println("Az Ön magassága az átlagnál alacsonyabb!");
        } else if (genderUserInput.equals("no") && heightUserInput == 164){
            System.out.println("Az Ön magassága éppen átlagos!");
        }
    }
}

