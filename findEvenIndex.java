public class Kata {
  public static int findEvenIndex(int[] arr) {
    int grandTotal =  0;
    int leftTotal  =  0;
    int iterator   =  0;
    int solution   = -1;
    
    // Get the sum total of the provided array
    for (int number : arr){grandTotal += number;}
    
    // Make an array with it's own counter,
    // Subtract this counter from the grand total integer
    // When both this new counter and the ground total are the same number, return the index
    for (int number : arr){
      int rightTotal = grandTotal - leftTotal + (number * -1);
      if (leftTotal == rightTotal){
        solution = iterator;
      }
      leftTotal += number;
      iterator++;
    }
    return solution;
  }
}
