using System;

namespace boj_10773;

class Program
{
    static void Main(string[] args)
    {
        List<int> Led = new List<int>();

        int count = int.Parse(Console.ReadLine());

        for (int i = 0; i < count; i++)
        {
            int input = int.Parse(Console.ReadLine());

            if (input == 0)
            {
                Led.RemoveAt(Led.Count - 1);
            }
            else
            {
                Led.Add(input);
            }
        }

        int result = 0;
        foreach (int item in Led)
        {
            result += item;
        }
        
        Console.WriteLine(result);
    }
}