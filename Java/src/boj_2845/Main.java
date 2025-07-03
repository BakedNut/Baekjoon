package boj_2845;

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

class News {
  private int people;

  public News(int [] a) {
    people = a[0] * a[1];
  }

  public int dif(int co, int sub) {
    int res = sub - people;
    return res;
  }
}

public class Main {

  public void run() throws IOException {
    StringBuilder sb = new StringBuilder();
    int [] input_F = Arrays.stream(Util.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    News news = new News(input_F);

    int [] input_S = Arrays.stream(Util.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for (int i = 0; i < input_S.length; i++) {
      sb.append(news.dif(i, input_S[i]));
      if (i < 4) {
        sb.append(" ");
      }
    }

    System.out.println(sb.toString());
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
