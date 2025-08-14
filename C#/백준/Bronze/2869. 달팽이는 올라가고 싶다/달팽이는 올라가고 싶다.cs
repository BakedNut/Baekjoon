using System;

namespace boj_2869
{
    class Util
    {
        public static int Calc(int A, int B, int V)
        {
            int result = (int)Math.Ceiling((double)(V - B) / (A - B));
            return result;
        }

        public static int[] trans(string s)
        {
            int[] input = Array.ConvertAll(s.Split(" "), int.Parse);
            return input;
        }
    }
    class Program
    {
        static void Main()
        {
            int[] input = Util.trans(Console.ReadLine());
            int result = Util.Calc(input[0], input[1], input[2]);
            
            Console.WriteLine(result);
        }
    }
}