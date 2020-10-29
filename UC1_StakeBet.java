import java.util.*;
public class UC1_StakeBet
{
	public static void main(String[] args)
	{

		System.out.println("Welcome to Gambling Simulation Problem");
		int stake = 100;
		int bet = 1;
		System.out.println("Stake: " + stake + "\nBet: " + bet);
	Random random = new Random();
		int check = random.nextInt(2);
		if (check == 1)
			System.out.println("WIN");
		else
			System.out.println("LOOSE");
	}
}
	
