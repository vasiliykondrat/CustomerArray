public class CustomerArray {
    public static void main(String[] args) {
        int[] array = {3,5,7,8,9,10,6};
        int max = array[0];
        int min = array[0];
        int sum = array[0];
        double sered = array[0];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            }
            System.out.println("Max is " + max);
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min )
                min = array[j];

        }
        System.out.println("Min is " + min);
        for (int y = 1; y < array.length; y++) {
            sum = sum + array[y];

        }
        System.out.println("Sum of array is " + sum);
        if (array.length > 0){
            double suma = 0;
            for (int e = 0; e < array.length; e++) {
                suma += array[e];


            }
            System.out.println("Sered number is " + suma / array.length);
            for (int x = 0; x <array.length ; x++) {
                if (array[x] % 2 - 1 ==0){
                    n = array[x];
                    System.out.println("Odd values: " + n);
                }


            }

        }




        }

    }

