import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String input;
  String[] parts = new String[2];
  int leftcount, rightcount;

  public void InputProcess() throws IOException {
    input = br.readLine();
    parts = input.split("\\(\\^0\\^\\)");
    if (parts.length < 2) {
      parts = new String[] { parts[0], "" };
    }
  }

  public void countandoutput() {
    for(int i = 0; i < 2; i++) {
      for(char c : parts[i].toCharArray()) {
        if (c == '@' && i == 0) leftcount++;
        else if (c == '@' && i == 1) rightcount++;
      }
    }
    System.out.println(leftcount + " " + rightcount);
  }

  public void run() throws IOException {
    InputProcess();
    countandoutput();
  }

  public static void main(String[] Args) throws IOException {
    Main app = new Main();
    app.run();
  }
}
