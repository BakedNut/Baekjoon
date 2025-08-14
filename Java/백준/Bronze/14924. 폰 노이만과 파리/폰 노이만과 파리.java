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

class Character {
  private int TrainSpeed;
  private int FireflySpeed;
  private int Distance;

  public Character(int S, int T, int D) {
    this.TrainSpeed = S;
    this.FireflySpeed = T;
    this.Distance = D;
  }

  public int getData(int n) {
    if (n == 0) {
      return this.TrainSpeed;
    } else if (n == 1) {
      return this.FireflySpeed;
    } else if (n == 2) {
      return this.Distance;
    }

    return 0;
  }
}

public class Main {
  public void run() throws IOException {
    int[] input = Arrays.stream(Util.readLine().split(" "))
                  .mapToInt(Integer::parseInt)
                  .toArray();

    Character Chr = new Character(input[0], input[1], input[2]);

    int Time = Chr.getData(2) / (Chr.getData(0) * 2);
    int Fdist = Time * Chr.getData(1);

    System.out.println(Fdist);
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
