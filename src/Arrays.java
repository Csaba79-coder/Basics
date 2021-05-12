public class Arrays {
    public static void main(String[] args) {
        int[] arrayNums1 = {1, 2, 3};
        int[] arrayNums2 = {4, 5, 6};

        for (int index = 0; index < arrayNums1.length; index++) {
            System.out.println("Indices: " + index);
            System.out.println("Current value: " + arrayNums1[index]);
        }

        for (int num : arrayNums1) {
            System.out.println("Curent value: " + num);
            System.out.println("Indeces: " + arrayNums1[num-1]);
        }

       /*
       int i;
        int j;
        for ( i = 0; i < arrayNums1.length; i++);
            for (j = 0; j < arrayNums1[i]; j++);
        System.out.println(arrayNums1);
        */

        // System.out.println("A mátrix " + i + " elemében a " + j + " elem ");

    }
}
