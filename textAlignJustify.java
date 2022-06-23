import java.util.Stack;
import org.apache.commons.lang3.StringUtils;

public class Kata {
  /*
   * Text Justification
   * Emulate text Justification in Monospace Font
   * Given a Single-Lined text and the expected justification width
   * Longest word will never be greater than this width
   * 
   * Spaces should fill in Gaps of Words
   * Lines should end with a word and not a space.
   * \n does not include anything in the length of a line
   *
   * Large Gaps should go first, followed by smaller ones  ('Lorem--ipsum--dolor--sit-amet,' (2, 2, 2, 1 spaces)).
   *
   * The Last line should not contain \n
   * The Last line should NOT be Justified, use one space.
   *
   * Strings with one word do not need gaps.
   */
  
  public static String justify(String text, int width) {
    return lineSplitter(text, width);
  }
  
  
  // Take in the String and Justification width, and split the Strings into Individual lines
  private static String lineSplitter(String text, int width){
    // Make a stack for every line to be pushed.
    Stack<String> lines = new Stack <>();
    // Make an integer for the least extracted substring
    int lastValue = 0;
    // Make a new String for the return value
    String fmtParagraph = new String();
    
    // Make a loop checking every 30th Character in the text
    for (int i = width - 1; i <= text.length(); i = i){
      // Pass the text and the character index into the checkForWord function
      // If the function does not return true, decrement and check again
      if (checkForWord(text, i) == false){i--;}
      
      else{
        // Once it is true, insert the /n
        lines.push(text.substring(lastValue, i) + "\n");
        
        // Set lastValue to the current index for the next insertion
        lastValue = i;
        
        // Add the width to i
        i += width;
      }
    }
    
    // The Last line does not need to be formatted, so we concat that first.
    fmtParagraph = lines.peek();
    lines.pop();
    
    // Fix the Lines to fit the width
    do{
      fmtParagraph = fmt(lines.peek(), width+2) + fmtParagraph;
      lines.pop();
    } while (!(lines.empty()));
   
    return fmtParagraph;
  }
  
  // If there's no word behind the index. don't return true.
  private static boolean checkForWord(String text, int index){
    if (text.charAt(index - 1) != ' ' && text.charAt(index) ==' '){return true;}
    return false;
  }
  
  private static String fmt(String text, int width){
    // To be Implemented Later
    return text;
  }
  
}
