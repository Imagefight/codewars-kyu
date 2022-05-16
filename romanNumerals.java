import java.util.*;
public class Conversion {
    
    // Take in a number and output the Roman Numeral Equivalent
    // The Input will always be a number
    // The Input will never be negative
    
    /*
     * Numeral Values:
     * Symbol    Value
     * I          1
     * V          5
     * X          10
     * L          50
     * C          100
     * D          500
     * M          1,000
     */
  
    public String solution(int n) {
        // Initialize the String for the Numerals
        String numeral;
      
        // Make "I"s for every number.
        numeral = "I".repeat(n)
        // Step through the "I"s and convert them to their Higher tier letter.
          .replace("IIIII", "V")
          .replace("IIII", "IV")
         
        // Replace the Vs with X
          .replace("VV",    "X")
          .replace("VIV",  "IX")
        // Replace the X with Ls
          .replace("XXXXX", "L")
          .replace("XXXX", "XL")
        // Replace the L with Cs
          .replace("LL",    "C")
          .replace("LXL",  "XC")
        // Replace the C with Ds
          .replace("CCCCC", "D")
          .replace("CCCC", "CD")
        // Replace the D with Ms
          .replace("DD",    "M")
          .replace("DCD",  "CM");
    
      
        // Output the solution 
        return numeral;
    }
}
