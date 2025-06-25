package boj_4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;

public class Main {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  boolean loop = true;
  ArrayList<String> output = new ArrayList<String>();

  public void process() throws IOException {
    String input = br.readLine();
    String parts[] = input.split(" ");
    int[] num = new int[parts.length];
    for (int i = 0; i < parts.length; i++) {
      num[i] = Integer.parseInt(parts[i]);
    }
    if (num[0] == 0 && num[1] == 0 && num[2] == 0) {
      loop = false;
      return;
    }

    int a = num[0]; int b = num[1]; int c = num[2];

    if (a > b && a > c) {
      int temp = a; a = c; c = temp;
    } else if (b > a && b > c) {
      int temp = b; b = c; c = temp;
    }

    if (c * c == a * a + b * b) {
      output.add("right");
    } else {
      output.add("wrong");
    }
  }

  public static void main(String[] Args) throws IOException {
    Main app = new Main();
    while(app.loop) {
      app.process();
    }
    for (String result : app.output) {
      System.out.println(result);
    }
  }
}
