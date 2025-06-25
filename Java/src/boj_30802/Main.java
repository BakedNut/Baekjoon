package boj_30802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public int[] parseintAry(String[] stringAry) {
    int [] returnAry = new int[stringAry.length];
    for (int i = 0; i < stringAry.length; i++) {
      returnAry[i] = Integer.parseInt(stringAry[i]);
    }
    return returnAry;
  }

  public void run() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int Allpeople = Integer.parseInt(br.readLine());

    String [] inputsizeofp = br.readLine().split(" ");
    int [] sizeofp = parseintAry(inputsizeofp);

    String [] inputbundle = br.readLine().split(" ");
    int T = Integer.parseInt(inputbundle[0]);
    int P = Integer.parseInt(inputbundle[1]);

    int Tresult = 0;
    for (int i = 0; i < sizeofp.length; i++) {
      if ((sizeofp[i] % T) == 0) {
        Tresult += (sizeofp[i] / T);
      } else {
        Tresult += ((sizeofp[i] / T) + 1);
      }
    }

    int Presult_f = Allpeople / P;
    int Presult_s = Allpeople % P;

    System.out.println(Tresult);
    System.out.println(Presult_f + " " + Presult_s);
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
