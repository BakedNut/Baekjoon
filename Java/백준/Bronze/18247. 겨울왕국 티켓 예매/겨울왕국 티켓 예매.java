import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for(int i = 0; i < t; i++) {
      String inputNM = br.readLine();
      String[] parts = inputNM.split(" ");

      int n = Integer.parseInt(parts[0]);
      int m = Integer.parseInt(parts[1]);
      int num = 1;

      if (n < 12 || m < 4) {
        System.out.println("-1");
      } else {
        int seats[][] = new int[n][m];
        for (int j = 0; j < n; j++) {
          for (int k = 0; k < m; k++) {
            seats[j][k] = num++;
          }
        }
        System.out.println(seats[11][3]);
      }
    }
  }
}
