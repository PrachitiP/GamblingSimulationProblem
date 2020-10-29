import java.util.*;
public class UC2_WinOrLose
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
	}
}
