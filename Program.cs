using System;

namespace DotNetProject
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Check if number is Even or Odd:\n");
            int num = 10;

            if (num % 2 == 0)
            {
                Console.WriteLine(num + " is an Even number.");
            }
            else
            {
                Console.WriteLine(num + " is an Odd number.");
            }

           
        }
    }
}
