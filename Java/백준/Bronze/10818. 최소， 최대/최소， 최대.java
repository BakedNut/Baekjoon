import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

class Util {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static int[] parseIntArr(String s) {
    int[] rtn = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    return rtn;
  }
}

public class Main {
  public static void main(String[] Args) throws IOException {
    StringBuilder sb = new StringBuilder();

    int amount = Integer.parseInt(Util.readLine());
    int[] arr = Util.parseIntArr(Util.readLine());

    OptionalInt max = Arrays.stream(arr).max();
    OptionalInt min = Arrays.stream(arr).min();

    System.out.println(min.getAsInt() + " " + max.getAsInt());
  }
}
