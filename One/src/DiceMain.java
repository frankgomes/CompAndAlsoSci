/*
  author: Frank Gomes
  lab: 1. Dice Lab
  date: 18-06-19
  extra: Dice defaults to 6 sides if no sides are specified
 */

public class DiceMain {
    public static void main(String[] args) {
        Dice d = new Dice();
        Dice d2 = new Dice();
        // Rolls 2 dice ten times
        int totalSum = 0, sum, roll1, roll2;
        for (int i = 0; i < 10; i++)
        {
            roll1 = d.roll();
            roll2 = d2.roll();
            sum = roll1 + roll2;
            System.out.println("Roll 1: " + roll1 + "\nRoll 2: " + roll2 + "\nSum: " + sum);
        }
        // Rolls 1000 times
        int twelves = 0;
        for (int i = 0; i < 1000; i++) {
            sum = d.roll() + d2.roll();
            if (sum == 12)
                twelves++;
            totalSum += sum;
        }
        // Outputs sum
        System.out.println("-----------\nSum: " + totalSum + "\nTwelves: " + twelves);
        // Rolls for doubles
        int rollsNeeded = 0;
        do {
            roll1 = d.roll();
            roll2 = d.roll();
            ++rollsNeeded;
        } while (roll1 == roll2);
        System.out.println("-----------\nDoubles: " + roll1 + "\nRolls needed: " + rollsNeeded);
        // Do-while is good because it rolls first and checks if it needs to roll again afterwards
        // Rolls 5-sided and 17-sided dice
        System.out.println("17-sided die: " + d.roll(17));
        System.out.println(d.toString());
        System.out.println("5-sided die: " + d.roll(5));
        System.out.println(d.toString());
        // Rolls dice 10,000 times
        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0, sevens = 0, eights = 0, nines = 0, tens = 0, elevens = 0;
        twelves = 0;
        for (int i = 0; i < 10000; i++) {
            sum = d.roll() + d.roll();
            // Checks the sum and increments each variable for each sum
            switch (sum) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
                case 7:
                    sevens++;
                    break;
                case 8:
                    eights++;
                    break;
                case 9:
                    nines++;
                    break;
                case 10:
                    tens++;
                    break;
                case 11:
                    elevens++;
                    break;
                case 12:
                    twelves++;
                    break;
            }
        }
        System.out.println("Ones: " + ones + ", twos: " + twos + ", threes: " + threes + ", fours: " + fours + ", fives: " + fives + ", sixes: " + sixes + ", sevens: " + sevens + ", eights: " + eights + ", nines: " + nines + ", tens: " + tens + ", elevens: " + elevens + ", twelves: " + twelves);
    }
}
