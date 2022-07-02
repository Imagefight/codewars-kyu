import java.util.HashMap; // Import the Hashmap class!

public class Kata {

  public static String high(String s) {
    // Make an array of the alphabet. (Obviously in Alphabetical Order)
    // Using the index of the letters (+1), score the letters that way
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    
    // Split the string into an array
    String[] words = s.split(" ");
    
    // Reserve the highest value ID
    int maxValue = 0;
    
    // Make a hashmap of the words, assign the ID as a score.
    // If it is the same score as a prior word, Don't even add it. Just go next.
    HashMap<Integer, String> wordScore = new HashMap<Integer, String>();
    
    for (String word : words){
      // Keep track of the word's score
      int score = 0;
      // Keep track of how many characters are in the word;
      int wordlength = word.length() - 1;
      // Keep track of the letter being scored
      int charIterator = 0;
      
      while (wordlength >= 0){
         // Keep track of the letter's score
        int letterIterator = 1;
        
        for (char letter : alphabet){
          if (word.charAt(charIterator) == letter) {
            score += letterIterator;
          }
          letterIterator++;
        }
        if (charIterator != word.length()) {charIterator++;}
        wordlength--;
      }
      if (score > maxValue) {maxValue = score;}
      
      if(wordScore.get(score) == null) {wordScore.put(score, word);}
    }
    
    // Return highest value score
    return wordScore.get(maxValue);
  }

}
