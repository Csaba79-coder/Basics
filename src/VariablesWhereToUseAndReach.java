public class VariablesWhereToUseAndReach {

    public int y = 5;
    public static int x = 5;

    public static void main(String[] args) {
        x = 15;
        System.out.println(x);
        changeX();
        System.out.println(x);
    }

    public static void changeX() {
        x = 20;
        // System.out.println(x);
    }
}
