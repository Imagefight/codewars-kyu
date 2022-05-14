public class Solution {

  public int solution(int number) {
    // Need to find the sum of all numbers that are multiples of three and five
    // If the number is a multiple of both, just do it once
    // Assume the input will always be a Number, and Whole
    // There will be negative numbers
    // To handle negative numbers, return zero
    int[] arr = new int[number];
    int   sum = 0;
      
    // Check if the number is negative, if negative, return zero.
    if (number < 0) {return 0;}

    // Make the array of numbers
    for (int i = 0; i < number; i++){
      arr[i] = i;
    }
    
    // Loop through the array
    for(int i = 0; i < arr.length; i++){
      // Check for if the passed is a multiple of five and three first
      if ((arr[i] % 3 == 0) && (arr[i] % 5 == 0)){
        System.out.println(arr[i] + " checks both!");
        sum += arr[i];
      }else if (arr[i] % 3 == 0){
        // Then if the number is a multiple of three
        System.out.println(arr[i] + " checks 3!");
        sum += arr[i];
      }else if (arr[i] % 5 == 0){
        // Then if the number is a multiple of five
        sum += arr[i];
        System.out.println(arr[i] + " checks 5!");
      }
      // When there is a match, add the number to the sum
    }
    // return the sum
    return sum;
  }
}
