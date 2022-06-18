public class Maskify {
    public static String maskify(String str) {
      String[] splitStr = str.split("");
      for (int i = 0; i < splitStr.length - 4; i++){
        splitStr[i] = "#";
      }
      return String.join("", splitStr);
    }
}
