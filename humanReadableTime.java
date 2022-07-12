public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    // Write a function, which takes a non-negative integer (seconds) 
    // as input and returns the time in a human-readable format (HH:MM:SS)
    
    // Calculate the seconds, minutes, and hours.
    int secAdj  = (seconds % 60) % 60;
    int minutes = (seconds / 60) % 60;
    int hours   = (seconds / 60) / 60;
    
    // Return the reformatted time. 
    return reformatter(hours) +":"+ reformatter(minutes) +":"+reformatter(secAdj);
  }
  
  // Make a function that makes the numbers double digits if not already double digits
  // This makes it re-usable, so that's bonus-points.
  private static String reformatter (int input){
    if (input < 10) {return "0" + input;}
    return "" + input;
  }
}
