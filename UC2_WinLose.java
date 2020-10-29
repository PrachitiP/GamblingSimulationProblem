import java.util.Random;

public class UC2_WinLose
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int check = random.nextInt(2);
		if (check == 1)
			System.out.println("WIN");
		else
			System.out.println("LOOSE");
	}
}
