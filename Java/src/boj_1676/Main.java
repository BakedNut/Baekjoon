package boj_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Util {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static int cal(int n) {
    int count = 0;
    while (n >= 5) {
      count += n / 5;
      n /= 5;
    }

    return count;
  }

}

public class Main {

  public void run() throws IOException {
    StringBuilder sb = new StringBuilder();

    String line;
    if ((line = Util.readLine()) == null) {
      return;
    }

    sb.append(Util.cal(Integer.parseInt(line)));
    System.out.print(sb);
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
