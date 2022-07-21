import java.util.*;

public class Josephus {
  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
      List<T> result = new ArrayList<T>();
      int index = 0;
      
      List<Integer> people = new ArrayList<Integer>(items.size());
      for(int i = 0;i < items.size();i++){
          people.add(i);
      }
      
      while(people.size() > 0){
          index = (index + k - 1) % people.size();
          result.add(items.get(people.get(index)));
          people.remove(index);
      }
    
    return result;
  }
}
