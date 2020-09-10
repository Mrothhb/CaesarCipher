  /** The errors provided in the given code
   * will be corrected and written in the file header
 *
 * @Matthew Roth mrroth@ucsd.edu
 * 10/09/2018
 * Fix the compiler, runtime, and logical errors in the 
 * FunWithIntArrays.java file, and post the bugs found with 
 * a detailed description to the file header. 
 *
 * <Error 1>
 * Compiler error - missing return statement 
 * Incorrect: return ;
 * Fix: return array;
 * Explain: Method was missing a return value, and the 
 * return value as an array reference variable was added.
 *
 * <Error 2>
 * Logical Error - set the min variable to the lowest array NOT the index
 * Incorrect: If(array[]i < min) 
 *  min = i;
 *  Fix: min = array[i];
 *  Explain: The min value was set to the index instead of the array element
 *
 *
 * <Error 3> 
 * Runtime error -  
 * Incorrect: public static double findAvg(int []array)
 * Fix: public static double findAvg(int[] array)
 * Explain: the method was taking an int value as an argument in the parameters 
 * instead of an int array. 
 *
 * <Error 4>
 * Logical Error - The sum is equvalence statemrnt to array variable 
 * Incorrect: sum == array[i];
 * Fix: sum = array[i] + sum; or sum += array[i];
 * Explain: the sum variable was initially finding equivalence to the array
 * element at index i, when it should be set equal to the array element at index 
 * plus the current sum.
 *
 * <Error 5>
 * Logical Error - The array element copy in arrayCopy() method is incrementing 
 * the element i index incorrectly 
 * Incorrect: result[i++] = array[i];
 * Fix: result[i] = array[i];
 * Explain: since we are copying the array for each exact element we should
 * not increment the index for the result element
 *
 * <Error 6>
 * Runtime Error - public static int[] arrayCopy(int array) parameters for int 
 * Incorrect: public static int[] arrayCopy(int array){
 * Fix: public static int[] arrayCopy(int[] array){
 * Explain: the method needs to accept an array as an argument instead of an int
 * and the change to int[] will fix that. 
 *
 * <Error 7>
 * Compiler Error - the method was invalid for return type 
 * Incorrect: public static finMax(int[] array){
 * Fix: public static int findMax(int[] array)
 * Explain: the method header was missing the return type 
 *
 * <Error 8>
 * Compiler Error - possibly lossy conversion from double to int
 * Incorrect: int average = (sum / (array.length));
 * Fix: double average = (sum / (array.length));
 * Explain: the average needs to be a double when division occurs between an int 
 * and a double 
 *
 * <Error 9> 
 * Compiler error - return statement invalid for method type
 * Incorrect: return array;
 * Fix: no return type, skip to next line after if statement 
 * Explain: you cannot return a void method 
*
* <Error 10>
* Complier Error - cannot find value "min"
* Incorrect: min = array[0];
* Fix: int min = array[0];
* Explain: the variable min was not declared as a value type, in this 
* case an int
*
* <Error 11>
* Runtime Error - out of bounds exception
* Incorrect: for(int i = 0; i <= array.length; i++)
* Fix: for(int i =0; i < array.length; i++)
* Explain: the index was reaching to far for an element that doesnt exist, and 
* the operator was setting to equivalence or less than, and it should only be
* less than the length of the array
*
* <Error 12>
* Runtime error - The array index out of bounds
* Incorrect: for (int j = 0; i < result.length -i - 1; j++) {
* Fix: for (int j =0; j < result.length -i -1; j++)
* Explain: the array index was set to i, and should be set to j, for the starting point
* of the index 
*
* <Error 13>
* Logical Error - The array swap was unsuccessful due to improper logic.
* Incorrect: int temp = result[j];
*            result[j] = result[j+1];
*            result[j] = temp;
* Fix: int temp = result[j];
*          result[j] = result[j+1];
*          result[j+1] = temp;
* Explain: the array element variable was not properly copied 
* and the swap didnt occur. 
*
* */

public class FunWithIntArrays {

  // output the elements of the input array
  public static void printArray(int[] array) {
    if (array != null){
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + ", ");
      }
    }
    System.out.println();
  }

  // return the smallest element in the input array
  public static int findMin(int[] array) {
    //short circuit protects null access
    if (array == null || array.length == 0)
      return -1;

    int  min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }

    return min;
  }

  // return the largest element in the input array
  public static int findMax(int[] array) {
    //short circuit protects null access
    if (array == null || array.length == 0)
      return -1;

    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }

  // return the average of elements in the input array
  public static double findAvg(int[] array) {
    //short circuit protects null access
    if ( array == null || array.length == 0 )
      return -1;

    double sum = 0;

    for ( int i=0; i < array.length; i++ ) {
      sum += array[i];
    }

    double  average = ( sum / ( array.length ) );

    return average;
  }

  // return a copy of the input array
  public static int[] arrayCopy(int[] array) {
    if (array == null)
      return null;

    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];          
    }
    return result;
  }

  // return a sorted copy of the input array
  public static int[] arraySort(int[] array) {
    if (array == null)
      return null;

    int[] result = arrayCopy(array);

    for (int i = 0; i < result.length; ++i) {
      for (int j = 0; j < result.length -i - 1; j++) {
        if (result[j] < result[j + 1]) {
          //swapping result[j] and result[j+1]
          int temp = result[j];
          result[j] = result[j+1];
          result[j+1] = temp;
        }
      }
    }
    return result;
  }
}
