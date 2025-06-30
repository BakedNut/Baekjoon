package boj_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class InputUtil {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static int[] parseintArr(String[] s) {
    int [] rtArr = new int[s.length];
    for (int i = 0; i < s.length; i++) {
      rtArr[i] = Integer.parseInt(s[i]);
    }
    return rtArr;
  }
}

public class Main {
  public void run() throws IOException {
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(InputUtil.readLine());
    int [] Narr = InputUtil.parseintArr(InputUtil.readLine().split(" "));
    Arrays.sort(Narr);

    int M = Integer.parseInt(InputUtil.readLine());
    int [] Marr = InputUtil.parseintArr(InputUtil.readLine().split(" "));

    for (int i : Marr) {
      if (Arrays.binarySearch(Narr, i) >= 0) {
        sb.append("1\n");
      } else {
        sb.append("0\n");
      }
    }

    System.out.println(sb.toString());
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
