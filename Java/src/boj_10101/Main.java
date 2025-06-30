package boj_10101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IOUtil {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }
}

class Triangle {
  private int A;
  private int B;
  private int C;

  public Triangle(int a, int b, int c) {
    this.A = a;
    this.B = b;
    this.C = c;
  }

  public String whatisT() {
    if ((this.A + this.B + this.C) != 180) {
      return "Error";
    } else if ((this.A != this.B) && (this.B != this.C) && (this.C != this.A)) {
      return "Scalene";
    } else if ((this.A == 60) && (this.B == 60) && (this.C == 60)) {
      return "Equilateral";
    } else {
      return "Isosceles";
    }
  }
}

public class Main {
  public void run() throws IOException {
    int A = Integer.parseInt(IOUtil.readLine());
    int B = Integer.parseInt(IOUtil.readLine());
    int C = Integer.parseInt(IOUtil.readLine());
    Triangle T = new Triangle(A, B, C);

    StringBuilder sb = new StringBuilder();
    sb.append(T.whatisT());

    System.out.println(sb.toString());
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
