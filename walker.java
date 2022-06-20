ublic class TenMinWalk {
  public static boolean isValid(char[] walk) {
    // If the walk isn't ten minutes at all, don't bother.
    if (walk.length < 10 || walk.length > 10) {return false;}
    /* Assign the directions n/s/w/e to number values
     * Make int Longitude and Latitude and depending on the commands
     * Increment and decrement these integers
     * At the end of reading the array, if these integers do not both equal zero,
     * return false
     */
    
    // Counters for movement
    int latitude = 0;
    int longitude = 0;
    
    // Depending on the movement, increment the counters
    for (char direction : walk){
      switch (direction){
          // Along the Longitude line
          case ('n'):
            longitude++;
            break;
          case ('s'):
            longitude--;
            break;
          // Along the Latitude line
          case ('e'):
            latitude++;
            break;
          case ('w'):
            latitude--;
            break;
          // It said not to code for edge cases, but why not, right?
          default:
            break;
          
          // It would be very embarassing if i got latitude-longitude mixed up
          // No I will not proofread this
      }
    }
    // If the guy is not back at home base, return false
    if (latitude != 0 || longitude != 0) {return false;}
    
    // Return true
    return true;
  }
}
