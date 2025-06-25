package boj_11718;

import java.io.*;
import java.util.*;

public class Main {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  List<String> list = new ArrayList<>();
  String input;

  public void IOprocess() throws IOException {
    while((input = br.readLine()) != null) {
      list.add(input);
    }
    for(String k : list) {
      System.out.println(k);
    }
  }

  public static void main(String[] Args) throws IOException {
    Main app = new Main();
    app.IOprocess();
  }
}
