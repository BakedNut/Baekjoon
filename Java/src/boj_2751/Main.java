package boj_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Util {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

}

public class Main {

  public void run() throws IOException {
    StringBuilder sb = new StringBuilder();
    int amount = Integer.parseInt(Util.readLine());

    int[] Narr = new int[amount];
    for (int i = 0; i < amount; i++) {
      Narr[i] = Integer.parseInt(Util.readLine());
    }

    Arrays.sort(Narr);

    for (int k : Narr) {
      sb.append(k + "\n");
    }

    System.out.print(sb);
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
