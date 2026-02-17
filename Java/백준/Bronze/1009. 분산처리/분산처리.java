import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static int solve(int a, int b) {
    int result = 1;

    for (int i = 0; i < b; i++) {
      result = (result * a) % 10;
    }

    if (result == 0) {
      return 10;
    } else {
      return result;
    }
  }

  public static void main(String[] args) throws IOException {
    int cases = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int[] list = new int[cases];

    for (int i = 0; i < cases; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      list[i] = solve(a, b);
    }

    for (int k : list) {
      System.out.println(k);
    }
  }
}
