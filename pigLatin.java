public class PigLatin {
  public static String pigIt(String str) {
    // Set the Data types to be used,
    // An Empty String for the New Sentence
    // and a String Array Populated by the words of this new sentence
    String pigged = new String();
    String[] sentence = str.split(" ");
    
    // For Every word in the sentence
    for (String word : sentence){
      // Latinize the word
      pigged += latinize(word) + " ";
    }
    // Trim the extra space, and then send it off to the user
    return pigged.trim();
  }
  
  private static String latinize(String word){
    // Empty String for the new word
    String pLatin = new String();
    // Get the word without the first letter, add the first letter, then add "ay"
    pLatin = word.substring(1) + word.substring(0,1) + "ay";
    // If the first character is not a letter or digit, undo this.
    if (!Character.isLetterOrDigit(pLatin.charAt(0))) {pLatin = pLatin.charAt(0)+"";}
    // Return the pig latin!
    return pLatin;
  }
}
