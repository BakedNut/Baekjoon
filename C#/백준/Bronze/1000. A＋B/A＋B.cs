using System;

namespace _1000
{
    class Util
    {
        public static int Sum(int a, int b)
        {
            return a + b;
        }

        public static int[] intArr(String[] s)
        {
            int[] changeArr = Array.ConvertAll(s, int.Parse);
            return changeArr;
        }
    }
    
    class Program
    {
        static void Main()
        {
            int[] num = Util.intArr(Console.ReadLine().Split(" "));
            int sum = Util.Sum(num[0], num[1]);
            
            Console.WriteLine(sum);
        }
    }
}