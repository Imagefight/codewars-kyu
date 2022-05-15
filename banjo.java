public class Banjo {
  // Check the first character in a string
  // If the first character is a "r," exclaim they are playing banjo.
  
  // The input will always be a word
  // The input may have capitals, you must treat lowercase and capital letters the same.
  public static String areYouPlayingBanjo(String name) {
    // Turn everything to the same case
    // Then check the first character to see if it is an "r"
    if (name.toLowerCase().charAt(0) == 'r'){
     // If it's an "r," return the positive exclaimation.
     return (name + " plays banjo");
    }
    // If not, return the negative exclaimation.
    return (name + " does not play banjo");
  }
}
