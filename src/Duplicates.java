import java.util.Random;

public class Duplicates {
        public static void main(String[] args) {
        Random randomGenerator = new Random();

        // initialise array1 with size 10
        int [] array1 = new int [10];
        // generate 10 random numbers for array1, numbers betw 1-20
        for (int i=0; i < array1.length; i++){
        array1[i] = randomGenerator.nextInt(20) + 1; //put the random numbers
        System.out.print(array1[i] + " ");
        }
        System.out.println(" ");

        // initialise array2 with size 10
        int [] array2 = new int [10];
        // generate 10 random numbers for array1, numbers betw 1-20
        for (int i=0; i < array2.length; i++){
        array2[i] = randomGenerator.nextInt(20) + 1; //put the random numbers
        System.out.print(array2[i] + " ");
        }
        System.out.println(" ");

        // compare array1 and array2 values, print the same values
        System.out.println("The duplicates values are ");
        for (int i= 0; i<array1.length; i++) {
        for(int j=0; j < array2.length; j++) {
        if (array1[i] == array2[j]) {
        System.out.println(array1[i]);
        }
        }
        }
        }
        }
