import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public int whereNumber(int findNum) {
    int whereNum = 1;
    int count = 1;
    while (whereNum < findNum) {
      whereNum = whereNum + (count * 6);
      count++;
    }
    return count;
  }

  public void run() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int findNum = Integer.parseInt(br.readLine());

    System.out.println(whereNumber(findNum));
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}