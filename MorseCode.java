import java.util.*;
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        
        /* Split the String into an Array of words (or rather, codes.)
         * Go through the List of codes pushing translations one by one.
         * Use MorseCode.get(...) for translations
         */
      Stack<String> translatedWords = new Stack<String>();
      
      // Include a delimiter for the spaces.
      morseCode = morseCode.replaceAll("\\s{3}", " delim ");
      // Split the codes into individual codes to be processed by the program
      String[] codes = morseCode.split(" ");
      // Reserve a string for the solution
      String translation = new String();
      
      for(String code : codes){
        if (code == "delim") {translatedWords.push(" ");}
        else {translatedWords.push(MorseCode.get(code));}
        
        if (translatedWords.peek() == null){
          translatedWords.pop();
          translatedWords.push(" ");
        }
      }
      
      // Concat the entire string array for the full sentence.
      translation = String.join("", translatedWords);
      
      // Trim leftover whitespace around the word.
      return translation.trim();
    }
}
