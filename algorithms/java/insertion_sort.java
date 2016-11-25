/**
 *Sorting problem:
 *
 *Input: A sequence of n numbers {a1, a2, ... , an }
 *
 *Output: A permutation (reordering) {a1', a2', ... , an' } 
 **/

import java.util.Arrays;

class Insertion_Sort {

    public static void main(String[] args) {
            
            int[] array1 = new int[]{2, 1, 6, 7, 8, 1, 2, 3, 4, 5};
            long[] array2 = new long[]{2038947509, 234523434, 908809808, 466, 999999,234,23,3,-1981, -19};
            int[] array3 = new int[]{90,80,70,60,40,20,10};
            int[] array4 = new int[]{1000,900,800,400,600,700,200,100,30,50,60,70,801,10000,1,23452345, -34, -1, -1000, -13456345};
            double[] array5 = new double[]{-10, 0 , 0 , 0 , 0 , 0 ,0 , -20, -20.1, 10.2, 1000.50, 90.11234};
            System.out.println(Arrays.toString(insertionSort(array1)));
            System.out.println(Arrays.toString(insertionSort(array2)));
            System.out.println(Arrays.toString(insertionSort(array3)));
            System.out.println(Arrays.toString(insertionSort(array4)));
            System.out.println(Arrays.toString(insertionSort(array5)));

    }

    private static double[] insertionSort(double[] array) {
        double valueAtStartIndex;
        int indexOfValueToInsert;

        for (int startIndex = 1; startIndex < array.length; startIndex++) {
            
           valueAtStartIndex = array[startIndex];
           indexOfValueToInsert = startIndex - 1; 

           while (indexOfValueToInsert > -1 && array[indexOfValueToInsert] > valueAtStartIndex) {
              
                array[indexOfValueToInsert + 1] = array[indexOfValueToInsert];  
                indexOfValueToInsert--;

           }

           array[indexOfValueToInsert + 1] = valueAtStartIndex;
        }

        return array;

    }

    private static int[] insertionSort(int[] array) {
        int valueAtStartIndex;
        int indexOfValueToInsert;

        for (int startIndex = 1; startIndex < array.length; startIndex++) {
            
           valueAtStartIndex = array[startIndex];
           indexOfValueToInsert = startIndex - 1; 

           while (indexOfValueToInsert > -1 && array[indexOfValueToInsert] > valueAtStartIndex) {
              
                array[indexOfValueToInsert + 1] = array[indexOfValueToInsert];  
                indexOfValueToInsert--;

           }

           array[indexOfValueToInsert + 1] = valueAtStartIndex;
        }

        return array;

    }

    private static long[] insertionSort(long[] array) {
        long valueAtStartIndex;
        int indexOfValueToInsert;

        for (int startIndex = 1; startIndex < array.length; startIndex++) {
            
           valueAtStartIndex = array[startIndex];
           indexOfValueToInsert = startIndex - 1; 

           while (indexOfValueToInsert > -1 && array[indexOfValueToInsert] > valueAtStartIndex) {
              
                array[indexOfValueToInsert + 1] = array[indexOfValueToInsert];  
                indexOfValueToInsert--;

           }

           array[indexOfValueToInsert + 1] = valueAtStartIndex;
        }

        return array;

    }
}
