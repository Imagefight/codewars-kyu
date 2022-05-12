public class DRoot {
  public static int digital_root(int n) {
    String[] nStrArr = String.valueOf(n).split("");
       int[] nIntArr = new int[nStrArr.length];
         int sum = 0;

    for (int i = 0; i < nStrArr.length; i++) {nIntArr[i] = Integer.parseInt(nStrArr[i]);}
    for (int i = 0; i < nIntArr.length; i++) {sum += nIntArr[i];}
    
    System.out.println(n);
    System.out.println(String.valueOf(sum).length());
    System.out.println("sum = " + sum);
    
    if (String.valueOf(sum).length() > 1){
     sum = digital_root(sum);
    }
    return sum;
  }
}
