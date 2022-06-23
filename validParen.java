public class Solution{
  
  public static boolean validParentheses(String parens)
  {
    int paren = 0;
    
    for (char character : parens.toCharArray()){
      // If there is a closure before any Openers, Retun false
      if (character == ')' && paren == 0) {return false;}
      
      // Check the Character
      switch (character){
          // If it's an opener, increment
          case '(':
            paren++;
            break;
          // If it's a closure, decrement
          case ')':
            paren--;
            break;
          // Ignore all else
          default:
            break;
      }
    }
    // Return if Paren is equal to 0
    return (paren == 0);
  }
}
