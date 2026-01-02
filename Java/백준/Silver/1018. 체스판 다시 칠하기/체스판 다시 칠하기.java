import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    char[][] board = new char[N][M];

    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      board[i] = line.toCharArray();
    }

    int answer = Integer.MAX_VALUE;

    for (int i = 0; i <= N - 8; i++) {
      for (int j = 0; j <= M - 8; j++) {
        int repaintW = 0;
        int repaintB = 0;

        for (int x = 0; x < 8; x++) {
          for (int y = 0; y < 8; y++) {
            char current = board[i + x][j + y];

            if ((x + y) % 2 == 0) {
              if (current != 'W') repaintW++;
              if (current != 'B') repaintB++;
            } else {
              if (current != 'B') repaintW++;
              if (current != 'W') repaintB++;
            }
          }
        }

        int repaint = Math.min(repaintW, repaintB);
        answer = Math.min(answer, repaint);
      }
    }

    System.out.println(answer);
  }
}
