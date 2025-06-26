package boj_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Title {
  long cC;

  public Title(int n) {
    long ct = 0;
    long num = 666;

    while (ct < n) {
      if (String.valueOf(num).contains("666")) {
        ct++;
        if (ct == n) {
          this.cC = num;
          break;
        }
      }
      num++;
    }
  }

  public long getTitle() {
    return this.cC;
  }
}

public class Main {
  public void run() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int series = Integer.parseInt(br.readLine());

    Title t = new Title(series);

    System.out.println(t.getTitle());
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
