package boj_14626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public int[] parseintAry(String[] s) {
    int [] returnAry = new int[s.length];
    for (int i = 0; i < s.length; i++) {
      returnAry[i] = Integer.parseInt(s[i]);
    }
    return returnAry;
  }

  public void run() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String [] input = br.readLine().split("");

    int sumofNum = 0;
    int whereStar = 0;
    for (int i = 0; i < input.length; i++) {
      if (!input[i].equals("*")) {
        if (i % 2 == 0) {
          sumofNum += Integer.parseInt(input[i]);
        } else {
          sumofNum += Integer.parseInt(input[i]) * 3;
        }
      } else {
        whereStar = i;
      }
    }

    int foundNum = 0;
    for (int i = 0; i < 10; i++) {
      int currentSum = sumofNum;

      if (whereStar % 2 == 0) {
        currentSum += i;
      } else {
        currentSum += i * 3;
      }

      if (currentSum % 10 == 0) {
        foundNum = i;
        break;
      }
    }

    System.out.println(foundNum);
  }

  public static void main(String[] Args) throws IOException {
  new Main().run();
  }
}
