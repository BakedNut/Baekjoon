import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stck {
  int[] arr = new int[10000];
  int top = -1;

  public void push(int a) {
    arr[++top] = a;
  }

  public int pop() {
    if (top == -1) return -1;
    return arr[top--];
  }

  public int size() {
    return top + 1;
  }

  public int empty() {
    if (top == -1) return 1;
    else return 0;
  }

  public int top() {
    if (top == -1) return -1;
    return arr[top];
  }
}

public class Main {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    Stck stck = new Stck();
    StringBuilder sb = new StringBuilder();
    int repeat = Integer.parseInt(br.readLine());

    for (int i = 0; i < repeat; i++) {
      String input = br.readLine();
      String[] cmd = input.split(" ");

      if (cmd[0].equals("push")) {
        stck.push(Integer.parseInt(cmd[1]));
      } else if (cmd[0].equals("pop")) {
        sb.append(stck.pop()).append("\n");
      } else if (cmd[0].equals("size")) {
        sb.append(stck.size()).append("\n");
      } else if (cmd[0].equals("empty")) {
        sb.append(stck.empty()).append("\n");
      } else if (cmd[0].equals("top")) {
        sb.append(stck.top()).append("\n");
      }
    }
    System.out.println(sb);
  }
}
