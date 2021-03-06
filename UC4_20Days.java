public class GamblingSimulationProblem 
{
	
	public static final int STAKE = 100;
	public static final int BET = 1;
	public static final int Total_Days = 20;
	
	public static int totalWin = 0;
	public static int totalLoss = 0;

	private static int checkWinOrLose () 
  {
		return (int) Math.floor(Math.random() * 10) % 2;
	}
	
	private static int checkResign(int initialStake, int totalAmount)
  {
		double winResignAmount = 1.5 * initialStake;
		double lossResignAmount = 0.5 * initialStake;
		if ( totalAmount >= winResignAmount || totalAmount <= lossResignAmount)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args)
  {
		// TODO Auto-generated method stub
		System.out.println(" ***** Welcome to Gambling Simulation Problem ***** ");
		int totalAmount = STAKE;
		int dailyWin = 0;
		int dailyLoss = 0;
		for (int day = 1; day <= Total_Days; day++)
    {
			while (checkResign(STAKE, totalAmount) != 1)
      {
				if (checkWinOrLose() == 1)
        {
					totalAmount += BET;
					dailyWin += BET;
				}
				else {
					totalAmount -= BET;
					dailyLoss += BET;
				}
			}
			totalWin += dailyWin;
			totalLoss += dailyLoss;
		}
	System.out.println("After 20 days -> Total Win amount: " + totalWin);	
	System.out.println("After 20 days -> Total Loos amount: " + totalLoss);	
	}
}
