public class Kata {
  
  public static String rps(String p1, String p2) {
    // Check for a draw immediately in order to reduce time spent
    if (p1 == p2) {return "Draw!";}
    // If player 2 would have won, return the statement
    if (!checkVictory(p1,p2)) {return "Player 2 won!";}
    // If player 2 didn't win, player 1 would have won.
    else {return "Player 1 won!";}
  }
  
  // In order to minimize lines written
  // Assume Player one has won by default
  // Then make check for reasons why player 2 would have won instead
  // Return the result
  private static boolean checkVictory(String p1, String p2){
    boolean p1Victory = true;
    if (p1 == "scissors" && p2 == "rock"    )  {p1Victory = false;}
    if (p1 == "paper"    && p2 == "scissors")  {p1Victory = false;}
    if (p1 == "rock"     && p2 == "paper"   )  {p1Victory = false;}
    
    return p1Victory;
  }
}
