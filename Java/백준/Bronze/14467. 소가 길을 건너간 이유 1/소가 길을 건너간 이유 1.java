import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cow {
  private int pos;
  private int count;
  private boolean isFirst;

  public Cow() {
    this.pos = 0;
    this.count = 0;
    this.isFirst = true;
  }

  public void changpos(int x) {
    if (this.isFirst == true) {
      this.pos = x;
      this.isFirst = false;
    } else if (this.pos != x) {
      this.pos = x;
      this.count++;
    }
  }

  public int count() {
    return this.count;
  }
}

class IOUtil {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }
  
  public static int[] parseIntArr(String[] s) {
    int [] rtnArr = new int[s.length];
    for (int i = 0; i < s.length; i++) {
      rtnArr[i] = Integer.parseInt(s[i]);
    }
    return rtnArr;
  }
}

public class Main {
  public void run() throws IOException {
    int observe = Integer.parseInt(IOUtil.readLine());

    Cow [] cows = new Cow[10];
    for (int i = 0; i < cows.length; i++) {
      cows[i] = new Cow();
    }
    
    int [] input;
    for (int i = 0; i < observe; i++) {
      input = IOUtil.parseIntArr(IOUtil.readLine().split(" "));
      cows[input[0] - 1].changpos(input[1]);
    }
    
    int count = 0;
    for (int i = 0; i < cows.length; i++) {
      count += cows[i].count();
    }

    System.out.println(count);
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
