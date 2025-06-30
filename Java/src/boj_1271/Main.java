package boj_1271;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class InputUtil {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static BigInteger[] toBigIntArr(String[] s) {
    BigInteger [] rtnArr = new BigInteger[s.length];
    for (int i = 0; i < s.length; i++) {
      rtnArr[i] = new BigInteger(s[i]);

    }
    return rtnArr;
  }
}

public class Main {
  public void run() throws IOException {
    String line = "";
    if ((line = InputUtil.readLine()) != null && !line.isEmpty()) {
      StringBuilder sb = new StringBuilder();
      BigInteger [] input = InputUtil.toBigIntArr(line.trim().split("\\s+"));

      BigInteger each = input[0].divide(input[1]);
      sb.append(each + "\n");

      BigInteger remain = input[0].mod(input[1]);
      sb.append(remain + "\n");

      System.out.print(sb.toString());
    }
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
