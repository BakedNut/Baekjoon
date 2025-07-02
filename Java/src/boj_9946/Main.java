package boj_9946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Util {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static boolean check(String f_line, String s_line) throws IOException {
    String [] f_line_arr = f_line.split("");
    String [] s_line_arr = s_line.split("");

    if (f_line_arr.length != s_line_arr.length) {
      return false;
    }

    Arrays.sort(f_line_arr);
    ArrayList<String> f_arrl = new ArrayList<>(Arrays.asList(f_line_arr));

    for (int i = 0; i < s_line_arr.length; i++) {
      if (Collections.binarySearch(f_arrl, s_line_arr[i]) >= 0) {
        f_arrl.remove(String.valueOf(s_line_arr[i]));
      } else {
        return false;
      }
    }

    return true;
  }
}

public class Main {

  public void run() throws IOException {
    StringBuilder sb = new StringBuilder();
    String f_line;
    String s_line;

    int cs = 0;
    while (true) {
      f_line = Util.readLine();
      s_line = Util.readLine();

      if (f_line.equals("END") && s_line.equals("END")) {
        break;
      }

      if (Util.check(f_line, s_line)) {
        sb.append("Case " + ++cs + ": " + "same\n");
      } else {
        sb.append("Case " + ++cs + ": " + "different\n");
      }
    }

    System.out.print(sb.toString());
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
