package boj_2953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Util {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static String readLine() throws IOException {
    return br.readLine();
  }

  public static int findMax(Player[] players) {
    int maxscore = 0;
    int whoismax = 0;
    for (int i = 0; i < players.length; i++) {
      int score = players[i].getScore();
      if (score > maxscore) {
        maxscore = score;
        whoismax = i;
      }
    }

    return whoismax;
  }
}

class Player {
  private int score;

  public Player(String s) {
    int[] input = Arrays.stream(s.split(" "))
        .mapToInt(Integer::parseInt).toArray();

    score = 0;
    for (int k : input) {
      score += k;
    }
  }

  public int getScore() {
    return score;
  }
}

public class Main {
  public void run() throws IOException {
    Player[] players = new Player[5];

    for (int i = 0; i < players.length; i++) {
      players[i] = new Player(Util.readLine());
    }

    int winner = Util.findMax(players);
    System.out.println((winner + 1) + " " + players[winner].getScore());
  }

  public static void main(String[] Args) throws IOException {
    new Main().run();
  }
}
