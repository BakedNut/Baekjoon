using System;

namespace boj_1000
{
    class Util
    {
        public static int findMax(Player[] players)
        {
            int maxScore = 0;
            int whoisMax = 0;

            for (int i = 0; i < players.Length; i++)
            {
                if (players[i].getScore() > maxScore)
                {
                    maxScore = players[i].getScore();
                    whoisMax = i;
                }
            }

            return whoisMax;
        }
    }
    class Player
    {
        private int Score;
        
        public Player(String s)
        {
            this.Score = 0;
            int[] input = Array.ConvertAll(s.Split(" "), int.Parse);
            
            foreach (int k in input)
            {
                Score += k;
            }
        }

        public int getScore()
        {
            return this.Score;
        }
    }
    class Program
    {
        static void Main()
        {
            Player[] players = new Player[5];

            for (int i = 0; i < players.Length; i++)
            {
                players[i] = new Player(Console.ReadLine());
            }

            int winner = Util.findMax(players);
            
            Console.WriteLine((winner + 1) + " " + players[winner].getScore());
        }
    }
}