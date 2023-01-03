import java.util.Random;

public class MaxandMin {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        // initialise array1 with size 10
        int[] array1 = new int[10];
        // generate 10 random numbers for array1, numbers between 1-20
        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomGenerator.nextInt(20) + 1; //put the random numbers
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        {

            int[] intArray = array1;        //int array
            int min_Val = intArray[0];                              //assign first element to min value
            int length = intArray.length;
            for (int i = 1; i <= length - 1; i++) //till end of array, compare and find min value
            {
                int value = intArray[i];
                if (value < min_Val) {
                    min_Val = value;
                }
            }

            System.out.println("The min value in the array: " + min_Val);

            int max_Val = intArray[0];                             //reference element

            for (int i = 1; i <= length - 1; i++) // find max element by comparing others to reference
            {
                int value = intArray[i];
                if (value > max_Val) {
                    max_Val = value;
                }
            }
            System.out.println("The highest value in the array: " + max_Val);
        }
    }
}

