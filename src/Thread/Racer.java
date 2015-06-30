package Thread;

public class Racer implements Runnable
{
	public static String victor;
	
	public void race() 
	{
		for(int distance=0; distance<=200; distance++)
		{
			if(distance==100&&Thread.currentThread().getName()!=null)
			{
				try
				{				
				System.out.println("Distance covered by " + Thread.currentThread().getName() + " is " + distance + "metres");
				Thread.sleep(5000);	
				}
				
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
				
			}
			//check whether race is complete and whether there's a winner
			boolean isRacewon = this.isRacewon(distance);
			//for thread that is not done executing
			if(isRacewon)
			break;
		}
	}
	
    //method assigned to boolean isRacewon above
	private boolean isRacewon(int totalDistance)
	{
		boolean isRacewon = false;
		if((Racer.victor==null)&&(totalDistance==200))
		{
			String winnerName = Thread.currentThread().getName();
			Racer.victor = winnerName;
			System.out.println("Winner is " + Racer.victor);
			isRacewon = true;
		}
		else if(Racer.victor == null)
			isRacewon = false;
		else if(Racer.victor != null)
			isRacewon = true;
		
		return isRacewon;
	}
	
	public void run()
	{
		this.race();
	}
}