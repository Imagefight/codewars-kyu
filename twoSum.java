/* The purpose of this function is to output the two indicies
 * of the two numbers in the 'numbers' array that will add up to
 * the target integer, 'target.'
 */
public class Solution {
  public static int[] twoSum(int[] numbers, int target) {
    /* To do this, we will have an empty array of two integers.
     * We use only two integers because the program asks for just two integers.
     * While there may be more than one answer, the prompt only asks for one pair.
     * What could be possible, is checking the solutions number-by-number.
     * Starting at the first number as a base point, we check the sum of every number
     * until we get to a solution. Going further into the array until we find a match
     * that does add up to the target number.
     * It's an absymal Big O, but it does the job just as well.
     */
    
    // Create the Int Array
    int[] solution = new int[2];
    // Create an iterator to keep track of how many times the
    // concise for loop has looped.
    int iterator = 0;
    
    // Create two loops comparing the numbers one at a time.
    for (int number : numbers){
      for (int i = iterator + 1; i < numbers.length; i++){
        // If there is a solution pair, return it.
        if (number + numbers[i] == target) {
          solution[0] = iterator;
          solution[1] = i;
          return solution;
        }
      }
      // Increment the iterator
      iterator++;
    }
    return null; // Do your magic!
  }
}
