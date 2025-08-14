import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputUtil {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }
}

class Cards {
  int [] table;

  public Cards() throws IOException {
    this.table = new Main().parseintAry(InputUtil.readLine().split(" "));
  }
}

public class Main {
  public int[] parseintAry(String[] s) {
    int [] returnAry = new int[s.length];
    for (int i = 0; i < s.length; i++) {
      returnAry[i] = Integer.parseInt(s[i]);
    }
    return returnAry;
  }

  public void run() throws IOException {
    int [] inputNums = parseintAry(InputUtil.readLine().split(" "));

    Cards cd = new Cards();

    int maxSum = 0;
    for (int i = 0; i < cd.table.length; i++) {
      for (int k = i+1; k < cd.table.length; k++) {
        for (int m = k+1; m < cd.table.length; m++) {
          int sum = cd.table[i] + cd.table[k] + cd.table[m];
          if (sum > maxSum && sum <= inputNums[1]) {
            maxSum = sum;
          }
        }
      }
    }

    System.out.println(maxSum);
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
