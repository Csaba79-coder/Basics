public class CheckingDataTypeInArray_0510 {
    public static void main(String[] args) {

        byte[] bytes = {10, 33, -2, 0, 56, -42, 99, -73, 60};
        char[] chars = {'A', '*', 'c', 'd', 'E', ' '};
        int[] ints = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
        double[] doubles = {3.14, -765.99, 52.4986, -10.3333337, 834.0965};
        String[] strings = {"alma", "málna", "barack", "szilva"};
        Integer[] integers = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};


        if (integers[0] instanceof Integer) {
            System.out.println("Integer!");
            System.out.println(integers[0] instanceof Integer);
        } else {
            System.out.println("Something else!");
        }

        if (strings[0] instanceof String) {
            System.out.println("String!");
            System.out.println(strings[0] instanceof String);
        }
    }
}
