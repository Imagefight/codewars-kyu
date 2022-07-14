import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
    // Counter for good eyes
    int counter = 0;
    
    // Loop through emotes to check validity
    for (String emote : arr){
      if (emoteDeconstructor(emote)) {counter++;}
    }
    
    // Return the counter
    return counter;
  }
  
  private static boolean emoteDeconstructor(String emote){
    boolean valid = true;
    boolean hasNose = false;
    
    // If bigger than three characters, not valid
    if (emote.length() >  3) {valid = false;}
    // If exactly three characters, has a nose.
    if (emote.length() == 3) {hasNose = true;}
    
    // Eye Checker
    if (!((emote.charAt(0) == ':') || (emote.charAt(0) == ';'))) {valid = false;}
    
    // Mouth Checker
    if      (!hasNose) {if (!((emote.charAt(1) == 'D') || (emote.charAt(1) == ')')))  {valid = false;}}
    else if (hasNose)  {if (!((emote.charAt(2) == 'D') || (emote.charAt(2) == ')')))  {valid = false;}}

    // NoseChecker
    if (hasNose) {if (!((emote.charAt(1) == '-') || (emote.charAt(1) == '~')))  {valid = false;}}
    return valid;
  }
}
