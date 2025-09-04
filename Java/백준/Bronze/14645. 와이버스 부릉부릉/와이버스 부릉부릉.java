import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Bus {
  private int pass;
  private int people;

  public Bus(int pass, int people) {
    this.pass = pass;
    this.people = people;
  }

  public void pullover(int in, int out) {
    this.people += in;
    this.people -= out;
  }

  public int pass() {
    return pass;
  }
}

class IOUtil {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static int [] readNums() throws IOException {
    return Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();
  }
}

public class Main {
  public void run() throws IOException {
    int[] input = IOUtil.readNums();
    Bus bus = new Bus(input[0], input[1]);

    for (int i = 0; i < bus.pass(); i++) {
      input = IOUtil.readNums();
      bus.pullover(input[0], input[1]);
    }

    System.out.println("비와이");
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
