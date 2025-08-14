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

  public boolean isPrime(int a) {
    if (a <= 1) {
      return false;
    }
    for (int i = 2; i < (int)Math.sqrt(a) + 1; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }

  public void run() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int ea = Integer.parseInt(br.readLine());

    String [] inputNums = br.readLine().split(" ");
    int [] Nums = parseintAry(inputNums);

    int count = 0;
    for (int i = 0; i < ea; i++) {
      if (isPrime(Nums[i])) {
        count++;
      }
    }

    System.out.println(count);
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}