import java.util.*;
class Guess
{
	public void guessGame()
	{
		
		Scanner sc=new Scanner(System.in);
	    int val = 1 + (int)(100 * Math.random());
		System.out.println("Already Random number is generated.");
		int c=5;
		System.out.println("Guess the number in 5 trials");
		int scr=100,chance=1;
		for(chance=1;chance<=c;chance++)
		{
			
			System.out.println("Guess the number Enter it.Chance no"+(chance));
			int n=sc.nextInt();
			if(n==val)
			{
				System.out.println("Congrats!...You won it");
				System.out.println("Your score is "+scr);
				break;
			}
			else if(n>val)
			{
				System.out.println("Number is less than "+n);
				
				scr-=20;
			}
			else
			{
				System.out.println("Number is greater than "+n);
				scr-=20;
			}
			
		} 
		if(chance>c)
		{
		    System.out.println("You Lost it");
			System.out.println("The number is "+val);
			System.out.println("Your score is: 0");
		}
	}
}
class NumberGame
{
    public static void main(String args[])
    {
    	
    	Scanner sc=new Scanner(System.in);
    	Guess g=new Guess();
    	System.out.println("Shall we start it ? : Yes/No");
    	String str=sc.nextLine();
    	while(str.equalsIgnoreCase("Yes")||str.equalsIgnoreCase("y"))
    	{
    		g.guessGame();
    		System.out.println("Wants to play again ? Yes/No");
    		str=sc.nextLine();
    	}
    	System.out.println("Game Over!");
    }
}