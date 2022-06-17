public class Order {
  public static String order(String words) {
    // Return the word if it's blank.
    if (words.length() <= 0){return words;}
    
    // Split sentence into array of words
    String[] sent = words.split(" ");
    
    // Keep a counter for changes so we can test if the sentence is actually in order
    int changes  = 0;
    
    // Loop through Array of words
    for (int i = 0; i < sent.length; i++){
      // Input the word into checkword
      // Checkword will output the number found
      int swap = checkWord(sent[i]);
      String temp = sent[swap];
      
      // Swap the places of the words required
      if (!(swap == i)){
        System.out.println(sent[i] + " swapped with " + sent[swap]);
        sent[swap] = sent[i];
        sent[i] = temp;
        changes++;
      }
    }
    
    // join the words again
    words = String.join(" ", sent);
    
    // Do it again until no changes need to be made
    if (changes > 0){return order(words);}
    
    // return reconstructed sentence
    return words;
  }
  
  private static int checkWord(String word){
    // Find the number
    int answer = 0;
    // Loop through the word's characters
    for (int i = 0; i < word.length(); i++){
      // When you find the number, parse it as String which will be parsed as an integer, whew.
      if(Character.isDigit(word.charAt(i)) == true){
        answer = Integer.parseInt(String.valueOf(word.charAt(i)));
        break;
      }
    }
    // If there is no answer, return 0.
    if (answer < 0) {return 0;}
    // Return the Number Found minus one, for the array index.
    return answer - 1;
  }
}
