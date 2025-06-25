package boj_1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main (String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String[] parts = input.split(" ");

    int a = Integer.parseInt(parts[0]);
    int b = Integer.parseInt(parts[1]);

    System.out.println(a + b);
  }
}
