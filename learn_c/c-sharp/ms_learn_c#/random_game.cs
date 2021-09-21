Random dice = new Random();

int roll1 = dice.Next(1, 7);
int roll2 = dice.Next(1, 7);
int roll3 = dice.Next(1, 7);

int total = roll1 + roll2 + roll3;

Console.WriteLine($"Dice roll: {roll1} + {roll2} + {roll3} = {total}");

if ((roll1 == roll2) || (roll2 == roll3) || (roll3 == roll1))
{
    Console.WriteLine("You rolled doubles! + 2 bouns to total");
    total += 2;
}

// || is OR, && is AND

if ((roll1 == roll2) && (roll2 == roll3))
{
    Console.WriteLine("Wow, You rolled triples! + 6 bouns to the total");
    total += 6;
}

if (total > 15)
{
    Console.WriteLine("You Win!");
}

if (total < 15)
{
    Console.WriteLine("Sorry, You Lose.");
}

/* Game Rule:
use the Random.Next() method to simulate rolling three 6-sided dice. We'll evaluate the values to calculate the score. If the score is greater than an arbitrary total, then we'll display a winning message to the user. Otherwise, we'll display a losing message to the user.

If any two dice you roll result in the same value, you get two bonus points for rolling doubles.
If all three dice you roll result in the same value, you get six bonus points for rolling triples.
If the sum of the three dice rolls, plus any point bonuses, is 15 or greater, you win the game. Otherwise, you lose.

*/