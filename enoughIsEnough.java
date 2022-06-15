public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		/* Have two nested for loops, 
     * one which acts as a pointer to the original number,
     * The other which reads through every Element in the array afterward
     * After a certain number of matches, delete every instance of the number afterward.
     */
      
    for (int i = 0; i < elements.length; i++){
          int counter = 0;
          for(int k = i; k < elements.length; k++){
             // Add to the counter if the two elements are the same
             if (elements[i] == elements[k]) {counter++;}
             
             // Once the Counter reaches the maximum threshold,
             // Pass the array to the removeFromArr function
             // to delete the index from the array
             if (counter > maxOccurrences) {
               elements = removeFromArr(elements, k);
               // Use recursion to run the program again until it works
               return deleteNth(elements, maxOccurrences);
             }
          }
      }
      // If we dont need to do anything just return the elements
      return elements;
    }
  
  // Remove the specified index from the array by making a new copy and returning it
  private static int[] removeFromArr (int[] arr, int index){
    int[] copy = new int[arr.length - 1];
    // "For every element not at the specified index, copy it over."
    for (int i = 0, j = 0; i < arr.length; i++) {
      if (i != index) {
          copy[j++] = arr[i];
      }
    }
    // Return the new Array
    return copy;
  }
}
