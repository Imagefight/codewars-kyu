import java.util.Arrays;

public class Greed{
  public static int greedy(int[] dice){
    return collapsePoints(dice);
  }
  
  private static int collapsePoints (int[] arr){
    int currentNumber = 0;
    int currentCounter = 0;
    int index = 0;
    int points = 0;
      
    Arrays.sort(arr);
    System.out.println("==============");
    for (int element : arr){
      index++;
      if (currentNumber == 0) {currentNumber = element;}
      if (element == currentNumber) {currentCounter++;}
      System.out.println("Current Element: " + element);
      if (element != currentNumber){
          switch (currentNumber){
              case (1):
                points += 100 * currentCounter;
                System.out.println("Added " + 100 * currentCounter + " Points.");
                break;
              case (5):
                points += 50 * currentCounter;
                System.out.println("Added " + 50 * currentCounter + " Points.");
                break;
              default:
                System.out.println("Broke at " + currentNumber + ". No Points.");
                break;
          }
        currentCounter = 1;
        currentNumber = element;
      }
      
      if ((index == arr.length) && (currentCounter % 3 != 0)){
        switch (element){
            case (5):
              System.out.println("End of Array (EOA), Added " + 50 * currentCounter + " Points.");
              points += 50 * currentCounter;
              break;
            case (1):
              System.out.println("End of Array (EOA), Added " + 100 * currentCounter + " Points.");
              points += 100 * currentCounter;
              break;
            default:
              break;
        }
      }
      
      if (currentCounter == 3){
        switch (currentNumber){
            case 1:
              points += 1000;
              System.out.println("Added " + 1000 + " Points.");
              currentCounter = 0;
              break;
            default:
              points += currentNumber * 100;
              System.out.println("Added " + currentNumber * 100 + " Points.");
              currentCounter = 0;
              break;
        }
      }
      
    }
    
    
    System.out.println("Total: " + points + " Points.");
    return points;
  }
} 
