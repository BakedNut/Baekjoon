import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IOUtil {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static long readNum() throws IOException {
    return Long.parseLong(br.readLine());
  }
}

class LikeNum {
  private String likenum;
  private int div;
  private int sleep;

  public LikeNum() throws IOException {
    this.likenum = IOUtil.readLine();
    this.div = 20000303;

    for (int i = 0; i < this.likenum.length(); i++) {
      int digit = this.likenum.charAt(i) - '0';
      this.sleep = (this.sleep * 10 + digit) % this.div;
    }
  }

  public int sleep() {
    return sleep;
  }
}

public class Main {

  public void run() throws IOException {
    LikeNum ln = new LikeNum();
    System.out.println(ln.sleep());
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
