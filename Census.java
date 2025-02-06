/*write a program to display the population for each next five tears. assume the current population is 312032486 and one year has 365 days.
birth in 7 sec
death in 13 sec
immigrant in 45 sec*/

class Census
{
	public static void main(String[] args)
	{
		long cp = 312032486l;
		final long sec = (365*24*60*60)*5;//final is declared data as const
		
		System.out.println("Current population = "+cp);

		long birth = sec/7;
		long death = sec/13;
		long immigrant = sec/45;
 
		long np = cp+birth-death+immigrant;
		System.out.println("New Population after 5 years = "+np);
	}
}